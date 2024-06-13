    package com.example.stack_app.controller;

    import com.example.stack_app.exception.ResourceNotFoundException;
    import com.example.stack_app.model.Stack;
    import com.example.stack_app.repository.StackRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("/api/stacks")
    public class StackController {

        @Autowired
        private StackRepository stackRepository;

        @GetMapping
        public List<Stack> getAllStacks() {
            return stackRepository.findAll();
        }

        @GetMapping("/{id}")
        public ResponseEntity<Stack> getStackById(@PathVariable Long id) {
            Stack stack = stackRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Stack not found with id " + id));
            return ResponseEntity.ok(stack);
        }

        @PostMapping
        public Stack createStack(@RequestBody Stack stack) {
            return stackRepository.save(stack);
        }

        @PutMapping("/{id}")
        public ResponseEntity<Stack> updateStack(@PathVariable Long id, @RequestBody Stack stackDetails) {
            Stack stack = stackRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Stack not found with id " + id));

            stack.setStackValue(stackDetails.getStackValue());
            Stack updatedStack = stackRepository.save(stack);
            return ResponseEntity.ok(updatedStack);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteStack(@PathVariable Long id) {
            Stack stack = stackRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Stack not found with id " + id));

            stackRepository.delete(stack);
            return ResponseEntity.noContent().build();
        }
    }

