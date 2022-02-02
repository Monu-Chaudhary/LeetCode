class Solution {
    public int maxArea(int[] height) {
       int max = 0;
        for(int i=0, j=height.length-1; j>i; ){
            max = Math.max(Math.min(height[i], height[j])*(j-i), max);
            if (height[i]<height[j]) i++;
            else j--;
        }
        return max;
    }
}

// O(n) time O(1) space shrinking window