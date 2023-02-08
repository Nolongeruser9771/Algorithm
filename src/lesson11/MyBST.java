package lesson11;

import java.util.ArrayList;
import java.util.List;

public class MyBST {// Binary Tree Preorder Traversal_leetcode_144
    public TreeNode root;

    public MyBST(){}

    List<Integer> nodeList = new ArrayList<>();

    //Duyệt Node - Left - Right
    public List<Integer> preorderTraversal(TreeNode root) {
        //Dùng Đệ quy

        TreeNode curNode = root;
        if (curNode==null) return nodeList;

        //duyệt node
        nodeList.add(curNode.value);

        //duyệt bên trái
        preorderTraversal(curNode.left);

        //duyệt bên phải
        preorderTraversal(curNode.right);
        return nodeList;
    }
}
