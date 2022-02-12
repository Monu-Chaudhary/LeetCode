class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        for(int i = 0, j = 0; i < c1.length && j < c2.length; ) {
            if (c1[i] == c2[j]) {
                i++;
                j++;
            }
            else if (c1[i] > c2[j]) {
                j++;
            }
            else {
                return false;
            }
        }
        
        return true;
    }
}