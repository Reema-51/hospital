public class   Doctor extends Staff {

    private String specialty;

    public Doctor() {
        this(0, "", null, ' ', null, 0, "");
    }

    public Doctor(int id, String name, BirthPlace birthPlace, char gender, Date joinDate, double salary, String specialty) {
        super(id, name, birthPlace, gender, joinDate, salary);
        this.specialty = specialty;
    }

    public void display() {
        System.out.println("\nName: " + getName()+"    Specialty: " + getSpecialty());
        System.out.println("-------------------------------------------------------");
    }

    
   
    
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return super.toString() + "Doctor{" + "specialty=" + specialty + '}';
    }

}
