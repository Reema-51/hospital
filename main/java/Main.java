import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Hospital hospital = new RoyalHospital();

        System.out.println("\n*** Welcome To " + hospital.getName() + " ***\n");

        try {

            int choice;
            do {
                displayOptions();
                choice = input.nextInt();
                input.nextLine();
                switch (choice) {

                    case 1:
                        hospital.displayAllClinics();
                        break;

                    case 2:
                        hospital.displayClinicInfo();
                        break;

                    case 3:
                        hospital.newAppointment();
                        break;

                    case 4:
                        hospital.showAppointmentInfo();
                        break;

                    case 5:
                        hospital.cancelAppointment();
                        break;

                    case 6:
                        hospital.covide19();
                        break;

                    case 7:
                        hospital.DisplayPharmaceutial();
                        break;

                    case 8:
                        ((RoyalHospital) hospital).quit();
                        break;

                    default:
                        System.out.println("\n\033[41m"
                                + "Invalid Choice!"
                                + "\033[41m");
                }

            } while (choice != 8);
        } catch (InputMismatchException ex) {
            System.err.println("\n\033[41m"
                    + "Invalid Input."
                    + "\033[41m"
            );
        }

    }

    public static void displayOptions() {

        System.out.print("\33[43m"
                + "+-------------------------------+\n"
                + "| 1. Display All Clinics        |\n"
                + "| 2. Display Clinic Info        |\n"
                + "| 3. reserve Appointment        |\n"
                + "| 4. Show Appointment           |\n"
                + "| 5. Cancel Appointment         |\n"
                + "| 6. coived-19                  |\n"
                + "| 7. Display Pharmaceutial      |\n"
                + "| 8. Quit                       |\n"
                + "\33[43m" + "+-------------------------------+\n" + "\033[0m"
                + "\nCHOOSE WHAT YOU WANT :");

    }

}


