package Array;

import java.util.Arrays;

//Move all zeroes present in an array to the end
//https://leetcode.com/problems/move-zeroes/description/
public class MoveZERO {
    public static void main(String[] args) {
      int[] arr = new int[]{0,1,0,3,12};
      int i=0, j=1;
      while(j<arr.length){
          if(arr[i]==0 && arr[j]!=0){
              int temp = arr[j];
              arr[j]=arr[i];
              arr[i]=temp;
              i++;
              j++;
          }
          else if(arr[i]==0 && arr[j]==0){
              j++;
          }
          else{
              i++;
              j++;
          }
      }
        System.out.println("The sorted array => "+ Arrays.toString(arr));
    }
}
