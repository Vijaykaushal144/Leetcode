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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<TreeNode>();//insert element in queue
        List<List<Integer>> ls= new LinkedList<List<Integer>>();///create list for return 
        if(root==null) return ls;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            List<Integer> sublist= new LinkedList<Integer>();
            for(int i=0;i<size;i++)
            {
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                    sublist.add(queue.poll().val);   
            }
            
            //add the substring in to list;
            ls.add(sublist);
        }
        return ls;
    }
}