package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class MinimumBracketReversal {
    public static int MinimumBracketReversal(String input) {
        Stack<Character> s = new Stack<Character>();
        if (input.length() == 0 || input.length()%2 != 0){
            return -1;
        }
        for (int i = 0 ; i < input.length();i++){
           char a = input.charAt(i);
           if(s.empty()){
               s.push(a);
           }
           else {
               if (s.peek() == '{' && a == '}'){
                   s.pop();
               }
               else {
                   s.push(a);
               }
           }
        }
        int rev = 0;
        while (!s.empty()){
            char one = s.pop();
            char two = s.pop();
            if (one == two){
                rev++;
            }
            else {
                rev = rev + 2;

            }
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        char[] input = new char[size];
//
//        for (int i = 0 ; i < size;i++){
            String a = scan.nextLine();
//            input[i] = a;
//        }
        System.out.println(MinimumBracketReversal(a));
     }
}
