package ex24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnagramTest {

    @Test
    @DisplayName("should check if criteria is meet")
    public void shouldShowTrueForAnagram (){
        Assertions.assertEquals(true, Anagram.checkIfAnagram("amor", "roma"));
    }

    @Test
    @DisplayName("should check false")
    public void shouldcheckfalse(){
        Assertions.assertEquals(false,Anagram.checkIfAnagram("hello","bro"));
    }

}