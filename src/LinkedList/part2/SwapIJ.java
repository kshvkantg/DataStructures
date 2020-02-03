package LinkedList.part2;

import java.util.Scanner;

public class SwapIJ {
    public static LinkedListNode<Integer> SwapIJ(LinkedListNode<Integer> head,int i , int j){
        LinkedListNode<Integer> INode = null;
        LinkedListNode<Integer> JNode = null;
        LinkedListNode<Integer> temp = head;
        int count = 0;
       while (temp.next != null){
           if(count != i){
               temp = temp.next;
           }
           if(count == i){

           }

       }
       return head;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedListNode<Integer> head = InputOutput.scan();
        int n = scan.nextInt();
        int m = scan.nextInt();


        InputOutput.print(head);

    }
}
