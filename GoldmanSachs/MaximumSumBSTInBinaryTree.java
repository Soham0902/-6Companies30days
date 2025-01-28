package GoldmanSachs;

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MaximumSumBSTInBinaryTree {
    private int maxSum = 0;
    public int maxSumBST(TreeNode root) {
        postOrder(root);
        return maxSum;
    }

    private int[] postOrder(TreeNode root){
        if(root == null){
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        }
        int[] left = postOrder(root.left);
        int[] right = postOrder(root.right);

        if(!(left!=null && right!=null && root.val > left[1] && root.val < right[0])){
            return null;
        }

        int sum = root.val + left[2] + right[2];
        maxSum = Math.max(maxSum,sum);
        int min = Math.min(root.val,left[0]);
        int max = Math.max(root.val, right[1]);
        return new int[]{min,max,sum};
    }
}
