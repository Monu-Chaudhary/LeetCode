/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {

    private List<Integer> inOrder = new ArrayList<>();
    int pointer = 0;
    
    private void inOrderTrav(TreeNode root) {
        if (root == null) return;
        inOrderTrav(root.left);
        inOrder.add(root.val);
        inOrderTrav(root.right);
    }
    
    public BSTIterator(TreeNode root) {
        this.inOrderTrav(root);
    }
    
    public int next() {
        return this.inOrder.get(this.pointer++);
    }
    
    public boolean hasNext() {
        return this.inOrder.size() > this.pointer;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */