class Solution {
    public boolean isUgly(int n) {
        while(n > 0){
            if(n % 2 == 0){
                n = n / 2; //for n = 2 , n = 3
            }else if(n % 3 == 0){
                n = n / 3; //for n = 3 , new  n = 1
            }else if(n % 5 == 0){
                n = n / 5;
            }else{
                break;
            }
        }
        return n == 1; //if n ka value 1 hai , toh that means true hai
        
    }
}