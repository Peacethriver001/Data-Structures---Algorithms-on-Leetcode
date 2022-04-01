public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    //Constructors
    TreeNode (){}
    TreeNode (int x){
        val = x;
    }
    TreeNode (int x, TreeNode _left, TreeNode _right){
        val = x;
        left = _left;
        right = _right;
    }
}
