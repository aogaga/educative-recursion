public class Factorial {
    public static int doFactorial(int n){

      System.out.println(n);
      if(n == 1){
        return n;
      }

      return (n * doFactorial( n -1));
    }
}
