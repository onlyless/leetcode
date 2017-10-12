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
    public boolean isSameTree(TreeNode p, TreeNode q) {
         if((q!=null)&&(p!=null)&&q.val!=p.val)
            return false;
        if(p==null&&q==null)
            return true;
        else if((p!=null&&q==null)||(p==null&&q!=null))
            return false;
        if(isSameTree(p.left,q.left)&&isSameTree(p.right,q.right))
            return true;
        else 
            return false;
    }
}