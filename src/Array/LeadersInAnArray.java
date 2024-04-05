package Array;
import java.util.Arrays;
//Leaders in an array
public class LeadersInAnArray {

    public static void main(String[] args) {
        int[] arr = new int[] {16,17,4,3,5,2};
        System.out.println(Arrays.toString(arr));
        System.out.print("Leaders are -> ");
        for (int i=0; i<arr.length; i++){
            int j=0;
            for (j=i+1; j<arr.length; j++){
                if (arr[i]<=arr[j]){
                    break;
                }
            }
            if (j==arr.length){
                System.out.print( arr[i]+" ");
            }
        }
    }
}
