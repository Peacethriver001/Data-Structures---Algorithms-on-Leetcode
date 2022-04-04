import java.util.LinkedList;
import java.util.Queue;

/*

************ LEETCODE QUESTION **************

101. Symmetric Tree

Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Example 1:
Input: root = [1,2,2,3,4,4,3]
Output: true


Example 2:
Input: root = [1,2,2,null,3,null,3]
Output: false
 

Constraints:

The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100

*/



public class IsBinaryTreeSymmetric {

    //Using Recursion
    public boolean isSymmetric(TreeNode root){
        return isMirror(root, root);        
    }

    public boolean isMirror(TreeNode left_subtree, TreeNode right_subtree){
        if(left_subtree == null && right_subtree == null){return true;}
        if(left_subtree == null || right_subtree == null){return false;}
        return (left_subtree.val == right_subtree.val)
        && isMirror(left_subtree.right, right_subtree.left)
        && isMirror(left_subtree.left, right_subtree.right);
    }


    //Using Iteration
    public boolean isTreeSymmetric(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while(!queue.isEmpty()){
            TreeNode left_subtree = queue.poll();
            TreeNode right_subtree = queue.poll();

            if (left_subtree == null && right_subtree == null) {continue;}
            if (left_subtree == null || right_subtree == null) {return false;}
            if (left_subtree.val != right_subtree.val) {return false;}
            queue.add(left_subtree.left);
            queue.add(right_subtree.right);
            queue.add(left_subtree.right);
            queue.add(right_subtree.left);
        }
        return true;
    }
}
