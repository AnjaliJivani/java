public class Lab_5_4 {
    private String accountNo;
    private String userName;
    private String email;
    private String accountType;
    private double accountBalance;

    // Constructor to initialize the Bank_Account object
    public Lab_5_4(String accountNo, String userName, String email, String accountType, double accountBalance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    // Method to get account details
    public String getAccountDetails() {
        return "Account Number: " + accountNo + "\n"
                + "User Name: " + userName + "\n"
                + "Email: " + email + "\n"
                + "Account Type: " + accountType + "\n"
                + "Account Balance: $" + accountBalance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println(getAccountDetails());
    }

    // Main method to test the Lab_5_4 class
    public static void main(String[] args) {
        // Creating an instance of Lab_5_4
        Lab_5_4 account = new Lab_5_4("1234567890", "John Doe", "johndoe@example.com", "Savings", 5000.00);

        // Displaying account details
        account.displayAccountDetails();
    }
}
