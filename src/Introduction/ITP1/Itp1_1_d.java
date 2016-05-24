package Introduction.ITP1;

/**
 * Created by yuki on 2016/05/24.
 */
public class Itp1_1_d {
    public static void main(String[] args){
        int S = new java.util.Scanner(System.in).nextInt();
        int h = S / 3600;
        int m = (S % 3600) / 60;
        int s = S % 60;

        System.out.println(h + ":" + m + ":" + s);
    }
}
