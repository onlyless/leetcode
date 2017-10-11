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
    public String tree2str(TreeNode t) {
        if(t==null)
            return "";
        String res = ""+t.val;
        
        String left = tree2str(t.left);
        String right = tree2str(t.right);
        
        if("".equals(left)&&"".equals(right))
            return res;
        if("".equals(left))
            return res+"()"+"("+right+")";
        if("".equals(right))
            return res+"("+left+")";
        return res+"("+left+")"+"("+right+")";
        
    }
}
