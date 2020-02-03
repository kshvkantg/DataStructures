package LinkedList.part1;
import java.util.Scanner;

public class DeleteNode {

    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head,int position){
        if(position == 0 ){
            head = head.next;
            return head;
        }
        else {
         LinkedListNode<Integer> temp = head;
         LinkedListNode<Integer> delete = null;
         int i = 0;
         while (i < position - 1){
             temp = temp.next;
             i++;
         }
         delete = temp.next.next;
         temp.next = delete;
         return head;
        }
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = InputOutput.scan();
        head = deleteNode(head,0);
        InputOutput.print(head);
    }
}
//test case 0 1 2 3 4 -1
