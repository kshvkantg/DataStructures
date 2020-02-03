package LinkedList.part1;

public class removeDuplicates {

    public static LinkedListNode<Integer> remove(LinkedListNode<Integer> head){
        LinkedListNode<Integer> current = new LinkedListNode<Integer>(null);
        current = head;
        while (current.next != null) {
            if (current.data.equals(current.next.data)){
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head = InputOutput.scan();
        head = remove(head);
        InputOutput.print(head);
    }
    //1 1 2 2 9 9 9 7 7 8 5 1 4 4 4 2 5 8 8 8 7 7 7 6 6 6 7 5 4 1 2 3 -1
}
