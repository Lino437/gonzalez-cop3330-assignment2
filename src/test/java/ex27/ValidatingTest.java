package ex27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class ValidatingTest {
    @Test
    @DisplayName("checking valid input")
    public void thisIsATrueTest(){
        Assertions.assertTrue(Validating.validateZip("32837"));
    }
    @Test
    @DisplayName("checking bad input")
    public void thisIsAFalseTest(){
        Assertions.assertFalse(Validating.validateZip("jose"));
    }
}