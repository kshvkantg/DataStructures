package Stacks.questtions;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void Reverse(Stack<Integer> input, Stack<Integer> extra){
        int i = 0;
        while (!input.isEmpty()){
            i = input.pop();
            extra.push(i);
        }

        while (!extra.isEmpty()){
            i = extra.pop();
            input.push(i);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Stack<Integer> input = new Stack<>();
        Stack<Integer> extra = new Stack<>();
        for(int i = 0; i < size;i++){
            input.push(scan.nextInt());
        }
        Reverse(input,extra);
        while (!input.isEmpty()){
            System.out.print(input.pop() + " ");
        }
    }
}
