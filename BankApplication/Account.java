package BankApplication;

public abstract class Account implements IBaseRate {
    // List common properties for savings and checking account
    private String name;
    private String sSN;
    private double balance;
    private static int index = 10000;
    protected String acctNumber;
    protected double rate;


    //Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        // Set account number
        index++;
        this.acctNumber = setAccountNumber();

        setRate();

        }

        public abstract void setRate();

        private String setAccountNumber(){
            String lastTwoOfSSN = sSN.substring(sSN.length() -2,sSN.length());
            int uniqueID = index;
            int randomNumber = (int)(Math.random() * Math.pow(10,3));
            return lastTwoOfSSN + uniqueID + randomNumber;
    }
        public void compound(){
            double accuredInterest = balance * (rate/100);
            System.out.println("Accured Interest " + accuredInterest);
            balance = balance + accuredInterest;
            printBalance();
        }
        public void deposit(double amount){
            balance = balance + amount;
            System.out.println("Depositing $ " + amount);
        }

        public void withdraw(double amount){
            balance = balance - amount;
            System.out.println("Withdrawing $ " + amount);
        }

        public void transfer(String toWhere, double amount){
            balance = balance - amount;
            System.out.println("Tranferring $ " + amount + " to " + toWhere);
        }

        public void printBalance(){
            System.out.println("Your balance is now " + balance);
        }

        public void showInfo(){
            System.out.println(
                    "Name: " + name +
                     "\nAccount Number: " + acctNumber +
                     "\nBalance: " + balance +
                     "\nRate " + rate + "%"
            );
        }

    // List common methods
}
