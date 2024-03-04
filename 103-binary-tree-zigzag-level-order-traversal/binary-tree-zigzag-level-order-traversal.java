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
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
        return ans;
        LinkedList<TreeNode>queue=new LinkedList<>();
        List<Integer> small=new ArrayList<>();
        queue.addLast(root);
        boolean zig=false;
        while(!queue.isEmpty()){
            int qusize=queue.size();
            while(qusize-->0){
                TreeNode fnt=queue.removeFirst();
                small.add(fnt.val);
                if(fnt.left!=null)
                queue.add(fnt.left);
                if(fnt.right!=null)
                queue.add(fnt.right);
            }
            if(zig==true)
            {
               Collections.reverse(small);
            }
            zig=!zig;
            ans.add(new ArrayList<>(small));
            small.clear();
        }
        return ans;
        }
    }
