package ex27;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatingTest {
    @Test
    @DisplayName("checking valid input")
    public void thisIsATrueTest(){
        Assert.assertEquals(true,Validating.validateZip("32837"));
    }
    @Test
    @DisplayName("checking bad input")
    public void thisIsAFalseTest(){
        Assert.assertEquals(false,Validating.validateZip("jose"));
    }
}