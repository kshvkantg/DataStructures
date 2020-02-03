package LinkedList.part2;

public class ReverseListRecursively {
    public static LinkedListNode<Integer> ReverseList(LinkedListNode<Integer> head){
        if (head == null || head.next == null){
            return head;
        }
        LinkedListNode<Integer> FinalHead = ReverseList(head.next);
        LinkedListNode<Integer> temp = FinalHead;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        return FinalHead;

    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = InputOutput.scan();
        head = ReverseList(head);
        InputOutput.print(head);
    }
    //1 2 3 4 5 6 7 8 9 10 11 -1
}
