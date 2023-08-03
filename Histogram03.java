import java.util.Scanner;

public class Histogram03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int p1Count = 0;
        int p2Count = 0;
        int p3Count = 0;
        int p4Count = 0;
        int p5Count = 0;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum<200){
                p1Count++;
            } else if (currentNum <=399) {
                p2Count++;
            } else if (currentNum <=599) {
                p3Count++;
            } else if (currentNum <= 799) {
                p4Count++;
            } else {
                p5Count++;
            }

        }


        double percent1 = (p1Count * 1.0 / n) * 100;
        double percent2 = (p2Count * 1.0 / n) * 100;
        double percent3 = (p3Count * 1.0 / n) * 100;
        double percent4 = (p4Count * 1.0 / n) * 100;
        double percent5 = (p5Count * 1.0 / n) * 100;


        System.out.printf("%.2f%%%n", percent1);
        System.out.printf("%.2f%%%n", percent2);
        System.out.printf("%.2f%%%n", percent3);
        System.out.printf("%.2f%%%n", percent4);
        System.out.printf("%.2f%%", percent5);




    }
}
