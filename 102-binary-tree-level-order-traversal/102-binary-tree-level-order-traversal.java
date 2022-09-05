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
        
        //base case
        if(root==null){
            return new ArrayList<List<Integer>>();
        }
        
       List<List<Integer>> result = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        //iterate through each level
        while(q.size() !=0)
        {
            List<Integer> level = new ArrayList<>();
            
            int qSize = q.size();
            for(int i = 0; i<qSize; i++){
                TreeNode node = q.remove();
                
                level.add(node.val);
                if(node.left!=null)
                q.add(node.left);
                if(node.right!=null)
                q.add(node.right);
                
            }
            result.add(level);
        }
        
    return result;
    }
}