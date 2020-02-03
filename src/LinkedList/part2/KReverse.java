package LinkedList.part2;

public class KReverse {
    public static LinkedListNode<Integer> KReverse(LinkedListNode<Integer> head,int k) {
        int i = 0;
        LinkedListNode<Integer> temp;
        LinkedListNode<Integer> previous = null;
        LinkedListNode<Integer> mid = null;
        LinkedListNode<Integer> current = head;
        while (i < k) {
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
            i++;
        }
        previous = current;
        mid = previous;
        current = current.next;

        while (current != null) {
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

      return head;
    }
}
