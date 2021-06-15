package ex24;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

    @Test
    @DisplayName("should check if criteria is meet")
    public void shouldShowTrueForAnagram (){
        Assert.assertEquals(true, Anagram.checkIfAnagram("amor", "roma"));
    }

    @Test
    @DisplayName("should check false")
    public void shouldcheckfalse(){
        Assert.assertEquals(false,Anagram.checkIfAnagram("hello","bro"));
    }

}