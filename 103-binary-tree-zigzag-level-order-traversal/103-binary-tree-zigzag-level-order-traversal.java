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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
                                                                
        //base case
        if(root==null){
            return result;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int left = 0;
        
        //iterate through each level
        while(q.size() !=0)
        {
            List<Integer> level = new ArrayList<>();
            
            int qSize = q.size();
            //add right and left vals, then add children to the queue for next iteration
            for(int i = 0; i<qSize; i++){
                TreeNode node = q.poll();
                if(node != null){
                    if(node.val != -101){
                        if(left%2 == 0)
                            level.add(node.val); 
                        else level.add(0,node.val);
                } 
                
                if(node.left != null)
                    q.add(node.left);
                
                if(node.right != null)
                    q.add(node.right);
                
                if(node.val != -101)
                    q.add(new TreeNode(-101));
                }
            }
            
            if(level.size()>0)
                result.add(level);
            left++;
            
        }
        
        
    return result;
    }
}
