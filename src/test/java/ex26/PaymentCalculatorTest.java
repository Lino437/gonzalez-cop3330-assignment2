package ex26;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    @DisplayName("Should pass fro the given values")
    public void  valuesBalance5000Apr12MonthPay100(){
        assertEquals(70 ,PaymentCalculator.calculateMonthsUntilPaidOff(5000, 12, 100));
    }

    @Test
    @DisplayName("Should pass for 0 apr the given values")
    public void  valuesBalance5000Apr0MonthPay100(){
        assertEquals(0 ,PaymentCalculator.calculateMonthsUntilPaidOff(5000, 0, 100));
    }

}