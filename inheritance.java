class bankAccount {
    String name;
    int accNo;
    int balance;

    bankAccount(String name, int accNo, int balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;

    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("The balance after the deposit is:" + balance);
    }

    public double getBalance() {
        return balance;
    }

    void display() {
        System.out.println("Account name is:->" + name);
        System.out.println("Account number is:->" + accNo);
    }
}

class savingsAccount extends bankAccount {
    savingsAccount(String name, int accNo, int balance) {
        super(name, accNo, balance);
    }

    public void withdraw(int withdrawal) {
        if (withdrawal > balance) {
            System.out.println("In sufficient balance:");
        } else {
            balance -= withdrawal;
        }

    }

}

public class inheritance {
    public static void main(String[] args) {
        System.out.println("The bank details are:");
        savingsAccount acc = new savingsAccount("Ahsaan", 12, 100);
        System.out.println();
        acc.display();
        System.out.println("Available Balance is:" + acc.getBalance());
        acc.withdraw(1200);
        // System.out.println("Available balance is:" + acc.getBalance());
        acc.deposit(3000);
        acc.withdraw(1100);
        System.out.println("Availale balance is:" + acc.getBalance());

    }

}
