class RandomizedSet {
    
    private Map<Integer, Integer> map;
    private List<Integer> list;
    private int size;
    private Random rand;
    
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        size = 0;
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        this.map.put(val, size);
        this.list.add(val);
        size++;
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int ind = map.get(val);
        this.map.remove(val);
        this.list.set(ind, this.list.get(size-1));
        this.map.replace(this.list.get(ind), ind);
        this.list.remove(size-1);
        size--;
        return true;
    }
    
    public int getRandom() {
        if (size <= 0) return -1;
        int i = rand.nextInt(size);
        return list.get(i);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */