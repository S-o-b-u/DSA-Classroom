package Array;

import java.util.Arrays;

//Two Sum
//https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public static void main(String[] args) {

        int[] arr = new int[]{2,7,11,15};
        int target =9;
        int[] tsArray=new int[2];
        tsArray=TwoSum(arr,target);
        System.out.print(arr[tsArray[0]] + "," + arr[tsArray[1]]);
    }
    //bruteforce solution >
    public static int[] TwoSum(int[] arr, int target){
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}