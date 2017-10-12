/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
        int sum =0;
        Queue<TreeNode> Q = new LinkedList<TreeNode>();
        Q.offer(root);
        while(!Q.isEmpty()){
            TreeNode temp  = Q.poll();
            if(temp.left!=null){
                if(temp.left.left==null&&temp.left.right==null)
                    sum += temp.left.val;
                Q.offer(temp.left);
            }
            if(temp.right!=null){
                Q.offer(temp.right);
            }
            
        }
        return sum;
    }
}