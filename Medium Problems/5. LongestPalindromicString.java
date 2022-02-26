class Solution {
    String res = "";
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        int start = 0, end = 0;
        for (int i=0; i<s.length(); i++) {
            int l1 = expandCenter(s, i, i);
            int l2 = expandCenter(s, i, i+1);
            int len = Math.max(l1, l2);
            if (len > end - start) {
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start, end+1);
    }
    
    public int expandCenter(String s, int l, int r) {
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r-l-1;
    }
}