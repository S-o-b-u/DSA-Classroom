package Array;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//Rotate an array to the right by a given number of steps
//https://leetcode.com/problems/rotate-array/
public class RotateAnArray {
    public static void main(String[] args) {
       int[] arr =new int[]{1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of k = ");
        int k = in.nextShort();
        k=k%arr.length;
        reverse(arr, 0, arr.length-1);
        System.out.println("Step 1 - [reverse the entire array once]-> "+Arrays.toString(arr));
        reverse(arr, 0, k);
        System.out.println("Step 2 - [reverse the array from 0 to k ->"+ Arrays.toString(arr));
        reverse(arr, k-1, arr.length-1);
        System.out.println("Step 3 - [reverse the array again from (k-1) to (arr.length-1) ->"+Arrays.toString(arr));
    }
    public static void reverse(int[] arr, int i, int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
