package lesson11;

public class BinarySearchTree {//Insert into a Binary Search Tree_leetcode 701
    //Khởi tạo rootNode
    public TreeNode root;

    //Hàm tạo
    public BinarySearchTree(){}

    //Viết hàm Insert
    public TreeNode insertIntoBST(TreeNode root, int val) {
        //Dùng vòng lặp
        if (root == null) {
            root = new TreeNode(val);
            return root;
        } else {
            TreeNode tempt = root;

            while (true) {
                if (val > tempt.value) { //val đi về phía bên phải BST
                    if (tempt.right == null) {
                        tempt.right = new TreeNode(val); //Nếu node bên phải tempt == null -> nhét new node có gt value vào
                        break;
                    } else {
                        tempt = tempt.right; //Còn không thì dịch tempt về bên phải 1 Node
                    }
                } else {
                    if (tempt.left == null) {//val đi về phía bên trái BST
                        tempt.left = new TreeNode(val);
                        break;
                    } else {
                        tempt = tempt.left;
                    }
                }
            }
        }
        return root;
    }

    //Dùng đệ quy
    public TreeNode insertIntoBST2(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        } else {
            if (val > root.value) {
                if (root.right==null) {
                    root.right = new TreeNode(val);
                } else insertIntoBST(root.right,val);
            } else {
                if (root.left==null) {
                    root.left = new TreeNode(val);
                } else insertIntoBST(root.left, val);
            }
        }
        return root;
    }
}
