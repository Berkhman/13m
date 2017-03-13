import java.util.Scanner;

/**
 * Created by berhmaneyu.18 on 13.03.2017.
 */
public class B {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i < n; i++) {
            if (Jo(i) == 1)
                System.out.print(i + " ");

        }
    }

    public static int Jo(int i) {
        if (i == 2) return 1;
        else {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0)
                    return 0;

            }
            return 1;
        }

    }
}

