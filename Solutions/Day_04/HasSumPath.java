import java.util.LinkedList;

public class HasSumPath {
     //Using Iteration
     public boolean hasSumPathIteration(TreeNode root, int targetSum){
        if (root == null){
            return false;
        }

        LinkedList<TreeNode> node_stack = new LinkedList<>();
        LinkedList<Integer> sum_stack = new LinkedList<>();

        node_stack.add(root);
        sum_stack.add(targetSum - root.val);

        TreeNode node;
        int currentSum;

        while(!node_stack.isEmpty()){
            node = node_stack.pollLast();
            currentSum = sum_stack.pollLast();

            if ((node.left == null) && (node.right == null) && (currentSum == 0)){
                return true;
            }

            if(node.left != null){
                node_stack.push(node.left);
                sum_stack.push(currentSum - node.left.val);
            }

            if(node.right != null){
                node_stack.push(node.right);
                sum_stack.push(currentSum - node.right.val);
            }
        }
        return false;
    }
}
