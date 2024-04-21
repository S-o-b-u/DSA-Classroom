package Array;
//Find Pivot Index
//https://leetcode.com/problems/find-pivot-index/description/
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr =new int[]{2,-1,1};
        System.out.println(pivot(arr));


    }
    public static int pivot(int[] arr){
        int left=0, right;
        for(int i=0; i<arr.length; i++){
            right=0;
            for (int j=i+1; j<arr.length; j++){
                right+=arr[j];
            }
            if (left==right){
                return i;
            }
            left+=arr[i];
        }
        return -1;
    }
}
