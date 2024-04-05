package Array;

import java.util.Arrays;

//WAP to find the minimum element in an array
public class MinElement {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        int min = Integer.MAX_VALUE;
        for (int element : arr){
            if (element < min) {
                min = element;
            }
        }
        System.out.println("Max element in your array is => "+min);
    }
}
