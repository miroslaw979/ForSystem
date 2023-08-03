import java.util.Scanner;

public class Grades004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents= Integer.parseInt(scanner.nextLine());

        double slab= 0;
        double dobur = 0;
        double mndobur = 0;
        double otilichen = 0;
        double sredenuspeh = 0;
        for (int i = 1; i <= countStudents ; i++) {
            double ocenka = Double.parseDouble(scanner.nextLine());
            sredenuspeh = sredenuspeh + ocenka;
            if (ocenka>= 2.00 && ocenka<= 2.99){
                slab++;
            } else if (ocenka >=3.00 && ocenka <= 3.99) {
                dobur++;
            } else if (ocenka >=4.00 && ocenka <=4.99) {
                mndobur++;
            } else if (ocenka >=5) {
                otilichen++;
            }

        }
        double sredenn= sredenuspeh / countStudents;
        double p1= (slab / countStudents) * 100;
        double p2 = (dobur / countStudents)* 100;
        double p3 = (mndobur / countStudents) * 100;
        double p4 = (otilichen / countStudents) * 100;
        System.out.printf("Top students: %.2f%%%n",p4);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",p3);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",p2);
        System.out.printf("Fail: %.2f%%%n",p1);
        System.out.printf("Average: %.2f",sredenn);

    }
}
