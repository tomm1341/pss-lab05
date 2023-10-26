/** Si implementi in autonomia la classe `StrictBankAccount`, tale che:
    - `StrictBankAccount` implementa `BankAccount`
    - Le operazioni sul conto dovranno essere abilitate solo se lo user id corrisponde a quello a cui il conto è stato associato
    - Non dovrà essere possibile effettuare dei prelievi se l'ammontare da prelevare specificato è superiore alla disponibilità corrente del conto. Se il caso si verifica, le operazioni di prelievo non dovranno fare nulla.
    - Le spese di gestione dovranno essere calcolate come segue: al costo fisso di 5 Euro andrà aggiunto un costo variabile di 0.1 euro per ciascuna transazione effettuata */

package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount{
    
    //Inizializzo i campi
    private double balance;
    private int transactions;
    static double ATM_TRANSACTION_FEE = 1;
    static double MANAGEMENT_FEES_COST = 0.1;
    private final int id;


    //Creo un costruttore pubblico che prenda in ingresso i dati dell'utente
    public StrictBankAccount(final int id, final double balance){

        this.id = id;
        this.balance = balance;

    }

    //Aggiungo i vari selettori per ottenere i campi

    public int getid(){
        return this.id;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getTransactionsCount(){
        return this.transactions;
    }

    private boolean transactionCheck(final int id){

        if(this.getid() == id){

            this.transactions ++;
            return true;

        } else {

            System.out.println("Error. Invalid user id.");
            return false;

        }

    }

    private boolean balanceCheck(final double amount){

        if(this.balance <= 0){

            System.out.println("Your balance is below 0. No withdrawing allowed.");
            return false;

        }

        if(this.balance < amount){
            
            System.out.println("Error. Your balance is too low.");
            return false;

        } else {

            this.transactions ++;
            return true;

        }

    }

    public void deposit(final int id, final double amount){

        if(transactionCheck(id)){

            this.balance += amount;    

        }

    }

    public void withdraw(final int id, final double amount){

        if(balanceCheck(amount)){

            this.balance -= amount;

        }

    }

    public void depositFromATM(final int id, final double amount){

        if(transactionCheck(id)){

            this.balance += amount - StrictBankAccount.ATM_TRANSACTION_FEE;

        }

    }

    public void withdrawFromATM(final int id, final double amount){

        if(balanceCheck(amount)){

            this.balance -= amount + StrictBankAccount.ATM_TRANSACTION_FEE;
            
        }  

    }

    public void chargeManagementFees(final int id){

        double cost = 5;
        double totalCharge;

        cost += StrictBankAccount.MANAGEMENT_FEES_COST;
        totalCharge = cost * this.transactions;

        this.balance -= totalCharge;

    }

}
