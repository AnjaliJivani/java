// Define the custom exception class
class InSufficientFundException extends Exception {
    public InSufficientFundException(String message) {
        super(message);
    }
}

// Define the Account class
class Account {
    private double balance;

    // Constructor to initialize the account with an initial balance
    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InSufficientFundException {
        if (amount > balance) {
            throw new InSufficientFundException("Insufficient funds. Your current balance is: " + balance);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New balance: " + balance);
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Create an Account object
        Account myAccount = new Account(100);

        // Test deposit method
        myAccount.deposit(50); // Expected: Deposited: 50, New balance: 150
        myAccount.deposit(-10); // Expected: Deposit amount must be positive.

        // Test withdraw method
        try {
            myAccount.withdraw(30); // Expected: Withdrawn: 30, New balance: 120
            myAccount.withdraw(200); // Expected: Exception: Insufficient funds. Your current balance is: 120
        } catch (InSufficientFundException e) {
            System.out.println(e.getMessage());
        }

        try {
            myAccount.withdraw(-10); // Expected: Withdrawal amount must be positive.
        } catch (InSufficientFundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final balance: " + myAccount.getBalance()); // Expected: Final balance: 120
    }
}
