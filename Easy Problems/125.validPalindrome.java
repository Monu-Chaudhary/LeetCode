class Solution {
    public boolean isPalindrome(String s) {
        String[] str = s.split("\\W+");
        int n = 0;
        s = "";
        while(n <= str.length-1){
            s +=str[n++];
        }
        s = s.replaceAll("_","").toLowerCase();
        for(int i=0, j=s.length()-1; i<j; i++, j--){
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}