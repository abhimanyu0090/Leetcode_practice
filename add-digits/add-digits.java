class Solution {
    public int addDigits(int num) {
       int sum = 0;
        while(num != 0){
        sum += num % 10;  //num = 38 ---rem = 8
        num = num / 10;    //num = 38/10 --- num = 3    
        }
        
        if(sum > 9){
            return addDigits(sum);
        }else{
            return sum;
        }
        
    }
}