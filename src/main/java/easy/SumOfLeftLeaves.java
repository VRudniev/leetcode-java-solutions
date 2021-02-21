package easy;

/**
 *
 * https://leetcode.com/problems/sum-of-left-leaves/
 *
 * Find the sum of all left leaves in a given binary tree.
 *
 * Example:
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */

public class SumOfLeftLeaves {

	public class TreeNode {
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

	public int sumOfLeftLeaves(TreeNode root) {
		if(root == null) return 0;
		int ans = 0;
		if(root.left != null) {
			if(root.left.left == null && root.left.right == null) ans += root.left.val;
			else ans += sumOfLeftLeaves(root.left);
		}
		ans += sumOfLeftLeaves(root.right);

		return ans;
	}

}
