import java.util.Scanner;

public class TennisRanklist08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int countWinn = 0;
        int pointsSum= 0;
        for (int i = 1; i <= tournamentsCount ; i++) {
            String position = scanner.nextLine();

            if (position.equals("W")){
                countWinn++;
                pointsSum = pointsSum + 2000;
            } else if (position.equals("F")) {
                pointsSum = pointsSum + 1200;
            } else if (position.equals("SF")) {
                pointsSum = pointsSum + 720;
            }
        }
        int finalSum = startingPoints + pointsSum;
        int avrageSum = pointsSum / tournamentsCount;
        double winTour =  (countWinn * 1.0 / tournamentsCount) * 100;

        System.out.printf("Final points: %d%n", finalSum);
        System.out.printf("Average points: %d%n", avrageSum);
        System.out.printf("%.2f%%",winTour);
    }
}
