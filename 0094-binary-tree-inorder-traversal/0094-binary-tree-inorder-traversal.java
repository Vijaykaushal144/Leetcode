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
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>ls= new ArrayList<Integer>();
        dfs(root,ls);
        return ls;
    }
    public void dfs(TreeNode root,List<Integer> ls)
    {
        if(root==null) return ;
        
        dfs(root.left,ls);
        ls.add(root.val);
        dfs(root.right,ls);
    }
}