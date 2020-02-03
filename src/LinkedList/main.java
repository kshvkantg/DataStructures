package LinkedList;

import java.util.Scanner;

public class main {
    public static int arrayEquilibrium(int[] arr){
        //write your code here
        return arrayEquilibrium(arr,1,1,arr[0],arr[arr.length - 1],0,arr.length - 1);
    }
    public static int arrayEquilibrium(int[] arr,int lc,int rc,int ls,int rs,int li,int ri){
        if(li + 1 == ri){
            if(ls == rs){
                return lc;
            }
            else{
                return -1;
            }

        }
        else{
            if((ls + arr[li+ 1] == rs)&&(rs + arr[ri - 1] != ls)){
                return arrayEquilibrium(arr,lc + 1,rc,ls + arr[li + 1],rs,li + 1,ri);
            }
            else if((rs + arr[ri - 1] == ls)&&(ls + arr[li+ 1] != rs)){
                return arrayEquilibrium(arr,lc,rc + 1,ls,rs + arr[ri - 1],li,ri - 1);
            }
            else if((ls + arr[li+ 1] != rs)&&(rs + arr[ri - 1] != ls)){
                return arrayEquilibrium(arr,lc + 1,rc + 1,ls + arr[li + 1],rs + arr[arr.length - ri],li + 1,ri - 1);
            }
            else{
                if(rc + lc == arr.length){
                    return rc + 1;
                }
                else{

                    return arrayEquilibrium(arr,lc + 1,rc + 1,ls + arr[li + 1],rs + arr[arr.length - ri],li + 1,ri + 1);

                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ;i<size;i++){
            arr[i] = scan.nextInt();
        }
        arrayEquilibrium(arr);
    }
}
