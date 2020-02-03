package LinkedList.part1;

public class MergeTwoSorted {
    public static LinkedListNode<Integer> MergeTwoSorted(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2){

        LinkedListNode<Integer> head = null,tail = null;
        if (head2.data > head1.data) {
            head = head1;
            tail = head1;
            head1 = head1.next;
        } else {
            head = head2;
            tail = head2;
            head2 = head2.next;
        }

        while (head1.next != null && head2.next != null) {
            if (head1.data < head2.data){

            }

        }
           return head;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> list1 = InputOutput.scan();
        LinkedListNode<Integer> list2 = InputOutput.scan();

        LinkedListNode<Integer> head = MergeTwoSorted(list1,list2);
        InputOutput.print(head);
    }
}
