package Array;
import java.util.Arrays;
//WAP to check if an array is sorted in ascending order
public class IsSortedInAscending {
    public static boolean IsSorted(int[] arr, int n){
        if (n==0 || n==1){
            return true;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("The Array -> "+Arrays.toString(arr) +" "+ (IsSorted(arr, arr.length)?"Is" : "Is not")+ " sorted.");
        int[] arr0 = new int[]{1, 2, 7, 4, 5};
        System.out.println("The Array -> "+Arrays.toString(arr0) +" "+ (IsSorted(arr0, arr0.length)?"Is" : "Is not")+ " sorted!");
    }
}
