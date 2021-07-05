class Solution {
public:
    int sumDigits(int n) {
        int sum = 0;
        while (n) {
            sum+=pow(n%10,2);
            n/=10;
        }
        return sum;
    }
	
    bool isHappy(int n) {
        set<int> nums;
        while(n!=1){
            int s = sumDigits(n);
            // If number already in set, there's a cycle,
            // so return false
            if (nums.find(s)!=nums.end()){
                return false;
            }
            else{
                nums.insert(s);
                n = s;
            }
        }
        return true;
    }
};