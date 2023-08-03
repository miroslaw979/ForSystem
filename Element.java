import java.util.Scanner;

public class Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNumber;

            if(currentNumber>maxNumber){
                maxNumber= currentNumber;
            }
            
        }
        int sumWithoutMax = sum - maxNumber;

        if (sumWithoutMax == maxNumber){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumWithoutMax );
        }else {
            int diff = Math.abs(sumWithoutMax - maxNumber);
            System.out.println("No");
            System.out.printf("Diff = %d", diff );
        }
        }
    }

