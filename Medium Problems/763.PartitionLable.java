class Solution {
    public List<Integer> partitionLabels(String s) {
        
        HashMap<Character, Integer> lastOcc = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            if (lastOcc.containsKey(s.charAt(i))) {
                lastOcc.replace(s.charAt(i), i);
            }
            else {
                lastOcc.put(s.charAt(i), i);
            }
        }
        
        List<Integer> part = new ArrayList<>();
        int i = 0;
        while (i < s.length()){
            int end = lastOcc.get(s.charAt(i));
            for (int j = i+1; j < end; j++) {
                if (lastOcc.get(s.charAt(j)) > end) {
                    end = lastOcc.get(s.charAt(j));
                }
            }
            part.add(end-i+1);
            i = end+1;
        }
        
        return part;
    }
}