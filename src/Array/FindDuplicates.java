package Array;
import java.util.Arrays;
//Find duplicates in an array
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 5, 3, 4, 5, 4, 3};
        System.out.println(Arrays.toString(arr));
        System.out.print("Duplicates are -> ");
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]);
                }
            }
        }
    }
}

