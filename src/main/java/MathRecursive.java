import adt.Node;
import adt.SinglyLinkedList;

public class MathRecursive {

  /**
   *
   * @param n
   * @return
   */
    public int factorial(int n){
      if(n == 1){
        return 1;
      }

      return n * factorial(n-1);
    }

    public void printNum(int n){
      if(n == 0){
        return;
      }
      printNum(n-1);
      System.out.print(n + " ->");
    }

    public int countDigits(int n){
      if(n <= 1){
        return 1;
      }
      int num = n / 10;
      return 1 + countDigits(num);
    }

    public long findpower(int num, int pow){

      if(pow == 0){
        return 1;
      }

      return num * findpower(num, pow -1);

    }

    public int sumUp(int n){
      if(n == 1){
        return 1;
      }
      return n + sumUp(n -1);
    }

    public int mod(int dividend, int divisor){
      if(divisor == 0){
        return -1;
      }
      // Base case
      if (dividend < divisor) {
        return dividend;
      }
      // Recursive case
      else {
        return mod(dividend-divisor, divisor);
      }

    }

    public int fibonnaci(int n ){
      if(n < 1){
        return n;
      }

      return fibonnaci(n-1) + fibonnaci(n -2);
    }

    public int findSumIterative(int n ){
      int result = 0;
      for(int i = 1; i < n; i++){
        result = result + i;
      }
      return  result;
    }
}
