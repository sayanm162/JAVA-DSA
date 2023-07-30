//demonstrating the use of getters and setters for private fileds
public class GetterSetter {
    public static void main(String args[]) {
        BankAccount acc1 = new BankAccount();
        acc1.name = "Sayan Mitra";
        acc1.accountNo = 410533398;
        acc1.setPassword("ItmyPassword123");
        acc1.setBalance(5000);

        System.out.println(acc1.name + "\n" + acc1.accountNo + "\n" + acc1.getBalance());

    }
    
}

class BankAccount {
    protected String name;
    protected int accountNo;
    private String password;
    private int accBalance;

    void setPassword(String password) {
        this.password = password;
    }

    String getPassword() {
        return this.password;
    }

    void setBalance(int accBalance) {
        this.accBalance = accBalance;
    }

    int getBalance() {
        return this.accBalance;
    }
}
