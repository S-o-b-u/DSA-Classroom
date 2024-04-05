package Array;
import java.util.Arrays;
//WAP to find the maximum element in an array
public class MaxElement {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        int max = Integer.MIN_VALUE;
        for (int element : arr){
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Max element in your array is => "+max);
    }
}
