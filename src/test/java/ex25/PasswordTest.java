package ex25;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class PasswordTest {

    @Test
    @DisplayName("should check if criteria is meet")
    private void shouldShowTrueForSpecialChar(){
        Assert.assertEquals(true, Password.containsSpacialChar("{}"));
    }

    @Test
    @DisplayName("should check false")
    public void shouldcheckfalse(){
        Assert.assertEquals(false,Password.containsSpacialChar("jose"));
    }

}