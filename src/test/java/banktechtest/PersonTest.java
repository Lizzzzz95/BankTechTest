package banktechtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;
    private Bank bank;
    private double testBalance = 500.00;
    private double testAmount = 50.00;

    @BeforeEach
    void init(){
        person = new Person();
        bank = new Bank(testBalance);
    }

    @Test
    void a_person_can_make_a_deposit(){
        assertEquals(person.deposit(testAmount, bank), (testBalance + testAmount));
    }

    @Test
    void a_person_can_make_a_withdrawal(){
        assertEquals(person.withdraw(testAmount, bank), (testBalance - testAmount));
    }

}
