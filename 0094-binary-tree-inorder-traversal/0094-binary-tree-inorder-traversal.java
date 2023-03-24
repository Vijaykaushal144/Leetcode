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

//using iteration.
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList < Integer > inOrder = new ArrayList < > ();
        Stack <TreeNode> s = new Stack <> ();
        while (true) {
            if (root != null) {
                s.push(root);
                 //insert value in to stack and move left of tree
                root = root.left;
            } else {
                if (s.isEmpty()) break;
                root = s.pop();
                inOrder.add(root.val);
                 //insert value in to stack and move  of tree
                root = root.right;
            }
        }
        return inOrder;
       
    }
}


// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         // List<Integer>ls= new ArrayList<Integer>();
//         // dfs(root,ls);
//         // return ls;
//     }
// //     public void dfs(TreeNode root,List<Integer> ls)
// //     {
// //         if(root==null) return ;
        
// //         dfs(root.left,ls);
// //         ls.add(root.val);
// //         dfs(root.right,ls);
// //     }
// }



