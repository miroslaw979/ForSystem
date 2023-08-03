import java.util.Scanner;

public class Logistics003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cargoCount = Integer.parseInt(scanner.nextLine());

        double kamion = 0;
        double vlak = 0;
        double mikrobus = 0;
        int totalCargo = 0;

        for (int i = 1; i <= cargoCount; i++) {
            int tonsPerTovar= Integer.parseInt(scanner.nextLine());
            totalCargo = totalCargo + tonsPerTovar;
            if (tonsPerTovar<= 3){
                mikrobus= mikrobus + tonsPerTovar;
            } else if (tonsPerTovar >=4 && tonsPerTovar<=11) {
                kamion = kamion + tonsPerTovar;
            } else if (tonsPerTovar>=12) {
                vlak = vlak +tonsPerTovar;
            }

        }
        double sumTovar = mikrobus * 200 + kamion *175 +vlak * 120;
        double average = sumTovar / totalCargo;
        double p1 = (mikrobus / totalCargo) * 100;
        double p2 = (kamion / totalCargo) * 100;
        double p3 = (vlak / totalCargo) * 100;
        System.out.printf("%.2f%n", average);
        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);


    }
}
