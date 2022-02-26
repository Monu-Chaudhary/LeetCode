class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        Map<String, Integer> freqMap = new HashMap<String, Integer>();
        PriorityQueue<String> minHeap = new PriorityQueue<>((a,b)-> {
            return freqMap.get(a) != freqMap.get(b) ? freqMap.get(a) - freqMap.get(b) : b.compareTo(a);
        });
        
        for(String word: words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
        
        for(Map.Entry<String,Integer> entry : freqMap.entrySet()) {
            minHeap.add(entry.getKey());
                        // System.out.println("add "+ entry.getKey());

            if (minHeap.size()>k) minHeap.remove();
            // System.out.println(minHeap.peek());
        }

        
        List<String> res = new ArrayList<>();
        
        while(k-- > 0) {
            res.add(minHeap.poll());
        }
        Collections.reverse(res);
        
        return res;        
    }
}