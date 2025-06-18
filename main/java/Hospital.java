
public interface Hospital {

    public static final int MAX_CLINICS = 6;

    //hospital
    public abstract String getName();

    //clinics
    public abstract void displayAllClinics();

    public abstract void displayClinicInfo();

    public abstract Clinic getClinicById(int id);

    //appointments
    public abstract void newAppointment();

    public abstract void showAppointmentInfo();

    public abstract void cancelAppointment();
    
   
    
     public abstract void DisplayPharmaceutial();
     
     public abstract void covide19();
     
     

    //read and save data to files
    public abstract void readClinics();

    public abstract void saveClinics();
}
