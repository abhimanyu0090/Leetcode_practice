class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        int temp = n;
        while(temp > 0){
            temp = temp / 5;
            count++;
        }
        int ans = 0;
        for(int i = 1; i <= count; i++){
            ans += n / Math.pow(5,i);
        }
        return ans;
    }
}