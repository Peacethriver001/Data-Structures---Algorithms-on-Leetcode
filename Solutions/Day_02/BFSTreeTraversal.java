import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTreeTraversal {
    public List<List<Integer>> BFSTraversal(TreeNode root){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if (root == null){
            return list;
        }

        queue.offer(root);
        TreeNode current;
        while (!queue.isEmpty()){
            List<Integer> subList = new LinkedList<Integer>();
            int size = queue.size();

            //traverse the nodes in the same level
            for(int i = 0; i < size; i++){
                current = queue.poll();
                subList.add(current.val);

                //Check if the left child is null 
                if(current.left != null){
                    queue.offer(current.left);
                }

                //Check if the right child is null
                if(current.right != null){
                    queue.offer(current.right);
                }
            }
            //Add each sublist to the main list
            list.add(subList);
        }
        return list;
    }

    // public static void main(String [] args){
    //     TreeNode root = [3, 9, 20, null, null, 15, 7];
    // }
}
