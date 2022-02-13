class Solution {
    public boolean isPalindrome(String s) {
        String[] str = s.split("\\W+");
        int n = 0;
        s = "";
        while(n <= str.length-1){
            s +=str[n++];
        }
        char[] c = s.replaceAll("_","").toLowerCase().toCharArray();
        for(int i=0, j=c.length-1; i<j; i++, j--){
            if (c[i] != c[j]) return false;
        }
        return true;
    }
}