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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();

        q.offer(root);

        

        while(!q.isEmpty()){
            TreeNode rightMost=null;
            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                rightMost=temp;
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            if(rightMost!=null){
                res.add(rightMost.val);
            }
        }
        return res;
        
    }
}
