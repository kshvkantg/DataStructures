package Stacks.questtions;
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static int[] stockSpan(int[] price) {
        int[] ans = new int[price.length];
        Stack<Integer> st = new Stack<>();
        int StockSpan = 1;
        int[] greatest = new int[2];//[greatest number,index of that number]

        for(int i = 0 ; i < price.length ; i++){

            if(st.isEmpty()){
                st.add(price[i]);
                ans[i] = StockSpan;
                greatest[0] = price[i];
                greatest[1] = i;
            }
            else{
                if(st.peek() <= price[i]){
                    StockSpan++;
                    ans[i] = StockSpan;
                }
                if(st.peek() > price[i]){
                    StockSpan = 1;
                    ans[i] = StockSpan;
                }
                st.add(price[i]);
            }
        }
        return ans;
    }
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        int output[] = StockSpan.stockSpan(input);
        for(int i = 0; i < size; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
