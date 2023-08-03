import java.util.Scanner;

public class EqualPairs08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int lastSum = 0;
        int difference = 0;
        for (int i = 0; i < n ; i++) {
            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());
            int sum = first + second;

            if (i>0){
                difference = Math.abs(lastSum - sum);
            }
            lastSum = sum;
        }
        if(difference == 0){
            System.out.printf("Yes, value=%d",lastSum);
        }else{
            System.out.printf("No, maxdiff=%d",difference);
        }

        }
        
    }

