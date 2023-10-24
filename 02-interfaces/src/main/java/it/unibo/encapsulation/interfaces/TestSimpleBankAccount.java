package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }
    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        AccountHolder user1 = new AccountHolder("Andrea", "Rossi", 1);
        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        AccountHolder user2 = new AccountHolder("Alex", "Bianchi", 2);
        // 3) Creare i due SimpleBankAccount corrispondenti
        SimpleBankAccount acc1 = new SimpleBankAccount(user1.getUserID(), 5000);
        SimpleBankAccount acc2 = new SimpleBankAccount(user2.getUserID(), 10000);

        // 4) Effettuare una serie di depositi e prelievi
        
        acc1.deposit(1,200);
        acc1.withdrawFromATM(1, 1500);

        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */

        // 6) Provare a prelevare fornendo un id utente sbagliato

        // 7) Controllare nuovamente l'ammontare
    }
}
