import java.util.LinkedList;

/*
************* LEETCODE QUESTION ******************

104. Maximum Depth of Binary Tree

Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2
 

Constraints:

The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 100

*/

public class MaxDepthOfBinaryTree {

    //Using RECURSION
    public int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }

        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);
        return Math.max(left_depth, right_depth) + 1;
    }


    //Using Iteration
    public int maximumDepth(TreeNode root){
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> depths = new LinkedList<>();

        if (root == null) {return 0;} 

        stack.add(root);
        depths.add(1);

        int depth = 0, currentDepth = 0;
        while (!stack.isEmpty()){
            root = stack.pollLast();
            currentDepth = depths.pollLast();
            if (root != null){
                depth = Math.max(depth, currentDepth);
                stack.add(root.left);
                stack.add(root.right);
                depths.add(currentDepth + 1);
                depths.add(currentDepth + 1);
            }
        }
        return depth;
    }
}
