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

public class Codec {

    // Encodes a tree to a single string.
    public List<String> serialize(TreeNode root) {
        
        ArrayList<String> res=new ArrayList<>();
        dfs(root,res);
        return res;
        
    }
    void dfs(TreeNode root,ArrayList<String> res){
        if(root==null){
            res.add("null");
            return;
        }
        res.add(String.valueOf((root.val)));
        dfs(root.left,res);
        dfs(root.right,res);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(List<String> data) {
        Collections.reverse(data);
       
        return helper(data);
           
    }
    
   TreeNode helper(List<String> data){

    String val = data.remove(data.size()-1);

    if(val.equals("null")){
        return null;
    }

    TreeNode node = new TreeNode(Integer.parseInt(val));

    node.left = helper(data);
    node.right = helper(data);

    return node;
}
}

