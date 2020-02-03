package ExtraQues;
import java.util.*;

public class SwapAll {
    public static char convertCharacter(char c) {
        int temp = c;
        if(temp >= 65 && temp <= 90){
            temp = temp + 32;
        }

        if(temp >= 97 && temp <= 122){
            temp = temp - 32;
        }
        c = (char)(temp);

        return c;
    }

    public static String SwapAll(String str) {
        String ans = "";
        int count = 0;
        for(int i = 0; i < str.length() ; i++){
            int special = str.charAt(i);
            Vector vr = new Vector();

            if((special >= 65 && special <= 90) || (special >= 97 && special <= 122)){
                char temp = convertCharacter(str.charAt(i));
                if(count == 0)
                 ans = ans + temp;

                if(count == 1)
                    vr.add(temp);
            }

            if((special >= 48  && special <= 57)){
                if(vr.isEmpty()){
                    count = 1;
                    int number = str.charAt(i);
                    vr.add(number);
                }
                if(!vr.isEmpty() && count == 1){
                    vr.add(str.charAt(i));
                    Collections.swap(vr,0,vr.size() - 1);

                    for(int j  = 0 ; j < vr.size();i++){
                        ans = ans + vr.get(j);
                    }
//                    for(int j  = 0 ; j < vr.size();i++){
//                        System.out.print(vr.get(j) + " ");
//                    }
//                    System.out.println();
                    vr.clear();
                    count = 0;
                }
            }

            if (str.charAt(i) == ' '){
                if(!vr.isEmpty()) {
                    for (int j = 0; j < vr.size(); i++) {
                        ans = ans + vr.get(j);
                    }
                }
                count = 0;
                vr.clear();
                ans = ans + ' ';
            }

            if((special >= 33 && special <= 47) || (special >= 58 && special <= 64) || (special >= 91 && special <= 96) || (special >= 123 && special <= 126)) {
                if(!vr.isEmpty()) {
                    for (int j = 0; j < vr.size(); i++) {
                        ans = ans + vr.get(j);
                    }
                }
                ans = ans + str.charAt(i);
                count = 0;
                vr.clear();
            }
        }
        return ans;
    }


    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();

       String ans = SwapAll(str);

      for(int i = 0 ; i < ans.length() ; i++) {
          System.out.print(ans.charAt(i));
      }
    }
}
//6Hello4 -8World, 7 yes3