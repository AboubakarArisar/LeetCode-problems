class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length];
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found = true;

                    int max = -1;  

                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > nums1[i]) {
                            max = nums2[k];
                            break;
                        }
                    }

                    array[index++] = max;
                    break;
                }
            }

            if (!found) {
                array[index++] = -1;
            }
        }

        return array;
    }
}
