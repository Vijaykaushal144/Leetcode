// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public int maxLevelSum(TreeNode root) {
//         Integer mix=Integer.MAX_VALUE;
//         int level=0;
//         int current=0;
//         Queue<TreeNode> q = new LinkedList<>();
//            q.add(root);
        
//         while(!q.isEmpty())
//         {
//             int len=q.size();
//             int sum=0;
            
//             for(int i=0;i<len;i++)
//             {
//                 TreeNode curr=q.poll();
               
//                 sum+=curr.val;
                
//                 q.poll();
                
//                 if(curr.left!=null)
//                     q.add(curr.left);
//                 if(curr.right!=null)
//                     q.add(curr.right);
                 
//             }
            
//             level++;
//             current=mix>=sum?level:current;
//             mix=Math.max(mix,sum);
            
//         }
//         return current;
        
//     }
// }
class Solution {

    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        int currLevel = 0;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        while (!q.isEmpty()) {
            int count = q.size();
            currSum = 0;
            for (int i = 0; i < count; i++) {
                TreeNode curr = q.poll();
                currSum += curr.val;
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            currLevel++;
            level = maxSum >= currSum ? level : currLevel;
            maxSum = Math.max(maxSum, currSum);
        }
        return level;
    }
}