
class Account {
    String accountNumber;
    protected double balance;

    // Constructor for Account class
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Display method
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// SavingsAccount class derived from Account
class SavingsAccount extends Account {
    private double interestRate;

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to add interest
    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }

    // Override display method to include interest rate
    @Override
    public void display() {
        super.display();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// CurrentAccount class derived from Account
class CurrentAccount extends Account {
    private double overdraftLimit;

    // Constructor for CurrentAccount
    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw method to check overdraft
    @Override
    public void withdraw(double amount) {
        if (amount <= (balance + overdraftLimit)) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    // Override display method to include overdraft limit
    @Override
    public void display() {
        super.display();
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }

    // Method to send a letter for overdraft
    public void sendOverdraftLetter() {
        System.out.println("Letter sent: Account is in overdraft.");
    }
}

// Bank class
class Bank {
    private Account[] accounts;
    private int numAccounts;

    // Constructor for Bank
    public Bank(int maxAccounts) {
        accounts = new Account[maxAccounts];
        numAccounts = 0;
    }

    // Method to open a new account
    public void openAccount(Account account) {
        if (numAccounts < accounts.length) {
            accounts[numAccounts++] = account;
            System.out.println("Account opened successfully.");
        } else {
            System.out.println("Cannot open more accounts. Bank is full.");
        }
    }

    // Method to close an account
    public void closeAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].accountNumber.equals(accountNumber)) {
                // Shift accounts to fill the gap
                for (int j = i; j < numAccounts - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }
                numAccounts--;
                System.out.println("Account closed successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    // Method to pay a dividend into each account
    public void payDividend(double dividend) {
        for (int i = 0; i < numAccounts; i++) {
            accounts[i].deposit(dividend);
        }
        System.out.println("Dividend paid to all accounts.");
    }

    // Method to update accounts
    public void update() {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i] instanceof SavingsAccount) {
                ((SavingsAccount) accounts[i]).addInterest();
            } else if (accounts[i] instanceof CurrentAccount && accounts[i].balance < 0) {
                ((CurrentAccount) accounts[i]).sendOverdraftLetter();
            }
        }
    }

    // Method to display all accounts
    public void displayAllAccounts() {
        for (int i = 0; i < numAccounts; i++) {
            System.out.println("Account " + (i + 1) + ":");
            accounts[i].display();
            System.out.println("--------------------------");
        }
    }
}

// Main class for testing
public class accounts {
    public static void main(String[] args) {
        Bank bank = new Bank(10);

        // Create some test accounts
        SavingsAccount savingsAccount = new SavingsAccount("S001", 5000, 5);
        CurrentAccount currentAccount = new CurrentAccount("C001", 3000, -1000);
        Account regularAccount = new Account("A001", 2000);

        // Open accounts in the bank
        bank.openAccount(savingsAccount);
        bank.openAccount(currentAccount);
        bank.openAccount(regularAccount);

        // Display initial state
        System.out.println("Initial State:");
        bank.displayAllAccounts();

        // Pay dividend
        bank.payDividend(100);

        // Update accounts
        bank.update();

        // Display updated state
        System.out.println("\nAfter Update:");
        bank.displayAllAccounts();

        // Close an account
        bank.closeAccount("A001");

        // Display final state
        System.out.println("\nFinal State:");
        bank.displayAllAccounts();
    }
}
