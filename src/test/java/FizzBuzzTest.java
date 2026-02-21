import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.example.FizzBuzz;

class FizzBuzzTest {
    
    @Test
    void fizzbuzz_notDivisibleBy3Or5_returnsNumber() {
        // Arrange
        int input = 1;
        String expected = "1";
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals(expected, result);
    }
    
    @Test
    void fizzbuzz_divisibleBy3_returnsFizz() {
        // Arrange
        int input = 3;
        String expected = "Fizz";
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals(expected, result);
    }
    
    @Test
    void fizzbuzz_divisibleBy5_returnsBuzz() {
        // Arrange
        int input = 5;
        String expected = "Buzz";
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals(expected, result);
    }
    
    @Test
    void fizzbuzz_divisibleBy15_returnsFizzBuzz() {
        // Arrange
        int input = 15;
        String expected = "FizzBuzz";
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals(expected, result);
    }
    
    // Scenario 5: Zero
    @Test
    void fizzbuzz_zeroValue_returnsNumber() {
        // Arrange
        int input = 0;
        String expected = "0";
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals(expected, result);
    }
    
    // Scenario 6: Negative number not divisible by 3 or 5
    @Test
    void fizzbuzz_negativeNumberNotDivisibleBy3Or5_returnsNumber() {
        // Arrange
        int input = -7;
        String expected = "-7";
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals(expected, result);
    }
    
    // Scenario 7: Negative number divisible by 3
    @Test
    void fizzbuzz_negativeNumberDivisibleBy3_returnsFizz() {
        // Arrange
        int input = -9;
        String expected = "Fizz";
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals(expected, result);
    }
    
    // Scenario 8: Large positive number divisible by 3
    @Test
    void fizzbuzz_largePositiveDivisibleBy3_returnsFizz() {
        // Arrange
        int input = 9999;
        String expected = "Fizz";
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals(expected, result);
    }
    
    // Scenario 9: Large negative number divisible by 5
    @Test
    void fizzbuzz_largeNegativeDivisibleBy5_returnsBuzz() {
        // Arrange
        int input = -10000;
        String expected = "Buzz";
        
        // Act
        String result = FizzBuzz.fizzbuzz(input);
        
        // Assert
        assertEquals(expected, result);
    }
}
