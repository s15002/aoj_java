package Introduction.ITP1;
import java.util.Scanner;
/**
 * Created by yuki on 2016/05/24.
 */
public class Itp1_2_b {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a < b && b < c){
            System.out.println("Yes");
        }else
            System.out.println("No");
    }
}
