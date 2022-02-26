class Solution {
    public int orangesRotting(int[][] grid) {
        int count = 0;
        int time = 0;
        int m = grid.length, n = grid[0].length;
        if (n*m <=1 && grid[n-1][m-1]!=1) return 0;
        List<List<Integer>> rot = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    List<Integer> ind = new ArrayList<>();
                    ind.add(i);
                    ind.add(j);
                    rot.add(ind);
                    count++;
                    // System.out.println("A: "+i+" "+j);
                }
                else if (grid[i][j] == 0) count++;
            }
        }
        
        int i = 0, len = 0;
        while(i < rot.size() && count < m*n) {
            len = rot.size();
            time++;
            // System.out.println("Time "+time);
            for (; i < len; i++) {
                count = BLS(grid, i, rot, count);
            }
        }
        // System.out.println(count);
        if (count == m*n) return time;
        return -1;
        
    }
    
    public int BLS(int[][] grid, int index, List<List<Integer>> rot, int count) {
        int i = rot.get(index).get(0), j = rot.get(index).get(1);
        // System.out.println(i+" "+j);
        //up
        if (i-1 >=0 && grid[i-1][j] == 1) {
            grid[i-1][j] = 2;
            rot.add(addRot(i-1,j));
            count++;
        }
        //down
        if (i+1 < grid.length && grid[i+1][j] == 1) {
            grid[i+1][j] = 2;
            rot.add(addRot(i+1,j));
            count++;
        }
        //left
        if (j-1 >= 0 && grid[i][j-1] == 1) {
            grid[i][j-1] = 2;
            rot.add(addRot(i,j-1));
            count++;
        }
        //right
        if (j+1 < grid[i].length && grid[i][j+1] == 1) {
            grid[i][j+1] = 2;
            rot.add(addRot(i,j+1));
            count++;
        }
        return count;
    }
    
    public List<Integer> addRot(int m, int n) {
        List<Integer> ind = new ArrayList<>();
        ind.add(m);
        ind.add(n);
        return ind;
    }
}