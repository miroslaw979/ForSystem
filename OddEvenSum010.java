import java.util.Scanner;

public class OddEvenSum010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int even = 0;
        int odd = 0;
        for (int i = 1; i <= n; i++) {
            int currentSum = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                even = even + currentSum;
            } else {
                odd = odd + currentSum;
            }
        }
        if (even == odd) {
            System.out.println("Yes");
            System.out.printf("Sum = %d%n", even);
        } else {
            System.out.println("No");
            int diff = Math.abs(even - odd);
            System.out.printf("Diff = %d%n", diff);
        }
    }
}
