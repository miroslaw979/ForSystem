import java.util.Scanner;

public class CleverLily04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int lilyYears= Integer.parseInt(scanner.nextLine());
        double priceForWashMachine = Double.parseDouble(scanner.nextLine());
        int priceForOneToy= Integer.parseInt(scanner.nextLine());

        double money = 0;
        int toys = 0;
        double  moneyPerYear = 10;

        for (int i = 1; i <= lilyYears; i++) {

            if(i % 2 == 0){
                money = money + moneyPerYear;
                moneyPerYear = moneyPerYear + 10;
                money = money - 1;
            } else {
                toys = toys + 1;
            }
        }
        money = money + toys * priceForOneToy;
        double diff = Math.abs(money - priceForWashMachine);

        if (money>=priceForWashMachine){
            System.out.printf("Yes! %.2f", diff);
        }else {
            System.out.printf("No! %.2f", diff);
        }





    }
}
