class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum1 = 0;
        int sum_of_array = 0;
        for(int i = 0; i < nums.length; i++){
            sum_of_array += nums[i];  //from here we will get value of Array
                                    //sum_of_array = 1 + 2 + 1 + 3 = 7
        }
        sum1 = target + sum_of_array; // 3 + 7 = 10  target = 3
        if(sum1 % 2 != 0){   //capacity = 5 or sum1.
            return 0;
        }
        sum1 = sum1 / 2;
        
        //Using 0-1 Knapsack Approach ,considering wt, values , capacity.
        int[][] dp = new int[nums.length+1][sum1 + 1];
        
        for(int i = 0; i <= nums.length; i++){
            for(int j = 0; j <= sum1; j++){
               if(i == 0 && j == 0){
                    dp[i][j] = 1;
                }else if(j == 0){
                    dp[i][j] = 1;
                }else if(i == 0){
                    dp[i][j] = 0;
                } 
            }
        }
        
        for(int i = 1; i <= nums.length; i++){
            for(int j = 0; j <= sum1; j++){
                    if(nums[i-1] <= j){
                        dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i-1]];
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                  
            }
        }
        return dp[nums.length][sum1];
        
        
    }
}