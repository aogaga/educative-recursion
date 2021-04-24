package adt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecursiveArrayTest {

  private  RecursiveArray ra;

  @BeforeEach
  void setUp() {
    ra = new RecursiveArray();
  }

  @Test
  void testFirstOccurence(){
    int[] array = {2,3,4,1,7,8,3};
    int result = ra.firstOccurence(array, 3, 0);
    assertEquals(1, result);
  }

  @Test
  void testCountOccurence(){
    int[] array = {2,3,4,1,7,8,3};
    int result = ra.countOccurence(array, 3, 0);
    assertEquals(2, result);
  }

  @Test
  void testReplaceNegativeIntegers(){
    int[] array = {2,-3,4,-1,-7,8,3};
    int [] result = ra.replaceNegativeIntegers(array, 0);
    assertEquals(2, result[0]);
    assertEquals(0, result[1]);
    assertEquals(0, result[3]);
    assertEquals(0, result[4]);
  }

  @Test
  void testInvert(){
    int[] a = {5,4,3,2,1,0};
    int[] n = ra.invert(a, 0);

    assertEquals(n[0], 0);

  }

  @Test
  void testIsPalindrome(){
    int[] array = {1,2,2,2,1};
    boolean result = ra.isPalindrome(array, 0);
    assertTrue(result);
  }

  @Test
  void testSortArray(){
    int[] array = {40, 24, 60, 15, 10, 45, 93};
    ra.sort(array, array.length);
    assertEquals(array[0], 10);
    assertEquals(array[6], 93);
  }



}