class Solution {
    
    public int climbStairs(int n) {
        int one = 1, two = 1, i = 0, temp;
        while (i++ < n-1) {
            temp = one;
            one = temp + two;
            two = temp;
        }
        return one;
    }
}