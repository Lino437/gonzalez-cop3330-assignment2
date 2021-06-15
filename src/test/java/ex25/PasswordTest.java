package ex25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class PasswordTest {

    @Test
    @DisplayName("should check if criteria is meet")
    public void shouldShowTrue(){
        Assertions.assertTrue(Password.containsSpacialChar("!@#$%^&*("));
    }

    @Test
    @DisplayName("should check false")
    public void shouldCheckFalse(){
        Assertions.assertFalse(Password.containsSpacialChar("jose"));
    }

}