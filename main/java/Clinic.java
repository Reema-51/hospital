import java.io.Serializable;
import java.util.ArrayList;


public class Clinic implements Serializable {

    private static int ClinicCount;//counter
    private int numOfClinic;
    private String name;


    private ArrayList<Appointment> appointments;

    private final int MAX_DOCTORS;
    private final int MAX_Nurses;
    private Doctor[] doctors;
    private Nurse[] nurses;
    private int numOfDoctors;
    private int numOfNurse;
    

    public Clinic() {
        this("",  1,2);
    }

    public Clinic(String name, int doctors,int nurses) {
        numOfClinic = ++ClinicCount;
        this.name = name;
        //no understand
        appointments = new ArrayList<>();
        MAX_DOCTORS = doctors;
        this.doctors = new Doctor[MAX_DOCTORS];
        MAX_Nurses = nurses;
        this.nurses = new Nurse [MAX_Nurses];

    }

    //doctors
    public void addDoctor(Doctor d) {

        if (numOfDoctors >= MAX_DOCTORS) {
            System.out.println("Can't add more doctors.");
            return; //stop
        }

        doctors[numOfDoctors++] = d;
    }

    public void listAllDoctors() {
        if (numOfDoctors == 0) {
            System.out.println("No doctors at this clinic yet.");
            return;//stop
        }

        for (Doctor d : doctors) {
            if(d != null)
            d.display();
        }
    }
    
    //nurse
     public void addNurse(Nurse n) {
             if (numOfNurse >= MAX_Nurses) {
            System.out.println("Can't add more nurses.");
            return; 
        }

        nurses[numOfNurse++] = n;
    }
      public void listAllNursec() {
        if (numOfNurse == 0) {
            System.out.println("No numOfNurse at this clinic yet.");
            return;
        }

        for (Nurse n :nurses ) {
            if(n != null)
            n.display();
        }
    }
      
      

    public void addAppoitment(Appointment appointment) {
        this.appointments.add(appointment);
    }

    public void cancelAppointment(int id) {

        for (Appointment appointment : appointments) {
            if (appointment.getIdA() == id) {
                appointment.cancel();
                
                System.out.println("your Appointment has been cancelled ");
            }
        }
    }

    public int getNumOfClinic() {
        return numOfClinic;
    }

    public void setNumOfClinic(int numOfClinic) {
        this.numOfClinic = numOfClinic;
    }

    public Nurse[] getNurse() {
        return nurses;
    }

    public void setNurse(Nurse[] nurse) {
        this.nurses = nurse;
    }

    public void displayAppointment(int id) {

        for (Appointment appointment : appointments) {
            if (appointment.getIdA() == id) {
                appointment.print();
            }
        }
    }

    public void listAllAppointments() {
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }

    public Appointment getAppointmentById(int id) {
        for (Appointment appointment : appointments) {
            if (appointment.getIdA()== id) {
                return appointment;
            }
        }
        return null;
    }

    public void display() {
        System.out.println(" numOfClinic: " + getnumOfClinic());
        System.out.println("Clinic Name: " + getName());
   

        System.out.println("Available Doctors: ");
        listAllDoctors();
        System.out.println("Available nurses: ");
        listAllNursec();

    }

    
    public static int getClinicCount() {
        return ClinicCount;
    }

    public static void setClinicCount(int clinicCount) {
        Clinic.ClinicCount = clinicCount;
    }

    public int getnumOfClinic() {
        return numOfClinic;
    }

    public void setnumOfClinic(int numOfClinic) {
        this.numOfClinic = numOfClinic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
    }

    public int getNumOfDoctors() {
        return numOfDoctors;
    }

    public void setNumOfDoctors(int numOfDoctors) {
        this.numOfDoctors = numOfDoctors;
    }

    @Override
    public String toString() {
        return "\n Clinic [ " + "Number Of Clinic:" + numOfClinic + ", Name of The Clinic:" + name + " ,Number Of Doctors:" + numOfDoctors +"] \n-------------------------------------------------------------------------------- "; 
    }
    

  

}

