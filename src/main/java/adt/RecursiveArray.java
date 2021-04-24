package adt;

public class RecursiveArray {

    public int firstOccurence(int [] a, int n, int index){
      if(a.length == index){
        return  -1;
      }

      if(a[index] == n){
        return index;
      }else{
        return firstOccurence(a, n, index+1);
      }
    }

    public int countOccurence(int [] a, int n, int index){
      if(a.length == index){
        return 0;
      }

      if(a[index] == n){
        return 1 + countOccurence(a, n, index+1);
      }else{
        return countOccurence(a, n, index+1);
      }

    }

    public int[] replaceNegativeIntegers(int [] a, int index){
      if(a.length == index){
        return a;
      }
      if(a[index] < 1){
        a[index] = 0;
      }
      return replaceNegativeIntegers(a, index+1);
    }

    public int[] invert(int[] n, int index){
      int len = n.length - 1;
      if(index == (len)){
        return n;
      }

      int temp = n[len - index];
      n[len - index] = n[index];
      n[index] = temp;
       return invert(n, index+1);
    }

    public boolean isPalindrome(int [] n, int index){
      int mid = n.length /2;
      if(index == mid){
        return true;
      }

      if(n[index] != n[(n.length -1) - index]){
        return false;
      }else{
        return isPalindrome(n, index+1);
      }

  }

    public void sort(int [] n, int index){
      if(index == 1){
        return;
      }

      for (int i = 0; i < index -1; i++){
        if(n[i] > n[i+1]){
            int temp = n[i+1];
            n[i+1] = n[i];
            n[i] = temp;
        }
      }

       sort(n, index-1);
    }


}
