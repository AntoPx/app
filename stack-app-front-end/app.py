from flask import Flask, render_template, request, redirect, url_for
import requests

app = Flask(__name__)

# URL del tuo backend Spring Boot
API_URL = "http://localhost:8080/api/stacks"

@app.route('/')
def index():
    # Fetch all stacks from the backend
    response = requests.get(API_URL)
    stacks = response.json()
    return render_template('index.html', stacks=stacks)

@app.route('/create', methods=['POST'])
def create_stack():
    # Create a new stack in the backend
    stack_value = request.form.get('stackValue')
    new_stack = {"stackValue": stack_value}
    response = requests.post(API_URL, json=new_stack)
    return redirect(url_for('index'))
    
@app.route('/delete/<int:stack_id>', methods=['POST'])
def delete_stack(stack_id):
    # Delete the stack from the backend
    response = requests.delete(f"{API_URL}/{stack_id}")
    return redirect(url_for('index'))

@app.route('/update/<int:stack_id>', methods=['POST'])
def update_stack(stack_id):
    # Update the stack in the backend
    stack_value = request.form.get('stackValue')
    updated_stack = {"stackValue": stack_value}
    response = requests.put(f"{API_URL}/{stack_id}", json=updated_stack)
    return redirect(url_for('index'))

if __name__ == '__main__':
    app.run(debug=True)
