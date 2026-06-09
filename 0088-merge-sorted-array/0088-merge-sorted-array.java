class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] ans = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n) {

            if(nums1[i] <= nums2[j]) {
                ans[k++] = nums1[i++];
            } else {
                ans[k++] = nums2[j++];
            }
        }

        while(i < m) {
            ans[k++] = nums1[i++];
        }

        while(j < n) {
            ans[k++] = nums2[j++];
        }

        for(i = 0; i < m + n; i++) {
            nums1[i] = ans[i];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna