package ex25;

import ex24.Anagram;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    @DisplayName("should check if criteria is meet")
    public void shouldShowTrueForSpecialChar(){
        Assert.assertEquals(true, Password.containsSpacialChar("{}"));
    }

    @Test
    @DisplayName("should check false")
    public void shouldcheckfalse(){
        Assert.assertEquals(false,Password.containsSpacialChar("jose"));
    }

}