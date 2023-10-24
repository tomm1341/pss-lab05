package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }
    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        final AccountHolder user1 = new AccountHolder("Andrea", "Rossi", 1);
        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        final AccountHolder user2 = new AccountHolder("Alex", "Bianchi", 2);
        // 3) Creare i due SimpleBankAccount corrispondenti
        final SimpleBankAccount acc1 = new SimpleBankAccount(user1.getUserID(), 5000);
        final SimpleBankAccount acc2 = new SimpleBankAccount(user2.getUserID(), 10000);

        // 4) Effettuare una serie di depositi e prelievi
        
        acc1.deposit(1,200);
        acc1.withdrawFromATM(1, 1500);
        acc1.depositFromATM(1, 400);
        acc1.withdraw(1, 10000);
        //acc1.withdraw(2, 100);
        
        acc2.deposit(2,500);
        acc2.withdrawFromATM(2, 1500);
        acc2.depositFromATM(2, 400);
       // acc2.withdraw(1, 10000);
        acc2.withdraw(2, 5000);
        

        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */
        System.out.println("Gentile "+user1.getName()+" "+user1.getSurname()+", il suo saldo attuale ammonta a: " + acc1.getBalance());
        System.out.println("Gentile "+user2.getName()+" "+user2.getSurname()+", il suo saldo attuale ammonta a: "+acc2.getBalance());

        // 6) Provare a prelevare fornendo un id utente sbagliato
        acc1.withdraw(2, 100);
        acc2.withdraw(1, 10000);

        // 7) Controllare nuovamente l'ammontare
        System.out.println("Gentile "+user1.getName()+" "+user1.getSurname()+", il suo saldo attuale ammonta a: "+acc1.getBalance());
        System.out.println("Gentile "+user2.getName()+" "+user2.getSurname()+", il suo saldo attuale ammonta a: "+acc2.getBalance());
    }
}
