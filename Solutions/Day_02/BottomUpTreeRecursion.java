public class BottomUpTreeRecursion {
    public int maximum_depth(TreeNode root){
        if(root == null){
            return 0;
        }

        int left_depth = maximum_depth(root.left);
        int right_depth = maximum_depth(root.right);
        return Math.max(left_depth, right_depth) + 1;
    }
}
