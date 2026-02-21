import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.example.FizzBuzz;
class FizzBuzzTest {
    @Test
    void testFizzBuzzReturnsNumber() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
    }
}
