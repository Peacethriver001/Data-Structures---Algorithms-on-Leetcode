//import java.util.LinkedList;

public class DiameterOfBinaryTree {
    public static int diameterOfBinaryTree(TreeNode root){
        int diameter = 0;
        if (root == null){
            return 0;
        }

        int left_depth = diameterOfBinaryTree(root.left);
        int right_depth = diameterOfBinaryTree(root.right);
        diameter = Math.max((left_depth + right_depth), diameter);
        return Math.max(left_depth, right_depth) + 1;
    }

    public static void main (String[]args){
        //int [] array = new int [] {1,2,3,4,5};
        //LinkedList<Integer> array = new TreeNode<Integer>();
        //System.out.println("The length of the diameter is: " + DiameterOfBinaryTree.diameterOfBinaryTree(array));
    }
}
