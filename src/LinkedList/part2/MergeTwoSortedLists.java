package LinkedList.part2;

public class MergeTwoSortedLists {
    public static LinkedListNode<Integer> Merge(LinkedListNode<Integer> head1,LinkedListNode<Integer> head2){
        LinkedListNode<Integer> head;
        LinkedListNode<Integer> tail;

        LinkedListNode<Integer> temp1 = head1;
        LinkedListNode<Integer> temp2 = head2;

        if (temp1.data < temp2.data){
            head = temp1;
            tail = temp1;
            temp1 = temp1.next;
        }
        else{
            head = temp2;
            tail = temp2;
            temp2 = temp2.next;

        }

        while (temp1 != null && temp2 != null){
            if (temp2.data < temp1.data){
                tail.next = temp2;
                tail = tail.next;
                temp2 = temp2.next;
            }
            else {
                tail.next = temp1;
                tail = tail.next;
                temp1 = temp1.next;
            }
        }
        if (temp1 != null)
            tail.next = temp1;
        if(temp2 != null){
            tail.next = temp2;
        }
            return head;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head1 = InputOutput.scan();
        LinkedListNode<Integer> head2 = InputOutput.scan();

        LinkedListNode<Integer> head = Merge(head1,head2);
        InputOutput.print(head);

    }
    //1 3 5 7 9 10 -1 2 4 6 8 -1

}
