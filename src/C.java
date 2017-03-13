import java.util.Scanner;

/**
 * Created by berhmaneyu.18 on 13.03.2017.
 */
public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int a;
        for(int i = 0; i < n; i++){
            a = scanner.nextInt();
            sum = sum + a;
        }
        int d =  sum / n;
        System.out.print(d);
    }
}
