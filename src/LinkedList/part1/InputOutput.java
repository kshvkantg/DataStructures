package LinkedList.part1;

import java.util.Scanner;

public class InputOutput {
    public static void print(LinkedListNode<Integer> head) {
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static LinkedListNode<Integer> scan() {
        LinkedListNode<Integer> head = null, tail = null;
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();
        while (data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
            if (head == null){
                head = newNode;
                tail = newNode;

            } else {
                tail.next = newNode;
                tail = newNode; // or tail = tail.next;
            }
            data = scan.nextInt();
        }
        return head;
    }
}
