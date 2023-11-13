package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    private CaesarShiftCipher cipher;

    @BeforeEach
    public void initialize() {
        this.cipher = new CaesarShiftCipher();
    }

    @Test
    public void invalid() {
        Assertions.assertEquals("invalid", cipher.CaesarShiftCipher("#", 1));
    }

    @Test
    public void test1() {
        Assertions.assertEquals("abc", cipher.CaesarShiftCipher("xyz", 3));
    }
}
