
import java.io.*;
import java.util.*;

public class RoyalHospital implements Hospital {

    private ArrayList<Clinic> clinics;
    private Scanner input;

    public RoyalHospital() {
        clinics = new ArrayList<>();
        input = new Scanner(System.in);
        readClinics();
    }

    public void addClinic(Clinic clinic) {
        clinics.add(clinic);
    }

    @Override
    public String getName() {
        return "RoyalHospital";
    }

    @Override
    public void displayAllClinics() {
        for (Clinic c : clinics) {

            System.out.println(c);

        }
    }

    @Override
    public void displayClinicInfo() {
        try {
            System.out.print("Enter The Number Of The Clinic: ");
            int numclinc = input.nextInt();
            input.nextLine();
            Clinic clinic = getClinicById(numclinc);//
            if (clinic == null) {
                System.out.println("\n\033[41m"
                        + "No such clinic."
                        + "\033[41m");
                return;
            }

            clinic.display();

        } catch (InputMismatchException ex) {
            System.err.println("\n\033[41m"
                    + "Invalid input"
                    + "\033[41m");
        }
    }

    @Override
    public Clinic getClinicById(int numOfClinic) {
        for (Clinic c : clinics) {
            if (c.getnumOfClinic() == numOfClinic) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void newAppointment() {
        try {
            displayAllClinics();
            System.out.print("Enter clinic number: ");
            int num = input.nextInt();
            input.nextLine();
            Clinic clinic = getClinicById(num);

            if (clinic == null) {
                System.out.println("The number of clinic is not there");
                return;

            }

            System.out.println("Please enter your info: ");

            System.out.print("First Name:  ");
            String firstname = input.nextLine();

            System.out.print("Last Name:  ");
            String lastname = input.nextLine();
            System.out.print("Gender[ F / M ]:  ");
            char gender = input.next().toUpperCase().charAt(0);
            if (gender != 'M' && gender != 'F') {
                System.out.println("Invalid Gender");
                return;
            }
            System.out.print("your id: ");
            int pId = input.nextInt();
            input.nextLine();

            //BirthPlace
            System.out.print("Country:  ");
            String country = input.nextLine();
            System.out.print("City: ");
            String city = input.nextLine();

            System.out.print("Countact Number:  ");
            String countactNumber = input.nextLine();
            System.out.print("Email:   ");
            String Emil = input.nextLine();

            System.out.print("The problem:  ");
            String problem = input.nextLine();

            Patient patient = new Patient(pId, firstname + " " + lastname, new BirthPlace(country, city), gender);
            Appointment appointment = new Appointment(patient);
            appointment.confirm();
            clinic.addAppoitment(appointment);

        } catch (InputMismatchException ex) {
            System.err.println("\033[41m Invalid input");
        }
    }

    @Override
    public void showAppointmentInfo() {
        try {
            displayAllClinics();
            System.out.print("Enter clinic number: ");
            int num = input.nextInt();
            input.nextLine();
            Clinic clinic = getClinicById(num);

            if (clinic == null) {
                System.out.println("The number of clinic is not there");
                return; 

            }
            System.out.print("Enter Appointment number: ");
            int id = input.nextInt();
            input.nextLine();
            Appointment appointment = getAppointmentById(clinic, id);
            if (appointment == null) {
                System.out.println("There is no Appointment ");
                return;
            }

            appointment.print();

        } catch (InputMismatchException ex) {
            System.err.println("\n\033[41m"
                    + "Invalid input"
                    + "\033[41m");
        }
    }

    @Override
    public void cancelAppointment() {
        try {
            displayAllClinics();
            System.out.print("Enter clinic number: ");
            int num = input.nextInt();
            input.nextLine();
            Clinic clinic = getClinicById(num);

            if (clinic == null) {
                System.out.println("The number of clinic is not there");
                return; //stop

            }

            System.out.print("Enter Appointment number: ");
            int id = input.nextInt();
            input.nextLine();
            Appointment appointment = getAppointmentById(clinic, id);

            if (appointment == null) {
                System.out.println("\n\033[41m"
                        + "There is no Appointment !"
                        + "\033[41m");
                return;//stop
            }

            appointment.cancel();
            System.out.println("Your Appointment has been Cenceld ");

        } catch (InputMismatchException ex) {
            System.err.println("\n\033[41m"
                    + "Invalid input"
                    + "\033[41m");
        }

    }

    @Override
    public void DisplayPharmaceutial() {

          System.out.print("''''  Welcome To RoyalPharmaceutial ''''\n"
           
                          +" \n  ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' \n  "
                          + "'                                 ' \n  "
                          + "'    1- Eye Cream 45.99$          ' \n "
                          + " '    2- Eye Drob  25.50$          ' \n "
                          + " '    3- Dental medaicine 50.00$   ' \n "
                          + " '    4- Toothpaste 20.50$         ' \n "
                          + " '    5- Normal Saline 20.00$      ' \n "
                          + " '    6- Fontalen 10.00$           ' \n "
                          + " '                                 ' \n "
                          + " ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' \n "
                        
                
                         );

        System.out.print("\nwhat do you want :  ");
        int want = input.nextInt();
        input.nextLine();
        if (want < 1 || want > 6) {
            System.out.println("Invalid choice");
            return;
        }
        System.out.print("how many ? ");
        int many = input.nextInt();
        input.nextLine();
        
        
           System.out.println(" .__________________________________________________________________.");
              System.out.println(" | name of medaicine |   many   |  price  | Expiry date |  Total    |    ");
              System.out.println(" |___________________|__________|_________|_____________|___________|");
                 
                 switch (want) {
                       
                        case 1 ://done
                         System.out.println(" |  Eye Cream \t     |      "  + many + " \t|" + " 45.99$  |" + " 12/8/2023   | " + many*45.99 +"$   |");
                        break;
                         case 2 ://done
                          System.out.println(" |  Eye Drob \t     |      "  + many + " \t|" + " 25.50$  |" + "  6/3/2023   |" + many*25.50 +"$     |");
                        break;
                         case 3 : //done
                          System.out.println(" | Dental medaicine  |    "  + many + "     |" + " 50.00$  |" + "  15/9/2023  |   " + many*50.00 +"$  |");
                         break;
                              case 4 ://done
                          System.out.println(" | Toothpaste  \t     |      "  + many + " \t|" + " 20.50$  |" + " 15/9/2023   | " + many*20.50 +"$    |");
                        break;
                           case 5 ://done
                          System.out.println(" | Normal Saline     |    "  + many + "     |" + " 20.00$  |" + "   15/9/2023 |  " + many*20.00 +"$    |");
                        break;
                        case 6 ://done
                         System.out.println(" |  Fontalen \t     |    "  + many + "   \t|" + " 10.00$  |" + " 15/9/2023   |  " + many*10.00 +"$   |");
                     
                         break;
                       default:
                           System.out.println("ivaled choise");
                
        }
                     System.out.println(" .__________________________________________________________________.\n");

    }

    @Override
    public void covide19() {
        System.out.println("Do you want\n"
                + "1- Covid-19 test\n"
                + "2- Covid-19 vaccine\n"
                + "  \n"
                + "Enter your choise :");
        int coived = input.nextInt();
       

        switch (coived) {
            case 1:
                System.out.println("Do you need the test in your :\n "
                        +"1- throat\n"
                        +"2- noise\n"
                        + "\n"
                        +"Enter your choise: ");
                int test = input.nextInt();
                input.nextLine();
                 System.out.println(""
                        + "----------------------------------------\n"
                        + "your Appointment is Confrim \n"
                        + "the place is in RoyalHospital  \n"
                        + "in floor : " + (int) (Math.random() * (5 - 0 + 1) + 0) + "\n"
                        + "in RoomNumber :" + (int) (Math.random() * (100 - 10 + 1) + 0) + "\n"
                        + "----------------------------------------");

                break;
            case 2:
                System.out.println("\n Vaccine tybe you want : \n"
                        + "1- Pfizer\n"
                        + "2- AstraZeneca\n"
                        + "3- Modena\n"
                        + "Enter your choise: ");
                int vaccine = input.nextInt();
                input.nextLine();
                 System.out.println(""
                        + "----------------------------------------\n"
                        + "your Appointment is Confrim \n"
                        + "the place is in RoyalHospital  \n"
                        + "in floor : " + (int) (Math.random() * (5 - 0 + 1) + 0) + "\n"
                        + "in RoomNumber :" + (int) (Math.random() * (100 - 10 + 1) + 0) + "\n"
                        + "----------------------------------------");

                break;

            default:
                System.out.println("\n\033[41m"
                        + "Ivaled input"
                        + "\033[41m");
                ;

        }

    }

    private Appointment getAppointmentById(Clinic c, int id) {
        return c.getAppointmentById(id);

    }

    @Override
    public void readClinics() {
        ObjectInputStream ois = null;
        try {
            System.out.println("Reading data from file....");
            ois = new ObjectInputStream(new FileInputStream("clinics.ser"));

            while (true) {
                try {
                    Clinic clinic = (Clinic) ois.readObject();
                    clinics.add(clinic);
                } catch (EOFException ex) {
                    break;
                }
            }

        } catch (FileNotFoundException ex) {
            System.err.println("Error: File Not Found\n" + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Error: Can't read data.\n" + ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException ex) {
                    System.out.println("Error during closing stream");
                }
            }
        }
    }

    @Override
    public void saveClinics() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(new java.io.File("clinics.ser")));

            for (Clinic clinic : clinics) {
                oos.writeObject(clinic);
            }
            System.out.println("All data saved!");
        } catch (FileNotFoundException ex) {
            System.err.println("Error: File Not Found.");
        } catch (IOException ex) {
            System.err.println("Error: Can't save data." + ex);
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    System.out.println("Error during closing stream");
                }
            }
        }
    }

    public void quit() {
        System.out.println("Thank you for vist RoyalHospital");
        System.out.print("Do you want to save data? (Y or N): ");
        char answer = input.next().toUpperCase().charAt(0);
        if (answer == 'Y') {

            System.out.println("Data saved successfully.");
        }
        System.out.println("Thank you!");
    }
}

