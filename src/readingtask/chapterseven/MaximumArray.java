package readingtask.chapterseven;

public class MaximumArray {

    public static int maxSubArray(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int sumOfSubArray = 0;
        for (int num : nums){
            sumOfSubArray += num;
            maxSum = Math.max(maxSum, sumOfSubArray);
            if(sumOfSubArray < 0){
                sumOfSubArray = 0;
            }
        }
        return maxSum;
    }
}
