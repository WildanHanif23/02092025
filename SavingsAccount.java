public class SavingsAccount {
    public void deposit(int x){
        balance += x;
    }
    public double balance;
    public double interestRate = 0.01;
    public String name;

    public void displayCustomer(){
        System.out.println("Customer: "+ name);
        System.out.println("Balance: " + balance);
        System.out.println("Rate: " + interestRate);

        }
    public double calcInterest(){
        double interest = balance * interestRate / 12;
        return interest;
    }
    
}
