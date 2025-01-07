package se.iths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TestComputer {

    @Test
    public void eightPlusElevenEquals19() {
        Calculator calculatorMock = mock(Calculator.class);
        Computer computer = new Computer(calculatorMock);

        when(calculatorMock.add(8,11)).thenReturn(19);

        int result = computer.compute("addition",8, 11);

        assertEquals(19,result);

        verify(calculatorMock).add(8, 11);
        // 1. Create Computer object to use as test object.
        // 2. Make sure Calculator is mocked to enable stubbing of output.
        // 3. Stub CalculatorMock to output correct value when add()-method is called.
        // 4. Use compute()-method to compute sum of 8 and 11. (Code Under Test)
        // 5. Assert that the result from {4} is equal to the expected result (19).
    }

    @Test
    public void threeTimesSixEqualsEighteen() {
        Calculator calculatorMock = mock(Calculator.class);
        Computer computer = new Computer(calculatorMock);

        when(calculatorMock.multiply(3, 6)).thenReturn(18);

        int result = computer.compute("multiplication",3, 6);

        assertEquals(18, result);

        verify(calculatorMock).multiply(3, 6);
        // 1. Create Computer object to use as test object.
        // 2. Make sure Calculator is mocked to enable stubbing of output.
        // 3. Stub CalculatorMock to output correct value when multiply()-method is called.
        // 4. Use compute()-method to compute product of 3 and 6. (Code Under Test)
        // 5. Assert that the result from {4} is equal to the expected result (18).
    }

    @Test
    public void twelveMinusSevenEqualsFive() {
        Calculator calculatorMock = mock(Calculator.class);
        Computer computer = new Computer(calculatorMock);

        when(calculatorMock.subtract(12, 7)).thenReturn(5);

        int result = computer.compute("subtraction",12, 7);

        assertEquals(5, result);

        verify(calculatorMock).subtract(12, 7);
        
        // 1. Create Computer object to use as test object.
        // 2. Make sure Calculator is mocked to enable stubbing of output.
        // 3. Stub CalculatorMock to output correct value when subtract()-method is called.
        // 4. Use compute()-method to compute the difference between 12 and 7. (Code Under Test)
        // 5. Assert that the result from {4} is equal to the expected result (5).
    }

    @Test
    public void twoPowerOfFourEquals64() {
        Calculator calculatorMock = mock(Calculator.class);
        Computer computer = new Computer(calculatorMock);

        when(calculatorMock.power(2, 4)).thenReturn(64);

        int result = computer.compute("power",2, 4);

        assertEquals(64, result);

        verify(calculatorMock).power(2, 4);
        // 1. Create Computer object to use as test object.
        // 2. Make sure Calculator is mocked to enable stubbing of output.
        // 3. Stub CalculatorMock to output correct value when power()-method is called.
        // 4. Use compute()-method to compute 2 to the power of 4 (2^4). (Code Under Test)
        // 5. Assert that the result from {4} is equal to the expected result (64).
    }


    @Test
    void testComputeWithInvalidModeThrowsException() {
        Calculator mockCalculator = mock(Calculator.class);
        Computer computer = new Computer(mockCalculator);

        assertThrows(IllegalArgumentException.class, () ->
                computer.compute("invalidMode", 5, 3));
        // 1. Create Computer object to use as test object.
        // 2. Assert that an InvalidArgumentException is thrown when the compute()-method is used with invalid mode. (Code Under Test)
    }
}
