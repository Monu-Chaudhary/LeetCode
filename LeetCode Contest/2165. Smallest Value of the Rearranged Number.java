class Solution {
    public long smallestNumber(long num) {
        if (num == 0) return num;
        long res = Math.abs(num);
        int len = (int)Math.floor(Math.log10(res) + 1), i = 0;
        int[] arr = new int[len];
        while(res != 0){
            arr[i++] = (int)(res%10);
            res /= 10;
            System.out.println(arr[i-1]);
        }
        Arrays.sort(arr);
        if (num > 0) {
            for (i = 0; i < len; i++){
                int j = 0;
                if (arr[0] == 0) {
                    j = 1;
                    while (arr[j] == 0) {
                        j++;
                    }
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                res += arr[i] * Math.pow(10, len-i-1);
                if (j > 0) { i = j;}
            }   
        }
        else if (num < 0) {
            for (i = len -1; i >=0; i--){
                res += arr[i] * Math.pow(10, i);
            }
            res *= -1;
        }
        
        return res;
    }
}