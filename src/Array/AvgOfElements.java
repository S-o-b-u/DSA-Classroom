package Array;
import java.util.Arrays;
//WAP to find the average of elements in an array
public class AvgOfElements {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        float sum=0;
         for (float elements : arr){
             sum=sum+elements;
        }
        float avg = sum/2;
        System.out.println("The average of all elements  is  = "+ avg);
    }
}
