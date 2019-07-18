package BankApplication;

public class Savings extends Account {
    // List prop specific to savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to ini settings for the Savings prop
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        acctNumber = "1" + acctNumber;
        setSafetyDepositBox();

    }

    @Override
    public void setRate(){
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
    }

    public void showInfo(){
        super.showInfo();
        System.out.println(
                "Your savings features " +
                "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n Safety Deposit Box Key: " + safetyDepositBoxKey
        );

        }



    // List any methods spec to Savings account
}
