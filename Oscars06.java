import java.util.Scanner;

public class Oscars06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        double allPoints= pointsFromAcademy;
        for (int i = 0; i < n; i++) {
            String examinerName = scanner.nextLine();
            double pointsFromExaminer = Double.parseDouble(scanner.nextLine());

            allPoints = allPoints + (examinerName.length() * pointsFromExaminer) / 2;

        if (allPoints>1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, allPoints);
            break;
        }
        }
        if (allPoints<1250.5){
            double diff = Math.abs(1250.5 - allPoints);
        System.out.printf("Sorry, %s you need %.1f more!", actorName,diff);
        }
    }
}
