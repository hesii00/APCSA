public class SavingsAccount {
    private double balance; 
    private String username; 
    private int accountNumber; 
    private double interestRate;

    public SavingsAccount(){ 
        balance = 0;
        username = ""; 
        accountNumber = 0; 
        interestRate = 0.0; 
    } 

    public SavingsAccount(double balance, String username, int accountNumber, double interesrRate){ 
        this.balance = balance; 
        this.username = username; 
        this.accountNumber = accountNumber; 
        this.interestRate = interesrRate;
    }

    public void withdraw(double w) { 
        if (balance > w){ 
            balance = balance - w;
       }
       else { 
            balance = 0;
       }
    }

    public void deposit(double d) { 
        balance += d;
    }
     
    public double checkBalance(){ 
        return balance; 
    } 

    private void calcInterest(){ 
        balance = balance*(1+interestRate);
    }

}

    