package LinkedList.part2;

public class EvenOdd {
    public static LinkedListNode<Integer> EvenOdd(LinkedListNode<Integer> head){
        if (head == null){
            return null;
        }
        LinkedListNode<Integer> Even_head = null;
        LinkedListNode<Integer> Even_tail = null;
        LinkedListNode<Integer> Odd_head = null;
        LinkedListNode<Integer> Odd_tail = null;


        LinkedListNode<Integer> temp = head;
        while (temp != null){
            if(temp.data % 2 == 0){
                if(Even_head == null){
                    Even_head = temp;
                    Even_tail = temp;
                    temp = temp.next;
                }
                else {
                    Even_tail.next = temp;
                    Even_tail = Even_tail.next;
                    temp = temp.next;
                }
            }
            else {
                if (Odd_head == null){
                    Odd_head = temp;
                    Odd_tail = temp;
                    temp = temp.next;
                }
                else {
                    Odd_tail.next = temp;
                    Odd_tail = Odd_tail.next;
                    temp = temp.next;
                }
            }
        }
        Odd_tail.next = Even_head;
        Even_tail.next = null;

        return Odd_head;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = InputOutput.scan();
        head = EvenOdd(head);
        InputOutput.print(head);
    }
    //1 2 3 4 5 6 7 8 9 10 -1
}
