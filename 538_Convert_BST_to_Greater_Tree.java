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
    int sum=0;
    public void sumval(TreeNode root){
        if(root==null)
            return ;
        sumval(root.right);
        root.val += sum;
        sum = root.val;
        sumval(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
       sumval(root);
        return root;
    }
}
