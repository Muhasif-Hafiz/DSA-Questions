//import javax.swing.tree.TreeNode;
//import java.util.*;
//
//public class BinaryTreeLevelOrderTraversal102 {
//    public static void main(String[] args) {
//
//    }
//
//    public static List<List<Integer>> levelOrder(TreeNode root) {
//
//        List<List<Integer>> result = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//
//        if (root == null) {
//            return result;
//        }
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            int EachLevel = queue.size();
//
//            List<Integer> currentList = new ArrayList<>(EachLevel);
//
//            for (int i = 0; i < EachLevel; i++) {
//
//                TreeNode currentNode = queue.poll();
//
//                currentList.add(currentNode.val);
//
//                if (currentNode.left != null) {
//
//                    queue.offer(currentNode.left);
//
//                }
//                if (currentNode.right != null) {
//
//                    queue.offer(currentNode.right);
//
//                }
//
//            }
//            result.add(currentList);
//
//
//
//        }
//
//
//        return result;
//    }
//}
