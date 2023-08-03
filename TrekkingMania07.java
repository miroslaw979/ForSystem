import java.util.Scanner;

public class TrekkingMania07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroups = Integer.parseInt(scanner.nextLine());


        int climbersMusala = 0;
        int climbersMonblan = 0;
        int climbersKili = 0;
        int climbersK2 = 0;
        int climbersEverst= 0;

        for (int i = 1; i <= countGroups; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());

            if (peopleInGroup<= 5){
                climbersMusala = climbersMusala +peopleInGroup;
            } else if (peopleInGroup >= 6 && peopleInGroup <=12) {
                climbersMonblan = climbersMonblan + peopleInGroup;
            } else if (peopleInGroup >=13 && peopleInGroup <=25){
                climbersKili = climbersKili + peopleInGroup;
            } else if (peopleInGroup >= 26 && peopleInGroup <= 40){
                climbersK2 =climbersK2 + peopleInGroup;
            } else if (peopleInGroup>=41){
                climbersEverst = climbersEverst +peopleInGroup;
            }
        }
        int sum = climbersEverst + climbersK2 + climbersKili + climbersMonblan + climbersMusala;


        System.out.printf("%.2f%%%n",(climbersMusala * 1.0 / sum * 100));
        System.out.printf("%.2f%%%n",(climbersMonblan * 1.0 / sum * 100));
        System.out.printf("%.2f%%%n",(climbersKili * 1.0 / sum * 100));
        System.out.printf("%.2f%%%n",(climbersK2 * 1.0 / sum * 100));
        System.out.printf("%.2f%%%n",(climbersEverst * 1.0 / sum * 100));
    }
}
