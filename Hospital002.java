import java.util.Scanner;

public class Hospital002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period= Integer.parseInt(scanner.nextLine());

        int medics = 7;
        int treatedPatients= 0;
        int untreatedPatients = 0;
        for (int i = 1; i <=period ; i++) {
            int patientsPerDay = Integer.parseInt(scanner.nextLine());

            if (i % 3== 0){
                if (untreatedPatients> treatedPatients){
                    medics = medics +1;
                }

            }
            if(patientsPerDay <= medics){
                treatedPatients = treatedPatients + patientsPerDay;
            }else {
                treatedPatients = treatedPatients + medics;
                untreatedPatients = untreatedPatients + patientsPerDay - medics;
            }
        }
        System.out.printf("Treated patients: %d.%n",treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}
