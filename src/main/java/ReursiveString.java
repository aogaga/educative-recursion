import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class ReursiveString {

  public static void main(String args[]){
    ReursiveString rs = new ReursiveString();
    char[] input = {'a', 'b', 'c', 'e'};
    rs.permutations(input, input.length);
  }
    public ReursiveString(){

  }

    public String reverse(String str) {
      if (str.isEmpty()) {
        return str;
      }

      return reverse(str.substring(1)) + str.charAt(0);
    }

    public String removeDups(String str){
      if(str.length() ==1){
        return str;
      }

      if(str.substring(0, 1).equals(str.substring(1,2))){
         return  removeDups(str.substring(1));
      }else{
        return str.substring(0, 1) + removeDups(str.substring(1));
      }
    }

    public String alphabeticMerge(String x, String y){

      if(x.isEmpty()){
        return y;
      }

      if(y.isEmpty()) {
        return x;
      }

      if(x.charAt(0) < y.charAt(0)){
        return x.substring(0, 1) + alphabeticMerge(x.substring(1), y);

      }else{

        return y.substring(0, 1) + alphabeticMerge(x, y.substring(1));
      }

    }

    public int totalVowels(String str){

        if(str.isEmpty()){
          return 0;
        }

       char single = Character.toUpperCase(str.charAt(0));

      if ( single == 'A' || single == 'E' || single == 'I' || single == 'O' || single == 'U') {
          return 1 + totalVowels(str.substring(1));
        }else{
          return totalVowels(str.substring(1));
        }
    }

    public void permutations(char[] array, int length){
        if(length == 1){
          System.out.println(array);
          return;
        }

        for (int i = 0; i < length; i++){
//
          System.out.println( "length : " + length);
          swap(array, i, length -1);
          permutations(array, length-1);
          swap(array, i, length -1);
        }
    }


    public void swap(char[] array, int i, int j){
      char c;
      c = array[i];
      array[i] = array[j];
      array[j] = c;
    }

    public boolean isPalindrome(String str){
      if(str.length() == 1){
        return true;
      }

      if(str.substring(0, 1).equals(str.substring(str.length()-1))){
        return  isPalindrome(str.substring(1, str.length() -1));
      }else{
        return false;
      }


    }
}
