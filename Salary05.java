import java.util.Scanner;

public class Salary05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {
            String webName= scanner.nextLine();

            if (webName.equals("Facebook")){
                salary = salary - 150;
            }
            if(webName.equals("Instagram")){
                salary = salary - 100;
            }
            if (webName.equals("Reddit")){
                salary = salary - 100;
            }
        }

        if (salary <=0){
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
