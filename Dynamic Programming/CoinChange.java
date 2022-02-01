class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        if(amount == 0) {
            return 0;
        }
        for (int j = 1; j <= coins.length; j++){
            int i = coins.length-j, k = amount, count = 0;;
            while(i>=0){
                System.out.println(k+" "+i);
                if (k == coins[i]) {
                    return ++count;
                }
                if(k > coins[i]) {
                    k -= coins[i];
                    count++;
                }
                if(k < coins[i]) {
                    i--;
                }
            }
        }
        return -1;
    }
}