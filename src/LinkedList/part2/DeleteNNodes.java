package LinkedList.part2;
import java.util.*;
public class DeleteNNodes {
    public static LinkedListNode<Integer> DeleteNNodes(LinkedListNode<Integer> head,int m,int n){
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> prevDeleteStart = null;

        while (temp != null){
            if(temp.next != null) {
                for (int i = 0; i < m; i++) {
                    temp = temp.next;
                }
            }
            prevDeleteStart = temp;

            if (temp.next != null) {
                for (int i = 0; i < n + 1; i++) {
                    temp = temp.next;
                }

                prevDeleteStart.next = temp;
            }

        }
        return head;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedListNode<Integer> head = InputOutput.scan();
        int n = scan.nextInt();
        int m = scan.nextInt();

        DeleteNNodes(head,m,n);
        InputOutput.print(head);

    }
}
