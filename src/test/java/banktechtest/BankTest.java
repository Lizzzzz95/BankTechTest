package banktechtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private Bank bank;
    private double testBalance = 500.00;

    @BeforeEach
    void init(){
        bank = new Bank(testBalance);
    }

    @Test
    void display_current_balance(){
        assertEquals(bank.displayBalance(), testBalance);
    }

}
