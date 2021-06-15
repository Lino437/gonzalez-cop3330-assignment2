package ex26;

import ex25.Password;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthsTest {

    @Test
    @DisplayName("should check false")
    public void shouldcheckfalse(){
        Assert.assertEquals(false,Password.containsSpacialChar("jose"));
    }

}