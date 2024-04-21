package Array;

import java.util.Arrays;

//Merge two sorted arrays into a single sorted array
//https://leetcode.com/problems/merge-sorted-array/description/
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int m=3,n=3;
        int nums1[] = new int[]{1,2,3,0,0,0};
        int nums2[] = new int[]{2,5,6};
        merge(nums1,m,nums2,n);
        System.out.println("Merged Array => "+Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1;
        int k = (m + n) - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else if (nums2[j] >= nums1[i]) {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

    }
}

