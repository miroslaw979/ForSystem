import java.util.Scanner;

public class Bills006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());

        double water = 20 * months * 1.0;
        double internet = 15 * months * 1.0;
        double electricity = 0;


        for (int i = 1; i <= months; i++) {
            double billForElectricity = Double.parseDouble(scanner.nextLine());
            electricity = electricity + billForElectricity;

        }

        double total = electricity + water + internet;
        double others = total + (total * 0.2);
        double totalPlus = total + others;


        System.out.printf("Electricity: %.2f lv%n",electricity);
        System.out.printf("Water: %.2f lv%n",water);
        System.out.printf("Internet: %.2f lv%n",internet);
        System.out.printf("Other: %.2f lv%n", others);
        System.out.printf("Average: %.2f lv%n",totalPlus / months);

    }
}
