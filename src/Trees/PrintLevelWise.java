package Trees;
import java.util.Scanner;

class PrintLevelWise{
    public static TreeNode<Integer> TakeInputLevelWise() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter root Data");
        int RootData = scan.nextInt();

        QueueUsingLL<TreeNode<Integer>> PendingNodes = new QueueUsingLL<>();
        TreeNode<Integer> root = new TreeNode<>(RootData);
        PendingNodes.enqueue(root);
        while (!PendingNodes.isEmpty()){
            try {
                TreeNode<Integer> FrontNOde = PendingNodes.dequeue();
                System.out.println("Enter no of Child Nodes ");
                int noOfChildNodes = scan.nextInt();
                for(int i = 0 ; i < noOfChildNodes;i++){
                    System.out.println("Enter"+ " " +(i + 1) +" th child of " + FrontNOde.data );
                    int childNodeData = scan.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<>(childNodeData);
                    FrontNOde.children.add(childNode);
                    PendingNodes.enqueue(childNode);
                }
            }
            catch (QueueEmptyException e){
                return null;
            }
        }
        return root;
    }

    public static void PrintLevelWise(TreeNode<Integer> root){
        QueueUsingLL<TreeNode<Integer>> pNode = new QueueUsingLL<TreeNode<Integer>>();
        pNode.enqueue(root);
        while (!pNode.isEmpty()){
            TreeNode<Integer> save = null;
            for (int i = 0 ; i < pNode.size() ; i++){
                try {
                    save = pNode.dequeue();
                }
                catch (QueueEmptyException e){

                }
                System.out.print(save.data + " ");
               for(int j = 0 ; j <save.children.size();j++){
                   pNode.enqueue(save.children.get(j));
               }

            }
            System.out.println();
        }
    }

    public static TreeNode<Integer> FindSecondLargest(TreeNode<Integer> root){
        int[] arr = new int[2];
        arr[0] = 0;
        arr[1] = 0;
        QueueUsingLL<TreeNode<Integer>> pNode = new QueueUsingLL<TreeNode<Integer>>();
        pNode.enqueue(root);
        while (!pNode.isEmpty()){
            TreeNode<Integer> save = null;
            for (int i = 0 ; i < pNode.size() ; i++) {
                try {
                    save = pNode.dequeue();
                    if(save.data > arr[0] && save.data > arr[1]){
                        arr[1] = arr[0];
                        arr[0] = save.data;
                    }
                    else if (save.data < arr[0] && save.data > arr[1]){
                        arr[1] = save.data;
                    }
                    else if(save.data < arr[0] && save.data < arr[1]){
                             if(arr[0] == arr[1]){
                                 arr[1] = save.data;
                             }
                    }
                } catch (QueueEmptyException e) {

                }
                System.out.print(save.data + " ");
                for (int j = 0; j < save.children.size(); j++) {
                    pNode.enqueue(save.children.get(j));
                }

            }
        }
        TreeNode<Integer> ans = new TreeNode<>(arr[1]);
      return ans;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TakeInputLevelWise();
//        PrintLevelWise(root);
        System.out.println(FindSecondLargest(root).data);
    }

}