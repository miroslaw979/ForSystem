import java.util.Scanner;

public class BackToThePast001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyGift = Double.parseDouble(scanner.nextLine());
        int yearLife = Integer.parseInt(scanner.nextLine());

        int years = 18;
        double expenses = 0;
        for (int i = 1800; i <= yearLife; i++) {

            if (i % 2 ==0){
                expenses = expenses + 12000;
            } else {
                expenses = expenses + 12000 + 50 * years;
            }
            years++;
        }

        double restMoney = moneyGift - expenses;
        double diff = expenses - moneyGift;
        if (moneyGift>= expenses){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",restMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.",diff);
        }
    }
}
