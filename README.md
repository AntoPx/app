# Stack App

Questo progetto comprende una serie di applicazioni e configurazioni per gestire un'applicazione full stack. La struttura della repository è organizzata in vari componenti che coprono sia il front-end che il back-end, nonché differenti soluzioni di database.

## Struttura della Repository

- **Stack-app-db**: Contiene i file necessari per la configurazione del database.
- **stack-app-H2**: Include configurazioni e script per l'utilizzo del database H2.
- **stack-app-MySQL**: Include configurazioni e script per l'utilizzo del database MySQL.
- **stack-app-front-end**: Contiene il codice del front-end dell'applicazione.
- **stack-app**: Directory principale con configurazioni generali e script per il progetto.

## Requisiti

- Java (versione X)
- Node.js (versione Y)
- MySQL (per l'utilizzo del database MySQL)
- Altri strumenti specifici come indicato nei file di configurazione all'interno delle rispettive directory

## Istruzioni per l'Installazione

1. **Configurare il Database**:
   - Se si utilizza H2, seguire le istruzioni in `stack-app-H2`.
   - Se si utilizza MySQL, seguire le istruzioni in `stack-app-MySQL`.

2. **Installare le Dipendenze**:
   - Navigare nella directory `stack-app-front-end` e eseguire `npm install` per installare le dipendenze del front-end.

3. **Configurazione**:
   - Configurare i file di configurazione necessari all'interno delle directory `stack-app-H2` o `stack-app-MySQL` a seconda del database scelto.

4. **Esecuzione dell'Applicazione**:
   - Eseguire il server del database.
   - Avviare il server back-end (indicazioni nella directory principale `stack-app`).
   - Avviare il front-end (indicazioni nella directory `stack-app-front-end`).

## Licenza

Questo progetto è rilasciato sotto la licenza MIT. Per maggiori dettagli, fare riferimento al file LICENSE nel repository.
