//import java.util.LinkedList;

/*

************ LEETCODE QUESTION ************

Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the 
values along the path equals targetSum.

A leaf is a node with no children.


*/

public class SumPathToTarget {

    //Using Recursion
    public boolean hasSumPath(TreeNode root, int targetSum){
        if (root == null){
            return false;
        }

        targetSum -= root.val;
        if ((root.left == null) && (root.right == null)){ return (targetSum == 0); }
        return (hasSumPath(root.left, targetSum) || hasSumPath(root.right, targetSum));
    }
}
