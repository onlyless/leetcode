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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        Stack<TreeNode> s = new Stack<TreeNode>();
        
        if(root.left!=null){
            if(root.right==null)
                return false;
            s.push(root.left);
            s.push(root.right); 
        }else if(root.right!=null)
            return false;
        
        TreeNode left,right;
        while(!s.empty()){
            if(s.size()%2!=0)
                return false;
            right = s.pop();
            left = s.pop();
            
            if(left.val!=right.val)
                return false;
            
            if(left.left!=null){
                if(right.right==null)
                    return false;
                s.push(left.left);
                s.push(right.right);
            }else if(right.right!=null)
                return false;
            
            if(left.right!=null){
                if(right.left==null)
                    return false;
                s.push(left.right);
                s.push(right.left);
            }else if(right.left!=null)
                return false;
        }
        return true;
    }
        
        
}