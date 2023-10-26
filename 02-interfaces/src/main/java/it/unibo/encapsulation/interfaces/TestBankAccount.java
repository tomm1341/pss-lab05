package it.unibo.encapsulation.interfaces;

public class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
         */
        /*
         * 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
         */

        final AccountHolder user1 = new AccountHolder("Andrea", "Rossi", 1);
        final AccountHolder user2 = new AccountHolder("Alex", "Bianchi", 2);

        /*
         * 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
         * Bianchi (ammontare iniziale = 0)
         */

        BankAccount acc1 = new SimpleBankAccount(user1.getUserID(), 0);
        BankAccount acc2 = new StrictBankAccount(user2.getUserID(), 0);

        /*
         * 4) Prima riflessione: perché è stato possibile fare la new di due classi
         * diverse in variabili dello stesso tipo?
         */

        //Perché l'interfaccia BankAccount è stata creata apposta per riassumere il contratto di utilizzo
        //di entrambi le classi SimpleBankAccount e StrictBankAccount

        /*
         * 5) Depositare €10000 in entrambi i conti
         */

        acc1.deposit(user1.getUserID(), 10000);
        acc2.deposit(user2.getUserID(), 10000);

        /*
         * 6) Prelevare €15000$ da entrambi i conti
         */

        acc1.withdraw(user1.getUserID(), 15000);
        acc2.withdraw(user2.getUserID(), 15000);

        /*
         * 7) Stampare in stdout l'ammontare corrente
         */

        System.out.println("[User 1]: " + user1.getName() + " " + user1.getSurname() + " current balance: " + acc1.getBalance());
        System.out.println("[User 2]: " + user2.getName() + " " + user2.getSurname() + " current balance: " + acc2.getBalance());

        /*
         * 8) Qual è il risultato e perché?
         */
        /*
         * 9) Depositare nuovamente €10000 in entrambi i conti
         */
        /*
         * 10) Invocare il metodo computeManagementFees su entrambi i conti
         */
        /*
         * 11) Stampare a video l'ammontare corrente
         */
        /*
         * 12) Qual è il risultato e perché?
         */
    }
}
