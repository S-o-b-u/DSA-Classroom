package Array;
import java.util.Arrays;
//Frequency of each element in an array
public class FrequencyOfEachElement {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 2, 6, 5, 6};
        System.out.println(Arrays.toString(arr));
        int[] res = new int[11];
        for (int i = 0; i < arr.length; i++) {
            res[arr[i]]=res[arr[i]]+1;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(i+"th frequency => "+res[i]);
        }
    }
}



