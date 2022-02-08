class Solution {
    public int minimumSum(int num) {
        int k = num, i = 0;
        int[] arr = new int[4];
        while(k > 0) {
            arr[i++] = (k%10);
            k /= 10;
        }
        Arrays.sort(arr);
        for (i = 0; i<= arr.length-1; i++){
            if (i <= 1) {
                k += arr[i]*10;
            }
            else {
                k += arr[i];
            }
        }
        return k;
    }
}