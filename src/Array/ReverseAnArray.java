package Array;
import java.util.Arrays;
//WAP to function to reverse an array
public class ReverseAnArray {
    public static void main(String[] args) {
            int[] arr = new int[] {1, 2, 3, 4, 5};
            System.out.println(Arrays.toString(arr));
        System.out.print ("Reversed ARRAY => ");
        for (int i = arr.length-1; i>=0 ; i--) {
            System.out.print("\t"+arr[i]);
        }
    }
}
