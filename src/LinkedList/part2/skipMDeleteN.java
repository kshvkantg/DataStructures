package LinkedList.part2;

public class skipMDeleteN {

    public static LinkedListNode<Integer> skipMDeleteN(LinkedListNode<Integer> head, int M, int N) {
        LinkedListNode<Integer> temp = head;
        while (temp != null){
            LinkedListNode<Integer> DeleteHead;
            if (temp.next != null) {
                for (int i = 0; i < M - 1; i++){
                    temp = temp.next;
                }
                DeleteHead = temp;

                for (int i = 0; i < N; i++) {
                    DeleteHead = DeleteHead.next;
                }
                temp.next = DeleteHead.next;
                temp = temp.next;
            }
            else {
                return head;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = InputOutput.scan();
        head = skipMDeleteN(head,2,2);
        InputOutput.print(head);
    }
    //1 2 3 4 5 6 7 8 9 -1
}
