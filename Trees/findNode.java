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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return getTargetCopyHelper(original, cloned, target);
    }
    
    private TreeNode getTargetCopyHelper(TreeNode original, TreeNode cloned, TreeNode target) {
        if (original == null) {
            return null;
        }
        
        if (original == target) {
            return cloned;
        }
        
        TreeNode leftResult = getTargetCopyHelper(original.left, cloned.left, target);
        if (leftResult != null) {
            return leftResult;
        }
        
        return getTargetCopyHelper(original.right, cloned.right, target);
    }
}
