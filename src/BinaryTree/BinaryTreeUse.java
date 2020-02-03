package BinaryTree;
import java.util.Scanner;
public class BinaryTreeUse {

    private static BinaryTreeNode<Integer> TakeInput(Scanner scan){
        int RootData;
        System.out.println("Enter root Data");
        RootData = scan.nextInt();
        if(RootData == -1){
            BinaryTreeNode<Integer> node = null;
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(RootData);
        root.left = TakeInput(scan);
        root.right = TakeInput(scan);
        return root;
    }

    public static void print(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        if(root.left != null){
            System.out.print("R :" + " "+ root.left.data + " ");
        }
        if (root.right != null){
            System.out.print("L :" + " " + root.right.data + " ");
        }
        System.out.println();
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
//
//        root.left = node1;
//        root.right = node2;
        Scanner scan = new Scanner(System.in);
        BinaryTreeNode<Integer> root = TakeInput(scan);
        print(root);

    }
}
