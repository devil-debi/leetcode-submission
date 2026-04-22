class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
    //     int start = 0;
    //     int end = start + k ;
    //      double maxAverage = Double.NEGATIVE_INFINITY;
    //     while (end<= nums.length){
    //         double curr = 0.0;
    //         int i = start;
    //         while (i < end){
    //             curr+=nums[i];
    //             i++;
    //         }
    //         maxAverage = Math.max(maxAverage,curr/k);
    //         start++;
    //         end++;
    //     }
    // return maxAverage;
    int windowSum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i];
            windowSum -= nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }
}