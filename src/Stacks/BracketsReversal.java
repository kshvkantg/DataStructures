package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BracketsReversal {
    public static boolean BracketsReversal (String str) {
        Stack<Character> brackets = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++ ){
            if(str.charAt(i) == '{'|| str.charAt(i) == '[' || str.charAt(i) == '('){
                brackets.push(str.charAt(i));
            }
            else if(str.charAt(i) == '}'|| str.charAt(i) == ']' || str.charAt(i) == ')'){
                if(brackets.isEmpty()){
                    return false ;
                }
                else if( brackets.peek() == str.charAt(i)){
                   return  true;
                }
                else {
                    brackets.pop();
                }
            }
        }
        if (brackets.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(BracketsReversal(str));
    }
}
