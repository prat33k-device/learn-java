package Constructors;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account() {
        //lets define default values here
        // with the help of constructor chaining

        // it's just calling another constructor within a constructor
        this("56789", 0.0, "Email", "Name", "Phone");

        System.out.println("Empty constuctor");
    }

    public Account(String number, double balance, String customerEmail, String customerName, String customerPhone) {
        this.number = number;
        this.balance = balance;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.customerPhone = customerPhone;

        System.out.println("Account constructor with parameters is called");
    }

    public void depositFunds(double ammount) {
        this.balance += ammount;
        System.out.println("+" + ammount + " added. Balance: " + this.balance);
    }
    public void withdrawFunds(double ammount) {
        if(this.balance < ammount) {
            System.out.println("Insufficient balance");
            return;
        }

        this.balance -= ammount;
        System.out.println("-" + ammount + " withdrawed. Balance: " + this.balance);
    }

    public String getInfo() {
        return this.customerEmail + " " + this.customerName + " " + this.customerPhone;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }
}
