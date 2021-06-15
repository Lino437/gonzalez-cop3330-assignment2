package ex37;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {
    @Test
    @DisplayName("Hello World")
    public void helloThisIsATest() {
        assertEquals(9, Password.generateRandomPassword(9, 2, 2).length());
    }
}