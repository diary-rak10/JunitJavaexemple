package com.exemple;
import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
   public void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.addi(5,4), "La somme de 5 et 4 devrait : 9");
    }
    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.sous(6,4),"La soustraction de 6 et 4 devrait : 2 ");
    }
}
