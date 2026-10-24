class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newNums1 = new int[m + n];

        int newNums1Index = 0;
        int nums1Index = 0;

        for (int i = 0; i < n; ++i) {

            while (nums1Index < m && nums1[nums1Index] <= nums2[i]) {
                newNums1[newNums1Index++] = nums1[nums1Index++];
            }

            newNums1[newNums1Index++] = nums2[i];
        }

        while (nums1Index < m) {
            newNums1[newNums1Index++] = nums1[nums1Index++];
        }

        System.arraycopy(newNums1, 0, nums1, 0, m + n);
    }
}