package pwo.lab13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TextTest {

    @ParameterizedTest
    @ValueSource(strings = {"aa234bb34sd", "1 2 3 4 5", "xx12x12x1x"})
    void cont5DigTest1(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.cont5Dig(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5", "xx1x12x1x"})
    void cont5DigTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.cont5Dig(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"t33s4t"})
    void numberOfDigitsTest(String str) {
        System.out.println("(test pozytywny) Liczba cyfr w: " + str + "=" + Text.numberOfDigits(str));
        assertEquals(Text.numberOfDigits(str), 3);
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"t33s4t"})
    void numberOfDigitsTest2(String str) {
        System.out.println("(test negatywny) Liczba cyfr w: " + str + "=" + Text.numberOfDigits(str));
        assertNotEquals(Text.numberOfDigits(str), 1);
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"asdafasd", "bdasdhaW"})
    void notContainsDigitsTest(String str) {
        System.out.println("(test pozytywny) String: " + str + " nie zawiera cyfr");
        assertTrue(Text.notContainsDigits(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"t33s4t"})
    void notContainsDigitsTest2(String str) {
        System.out.println("(test negatywny) String: " + str + " zawiera cyfry");
        assertFalse(Text.notContainsDigits(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"444555666"})
    void containsOnlyDigitsTest(String str) {
        System.out.println("(test pozytywny) String: " + str + " zawiera wyłącznie cyfry");
        assertTrue(Text.containsOnlyDigits(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"444a555b666c"})
    void containsOnlyDigitsTest2(String str) {
        System.out.println("(test negatywny) String: " + str + " nie zawiera wyłącznie cyfr");
        assertFalse(Text.containsOnlyDigits(str));
    }
}