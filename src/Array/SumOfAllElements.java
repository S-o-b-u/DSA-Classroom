package Array;
import java.util.Arrays;
//WAP to find the sum of all elements in an array
public class SumOfAllElements {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("Total sum Is = "+ sum);
    }
}
