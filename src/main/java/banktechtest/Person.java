package banktechtest;

class Person {

    double deposit(double amount, Bank bank) {
        return bank.currentBalance += amount;
    }
}
