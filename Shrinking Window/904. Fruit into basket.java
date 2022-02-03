class Solution {
    public int totalFruit(int[] fruits) {
        int x= 0, z=-1, count = 1, max = 0;
        for(int i = 1; i <= fruits.length - 1; i++) {
            if (fruits[x] == fruits[i]) {
                count += 1;
                if (z != -1) {x = z;
                z = i;}
            }
            else if (z != -1 && fruits[i] == fruits[z]) {
                count += 1;
            }
            else if (z == -1) {
                count += 1;
                z = i;
            }
            else {
                x = z;
                z = i;
                max = Math.max(max, count);
                count = z - x + 1;
            }
            // count = z - x + 1;
        }            
        return Math.max(max, count);
    }
}

// sliding window O(n) time O(1) space