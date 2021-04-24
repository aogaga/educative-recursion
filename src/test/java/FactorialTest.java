import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

  @Test
  void doFactorial() {
    assertEquals(24, Factorial.doFactorial(4));
    assertEquals(120, Factorial.doFactorial(5));
  }
}