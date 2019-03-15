package banktechtest;

class Bank {

    double currentBalance;

    Bank(double balance){
        currentBalance = balance;
    }

    double displayBalance() {
        return this.currentBalance;
    }
}
