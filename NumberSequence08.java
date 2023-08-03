import java.util.Scanner;

public class NumberSequence08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int newNum= Integer.parseInt(scanner.nextLine());

            if (newNum> maxNum){
                maxNum = newNum;
            }
            if (newNum < minNum){
                minNum = newNum;
            }
                


        }
        System.out.printf("Max number: %d%n ",maxNum);
        System.out.printf("Min number: %d", minNum);

    }
}
