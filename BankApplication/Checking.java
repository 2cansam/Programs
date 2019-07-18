package BankApplication;

public class Checking extends Account{
    // List properties specific to a checking account
    private int debitCardNumber;
    private int debitCardPin;

    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        acctNumber = "2" + acctNumber;
        setDebitCardNumber();

    }

    @Override
    public void setRate(){
        rate = getBaseRate() * .15;
    }
    private void setDebitCardNumber(){
        debitCardNumber = (int)(Math.random() * Math.pow(10,12));
        debitCardPin = (int)(Math.random() * Math.pow(10,4));
    }

    // List any methods specific to checking account

    public void showInfo(){
        super.showInfo();
        System.out.println("Your Checking account features " +
                "\n Debit Card Number: " + debitCardNumber +
                "\n Debit Card Pin: " + debitCardPin);
    }
}
