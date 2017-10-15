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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> Q = new LinkedList<>();
        if(root==null)
            return res;
        Q.offer(root);
        while(!Q.isEmpty()){
            int size = Q.size();
            double sum = 0.0;
            for(int i=0;i<size;i++){
                TreeNode temp = Q.poll();
                sum += temp.val;
                if(temp.left!=null)
                    Q.offer(temp.left);
                if(temp.right!=null)
                    Q.offer(temp.right);
            }
            res.add(sum/size);
        }
        return res;
    }
}