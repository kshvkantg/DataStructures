package LinkedList.part1;
import java.util.Scanner;

public class AppendLastNToFirst {
    public static int count(LinkedListNode<Integer> head) {
        int count = 0;
        LinkedListNode<Integer> temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static LinkedListNode<Integer> appendLinkList(LinkedListNode<Integer> head, int n) {
        int i = 0;
        int iterations = count(head);
        LinkedListNode<Integer> head1 = head;
        LinkedListNode<Integer> tail1 = head;
        while (i < iterations - n - 1){
            tail1 = tail1.next;
            i++;
        }
        LinkedListNode<Integer> head2 = null,tail2 = null;
        head2 = tail1.next;
        tail2 = head2;
        tail1.next = null;

        while (tail2.next != null ){
            tail2 = tail2.next;
        }
        tail2.next = head1;

       return head2;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = InputOutput.scan();
        head = appendLinkList(head, 3);
        InputOutput.print(head);
    }
}
//test case 1 2 3 4 5 -1