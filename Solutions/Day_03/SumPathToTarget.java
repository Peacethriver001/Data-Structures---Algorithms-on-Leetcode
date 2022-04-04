
/*

************ LEETCODE QUESTION ************

Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the 
values along the path equals targetSum.

A leaf is a node with no children.


*/

public class SumPathToTarget {

    //Using Recursion
    public boolean hasSumPath(TreeNode root, int sum){
        if (root == null){
            return false;
        }

        sum -= root.val;
        if ((root.left == null) && (root.right == null)){ return false; }
        return (hasSumPath(root.left, sum) || hasSumPath(root.right, sum));
    }



    //Using Iteration

}
