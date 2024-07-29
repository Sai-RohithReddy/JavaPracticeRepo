public class FindPath {
    public boolean findPath(TreeNode root, int[] arr) {
        if (root == null) return false;
        return helper(root, arr, 0);
    }
    public boolean helper(TreeNode root, int[] arr, int idx) {
        if (root == null) return false;
        if (idx >= arr.length || root.data != arr[idx]) return false;
        if (root.left == null && root.right == null && idx == arr.length - 1) return true;

        return helper(root.left, arr, idx + 1) || helper(root.right, arr, idx + 1);
    }
}
