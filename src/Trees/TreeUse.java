package Trees;
import java.util.Scanner;

public class TreeUse {
    private static TreeNode<Integer> insert() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter next node data");
        int n = scan.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("Enter no of child nodes for"+ " " + n);
        int ChildCount = scan.nextInt();
        for(int i = 0; i < ChildCount ; i++){
            TreeNode<Integer> child = insert();
            root.children.add(child);
        }
        return root;
    }
    public static int print(TreeNode<Integer> root, int k){
        String s = root.data + " " + ":" + " ";
        for (int i = 0 ; i < root.children.size() ; i++){
            k = k + root.children.get(i).data;
        }
        System.out.println(s + " ");
        for (int i = 0 ; i < root.children.size() ; i++){
            print(root.children.get(i),k);
        }
        return k;
    }
    private static int sum( TreeNode<Integer> root){
        int ans = print(root,0) + root.data;
        return ans;

    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(2);
        TreeNode<Integer> node1 = new TreeNode<>(3);
        TreeNode<Integer> node2 = new TreeNode<>(4);
        TreeNode<Integer> node3 = new TreeNode<>(5);
        TreeNode<Integer> node4 = new TreeNode<>(6);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);

//      TreeNode<Integer> root = insert();
        System.out.println(print(root,0));
        System.out.println(sum(root));


    }

    public static void print(TreeNode<Integer> root) {
    }
}
