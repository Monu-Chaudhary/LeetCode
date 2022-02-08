class Solution {
    public int minCostSetTime(int startAt, int moveCost, int pushCost, int targetSeconds) {
        int ts = targetSeconds, start = 0, cost, minCost = Integer.MAX_VALUE, min, k = 0;
        Set<Integer> set = new HashSet<Integer> ();
        min = ts / 60;
        int sec = targetSeconds - 60 * min;
        while(min >= 0 && sec < 100){
            System.out.println(ts);
            while (ts > 0) {
                set.add(ts%10);
                start = ts;
                ts /= 10;
                k++;
            }
            cost = moveCost * (set.size()==0?1:set.size())+ pushCost *(k==0?1:k);
            if (start == startAt) {
                cost -= moveCost;
            }
            System.out.println(cost);
            minCost = Math.min(cost, minCost);
            set.clear();
            sec = targetSeconds - 60 * min;
                ts = min * 100 + sec;
            min--;
            k = 0;
        }
        return minCost;
    }
}