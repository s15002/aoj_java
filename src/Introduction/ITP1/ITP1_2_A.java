package Introduction.ITP1;

import java.util.Scanner;

/**
 * Created by yuki on 2016/05/24.
 */
public class Itp1_2_a {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if(a < b){
            System.out.println("a < b");
        }else if (a > b){
            System.out.println("a > b");
        }else
            System.out.println("a == b");
    }
}
