package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void ReverseStack(Stack<Integer> s1,Stack<Integer> s2){
        for (int i =0;i<s1.size();i++){
            int a = s1.pop();
            s2.push(a);
        }
    }

    public static void print(Stack<Integer> s1){
        for (int i = 0;i<s1.size();i++){
            System.out.println(s1.pop());
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int size = scan.nextInt();
        for(int i = 0;i<size;i++){
            s1.push(scan.nextInt());
        }
        ReverseStack(s1,s2);
        print(s2);
    }
}
