package Array;

import java.util.Arrays;

//WAP to find the second largest element in an array
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 47, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println("Min value=>"+Integer.MIN_VALUE);
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int element : arr){
            if (element > max) {
                smax = max;
                max = element;
            }
            else if(element>smax){
                smax = element;
            }
        }
        System.out.println("Max element in your array is => "+max);
        System.out.println("Second Max element in your array is => "+smax);
    }
}
