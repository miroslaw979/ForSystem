import java.util.Scanner;

public class FootballLeague007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadionMax = Integer.parseInt(scanner.nextLine());
        int fansSumAll= Integer.parseInt(scanner.nextLine());

        double sectorA = 0 * 1.0;
        double sectorB = 0 * 1.0;
        double sectorV = 0 * 1.0;
        double sectorG = 0 * 1.0;
        double allFans = 0;
        for (int i = 1; i <=fansSumAll ; i++) {
            String fenType = scanner.nextLine();
            if (fenType.equals("A")){
                sectorA++;
            } else if (fenType.equals("B")) {
                sectorB++;
            } else if (fenType.equals("V")) {
                sectorV++;
            } else if (fenType.equals("G")) {
                sectorG++;
            }

        }

        sectorA = (sectorA / fansSumAll) * 100;
        sectorB = (sectorB / fansSumAll) * 100;
        sectorV = (sectorV / fansSumAll) * 100;
        sectorG = (sectorG / fansSumAll) * 100;
        allFans = ((fansSumAll * 1.0) / (stadionMax * 1.0)) * 100;
        System.out.printf("%.2f%%%n",sectorA);
        System.out.printf("%.2f%%%n",sectorB);
        System.out.printf("%.2f%%%n",sectorV);
        System.out.printf("%.2f%%%n",sectorG);
        System.out.printf("%.2f%%%n",allFans);
    }
}
