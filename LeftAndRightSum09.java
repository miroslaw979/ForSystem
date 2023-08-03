import java.util.Scanner;

public class LeftAndRightSum09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= 2 * n ; i++) {
            int currentNumb = Integer.parseInt(scanner.nextLine());

            if ( i <= n){
                leftSum = leftSum + currentNumb;
            } else {
                rightSum = rightSum + currentNumb;
            }
        }


        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d%n", leftSum);
        } else {
            int diff =  Math.abs(leftSum - rightSum);
            System.out.printf("No, diff = %d%n", diff);
        }
    }
}
