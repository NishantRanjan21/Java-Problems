//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int multiply = 1;
        int rem;
        while(n > 0){
            rem = n%10;
            sum+=rem;
            multiply = multiply * rem;
            n/=10;
        }
        int sol = multiply - sum;
        return sol;
        
    }
}