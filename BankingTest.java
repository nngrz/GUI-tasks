class Person {
    private String name;

    public Person(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name required");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Account {
    private static double interestRate = 0.0; // shared by all accounts
    private double balance;

    public double getBalance() {
        return balance;
    }

    public static void setInterestRate(double ratePercent) {
        if (ratePercent < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative");
        }
        interestRate = ratePercent;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be > 0");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw must be > 0");
        }

        if (amount > balance) {
             throw new IllegalArgumentException("Insufficient funds");
        }

        balance -= amount;
    }

    public void transfer(Account target, double amount) {
        if (target == null) {
            throw new IllegalArgumentException("Target account cannot be null");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Transfer money must be > 0");
        }
        if (target == this) return; // do nothing
        withdraw(amount);
        target.deposit(amount);
    }

    public void addInterest() {
        if (interestRate > 0) {
            balance += balance * (interestRate / 100.0);
        }
    }
}

class BankCustomer {
    private Person person;
    private Account account;

    public BankCustomer(Person person) {
        if (person == null) {
            throw new IllegalArgumentException("Person cannot be null");
        }
        this.person = person;
        this.account = new Account();
    }

    public Account getAccount() {
        return account;
    }

    public String toString() {
        return "Customer: " + person.getName() + " account balance " + account.getBalance();
    }
}

public class BankingTest {
    public static void main(String[] args) {

        Person janP = new Person("Jan"),
               alaP = new Person("Ala");

        BankCustomer jan = new BankCustomer(janP);
        BankCustomer ala = new BankCustomer(alaP);

        jan.getAccount().deposit(1000);
        ala.getAccount().deposit(2000);
        jan.getAccount().transfer(ala.getAccount(), 500);
        ala.getAccount().withdraw(1000);

        System.out.println(jan);
        System.out.println(ala);

        Account.setInterestRate(4.5);
        jan.getAccount().addInterest();
        ala.getAccount().addInterest();

        System.out.println(jan);
        System.out.println(ala);
    }
}
