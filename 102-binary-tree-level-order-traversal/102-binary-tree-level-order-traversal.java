/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> result = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(q.size() !=0)
        {
            List<Integer> level = new ArrayList<>();
            
            int qSize = q.size();
            for(int i = 0; i<qSize; i++){
                TreeNode node = q.remove();
                
                if(node!=null){
                    level.add(node.val);
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if(level.size()!=0)
            result.add(level);
        }
        
    return result;
    }
}