package LinkedList.part1;
public class InsertNode {

    public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
        LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
        if(pos == 0){
            newNode.next = head;
//            head = newNode;
            return newNode;
        }

            LinkedListNode temp = head;
            int i = 0;
            while (i < pos - 1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            return head;

    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = InputOutput.scan();
        head = insert(head,0,50);
        InputOutput.print(head);
    }
}
