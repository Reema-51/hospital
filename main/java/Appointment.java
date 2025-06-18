public class Appointment implements Printable {

    private static int numOfAppointments;
    private int idA;
    private Patient patient;
    //doctor doctor
    private String status;

    public Appointment() {
        this(null);
    }

    public Appointment(Patient patient) {
        this.idA = ++numOfAppointments;
        this.patient = patient;
        status = "Unconfirmed";
    }

    public static int getNumOfAppointments() {
        return numOfAppointments;
    }

    public static void setNumOfAppointments(int numOfAppointments) {
        Appointment.numOfAppointments = numOfAppointments;
    }

    public void confirm() {
        setStatus("Confirmed");
        System.out.println("Your Appointment has been confirmed successfully.");
        print();
    }

    public void cancel() {
        setStatus("Cancelled");
   

    }

    @Override
    public void print() {
        System.out.println("Appointment Number: " + getIdA());
        System.out.println("Status: " + getStatus());
        patient.display();
    }

    //set and get
    public int getIdA() {
        return idA;
    }

    public void setIdA(int id) {
        this.idA = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Appointment{" + "id=" + idA + ", patient=" + patient + ", status=" + status + '}';
    }

}


