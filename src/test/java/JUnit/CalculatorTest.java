package JUnit;

import org.junit.Test;
import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;

class CalculatorTest {

    @BeforeEach
    void setUp() {
        System.out.println ("setUp befor testing");
    }

    @AfterEach
    void tearDown() {
        System.out.println ("After");
    }

    @Test
    void calculareUnitateMasura() {
        String expression = "10 cm + 10 mm";
        double expected = 110;
        assertEquals(expected, Calculator.calculareUnitateMasura(expression), 0);
    }

    @Test
    void convertireUnitateMasura(){
        double valoare = 5.5;
        String unitate = "km";
        double expected = 5500000;
        assertEquals(expected, Calculator.convertireUnitateMasura(valoare, unitate), 0);
    }
}