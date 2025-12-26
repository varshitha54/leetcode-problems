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
        List<Integer> res=new ArrayList<>();
        inorderfunction(root,res);
        return res;

    }
    private void inorderfunction(TreeNode node,List<Integer> res){
    if(node == null)    return;
    inorderfunction(node.left,res);
    res.add(node.val);
    inorderfunction(node.right,res);
    }
}