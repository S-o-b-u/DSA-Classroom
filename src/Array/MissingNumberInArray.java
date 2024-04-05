package Array;
import java.util.Arrays;
//Missing number in array
public class MissingNumberInArray {
    public static void main(String[] args) {

        int[] arr = new int[] {1, 2, 3, 4, 5, 7};
        System.out.println(Arrays.toString(arr));
        int  n=arr.length+1;
        int sumOfall=(n*(n+1))/2;
        int res=0;
        for(int element : arr){
            res=res+element;
        }
        System.out.println("Missing element is -> "+ (sumOfall-res));
    }
}
