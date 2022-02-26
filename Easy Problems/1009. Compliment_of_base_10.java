class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        int num = 0, i = 0;
        while(n!=0) {
            num += (n%2 == 1 ? 0: 1) * Math.pow(2, i++);
            n /= 2;
        }
        return num;
    }
}