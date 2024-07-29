import java.util.*;

public class SerialiseAndDescerialize {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        String s = serializeToString(root);
        
        System.out.println(s);

        TreeNode res = deserializeFromStrin(s);

        preOrder(res);
        System.out.println();
        inOrder(res);
        System.out.println();
        postOrder(res);
        System.out.println("\n-------------------------------------");

        ArrayList<String> temp = serializeToArrayList(root);
        
        for (String str : temp) {
            System.out.print(str + ",");
        }

        TreeNode res2 = deserializeFromArrayList(temp);
        System.out.println();
        preOrder(res2);
        System.out.println();
        inOrder(res2);
        System.out.println();
        postOrder(res2);
    }
    public static String serializeToString(TreeNode root) {
        if (root == null) {
            return "";
        }
        Queue<TreeNode> queue = new LinkedList<>();
        String res = "";

        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr == null) {
                res += "null,";
                continue;
            }
            String temp = String.valueOf(curr.data);
            res += temp + ",";

            queue.offer(curr.left);
            queue.offer(curr.right);
        }
        return res;
    }
    public static TreeNode deserializeFromStrin(String data) {

        if (data == "") return null;
        
        String[] nodeVal = data.split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        int idx = 0;
        String t = nodeVal[idx++];
        
        if (t.equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(t));

        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode cur = queue.poll();

            if (idx < nodeVal.length - 1) {
                t = nodeVal[idx++];
                if (!t.equals("null")) {
                    cur.left = new TreeNode(Integer.parseInt(t));
                    queue.offer(cur.left);
                }
            }
            if (idx < nodeVal.length - 1) {
                t = nodeVal[idx++];
                if (!t.equals("null")) {
                    cur.right = new TreeNode(Integer.parseInt(t));
                    queue.offer(cur.right);
                }
            }
        }
        return root;
    }
    
    public static ArrayList<String> serializeToArrayList(TreeNode root) {
        ArrayList<String> res = new ArrayList<>();
        serializeToArrayListUtil(root, res);
        
        return res;
    }
    public static void serializeToArrayListUtil(TreeNode root, ArrayList<String> arr) {
        if (root == null) {
            arr.add("null");
            return;
        }
        arr.add(String.valueOf(root.data));
        serializeToArrayListUtil(root.left, arr);
        serializeToArrayListUtil(root.right, arr);
    }
    public static TreeNode deserializeFromArrayList(ArrayList<String> data) {
        Collections.reverse(data);
        TreeNode root = deserializeFromArrayListUtil(data);
        return root;
    }
    public static TreeNode deserializeFromArrayListUtil(ArrayList<String> data) {
        String str = data.remove(data.size() - 1);

        if (str.equals("null")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.valueOf(str));

        node.left = deserializeFromArrayListUtil(data);
        node.right = deserializeFromArrayListUtil(data);

        return node;
    }
    
    public static void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(TreeNode root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void postOrder(TreeNode root) {
        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}
