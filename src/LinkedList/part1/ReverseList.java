package LinkedList.part1;

public class ReverseList {
    public static void ReverseList(LinkedListNode<Integer> head){
        if (head == null){
            return;
        }
        ReverseList(head.next);
        System.out.print(head.data + " ");
    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head = InputOutput.scan();
        ReverseList(head);

        //1 1 2 2 9 9 9 7 7 8 5 1 4 4 4 2 5 8 8 8 7 7 7 6 6 6 7 5 4 1 2 3 -1
    }
}
