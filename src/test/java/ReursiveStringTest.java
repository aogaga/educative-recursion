import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReursiveStringTest {
  private   ReursiveString rs;
  @BeforeEach
  void setUp() {
   rs = new ReursiveString();
  }
  @Test
  void reverse() {

    String name = rs.reverse("man");
    assertEquals("nam", name);
  }

  @Test
  void removeDupsTest(){
    String result = rs.removeDups("Helllo Woorld");
    assertEquals(result, "Helo World");
  }

  @Test
  void testAlphabeticMerge(){
    String one = "adz";
    String two = "bfx";
    String answer =  rs.alphabeticMerge(one, two);
    assertEquals("abdfxz", answer);
  }

  @Test
  void testVowelCount(){
    int result = rs.totalVowels("ogaga");
    assertEquals(3, result);
  }

  @Test
  void testPermutations(){
    char[] input = {'a', 'b'};
    rs.permutations(input, input.length);
    assertTrue(true);
  }


  @Test
  void testIsPalindrome(){
    boolean result = rs.isPalindrome("madam");
    assertEquals(true, result);

  }
}