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
        if(root==null){
            return new LinkedList<>();
        }
        List<List<Integer>> result=new LinkedList<>();
    
        Queue<TreeNode> q=new LinkedList<>();
        int ind=0;

        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            
            result.add(new LinkedList<>());

            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                result.get(ind).add(temp.val);

                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }

            }
            ind++;
        }
        return result;

        
    }
}
