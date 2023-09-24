class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size1 = nums1.length; // Corrected variable name to nums1
        int size2 = nums2.length; // Corrected variable name to nums2
        int tot = size1 + size2;
        int[] mergedArray = new int[tot];
        int i = 0, j = 0, k = 0;

        while (i < size1 && j < size2) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k] = nums1[i];
                k++;
                i++;
            } else {
                mergedArray[k] = nums2[j];
                k++;
                j++;
            }
        }

        // Handle remaining elements in nums1, if any
        while (i < size1) {
            mergedArray[k] = nums1[i];
            k++;
            i++;
        }

        // Handle remaining elements in nums2, if any
        while (j < size2) {
            mergedArray[k] = nums2[j];
            k++;
            j++;
        }

        // Calculate median based on mergedArray
        if (tot % 2 == 0) {
            return (double) (mergedArray[tot / 2 - 1] + mergedArray[tot / 2]) / 2;
        } else {
            return (double) mergedArray[tot / 2];
        }
    }
}
