package banktechtest;

class Bank {

    private double currentBalance;

    Bank(double balance){
        currentBalance = balance;
    }

    double displayBalance() {
        return this.currentBalance;
    }
}
