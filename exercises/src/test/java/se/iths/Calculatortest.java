package se.iths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Calculatortest {
    Calculator calc = new Calculator();


    @Test
    public void testDivision(){
        assertEquals(3, calc.divide(6, 2));
    
    }

    @Test
    public void testAddition(){
        assertEquals(5, calc.add(3,2));
    }
    
}
