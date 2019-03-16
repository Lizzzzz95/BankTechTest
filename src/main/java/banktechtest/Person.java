package banktechtest;

class Person {

    double deposit(double amount, Bank bank) {
        return bank.currentBalance += amount;
    }

    double withdraw(double amount, Bank bank) {
        return bank.currentBalance -= amount;
    }
}
