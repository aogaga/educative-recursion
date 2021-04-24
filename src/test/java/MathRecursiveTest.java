import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathRecursiveTest {
  private MathRecursive mr;
  @BeforeEach
  void setUp() {
    mr = new MathRecursive();
  }

  @Test
  void factorialTest(){
    int result = mr.factorial(6);
    assertEquals(result, 720);
  }

  @Test
  void printNumTest(){
    mr.printNum(6);
  }

  @Test
  void countDigitsTest(){
      int result = mr.countDigits(1430);
      assertEquals(4, result);
  }

    @Test
    void findpowertest(){
      long result = mr.findpower(2, 3);
      assertEquals(result, 8);
    }

    @Test
    void sumUpTest(){
      int result = mr.sumUp(5);
      assertEquals(result, 15);
    }



}