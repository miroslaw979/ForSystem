import java.util.Scanner;

public class GameOfIntervals005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kolkoHodaShteE = Integer.parseInt(scanner.nextLine());


        double resultat = 0.0;
        double purvi= 0.0;
        double vtori= 0.0;
        double treti= 0.0;
        double chetvurti= 0.0;
        double peti= 0.0;
        double otricatelno = 0.0;
        for (int i = 1; i <= kolkoHodaShteE; i++) {
            int chisaltaKoitoSeProverqvat = Integer.parseInt(scanner.nextLine());


            if (chisaltaKoitoSeProverqvat >= 0 && chisaltaKoitoSeProverqvat <= 9) {
                resultat = resultat + 0.2 * chisaltaKoitoSeProverqvat;
                purvi++;
            } else if (chisaltaKoitoSeProverqvat >= 10 && chisaltaKoitoSeProverqvat <= 19) {
                resultat += 0.3 * chisaltaKoitoSeProverqvat;
                vtori++;
            } else if (chisaltaKoitoSeProverqvat >= 20 && chisaltaKoitoSeProverqvat <= 29) {
                resultat += 0.4 * chisaltaKoitoSeProverqvat;
                treti++;
            } else if (chisaltaKoitoSeProverqvat >= 30 && chisaltaKoitoSeProverqvat <= 39) {
                resultat = resultat + 50;
                chetvurti++;
            } else if (chisaltaKoitoSeProverqvat >= 40 && chisaltaKoitoSeProverqvat <= 50) {
                resultat = resultat + 100;
                peti++;
            }
            if (chisaltaKoitoSeProverqvat > 50 || chisaltaKoitoSeProverqvat < 0) {
                resultat = resultat / 2;
                otricatelno++;
            }
        }
            double p1 = ( purvi / kolkoHodaShteE) * 100;
            double p2 =( vtori / kolkoHodaShteE) * 100;
            double p3 =( treti / kolkoHodaShteE) * 100;
            double p4 =( chetvurti / kolkoHodaShteE) * 100;
            double p5 =( peti / kolkoHodaShteE) * 100;
            double p6 = ( otricatelno / kolkoHodaShteE) * 100;

        System.out.printf("%.2f%n", resultat);
        System.out.printf("From 0 to 9: %.2f%%%n", p1);
        System.out.printf("From 10 to 19: %.2f%%%n", p2);
        System.out.printf("From 20 to 29: %.2f%%%n", p3);
        System.out.printf("From 30 to 39: %.2f%%%n", p4);
        System.out.printf("From 40 to 50: %.2f%%%n", p5);
        System.out.printf("Invalid numbers: %.2f%%%n",p6);

    }
}
