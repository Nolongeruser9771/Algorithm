package lesson11;

public class Test {
    //Binary Search Tree: Cây nhị phân
    //AVL Tree: cây tự cân bằng

    public static void main(String[] args) {
        BinaryTree myBinaryTree = new BinaryTree();
        myBinaryTree.init();

        BinarySearchTree myBST = new BinarySearchTree();
        myBST.root = myBST.insertIntoBST(myBST.root,6);
        myBST.root = myBST.insertIntoBST(myBST.root,5);
        myBST.root = myBST.insertIntoBST(myBST.root,1);
        myBST.root = myBST.insertIntoBST(myBST.root,2);
        myBST.root = myBST.insertIntoBST(myBST.root,3);
    }
}
