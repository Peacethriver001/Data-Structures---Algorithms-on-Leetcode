public class TopDownTreeRecursion {
    private int answer;
    public void maximum_depth(TreeNode root, int depth){
        if (root == null){
            return;
        }

        if (root.left == null && root.right == null){
            answer = Math.max(answer, depth);
        }

        maximum_depth(root.left, depth + 1);
        maximum_depth(root.right, depth + 1);
    }
}
