
public class Nurse extends Staff {

    private String Nspecialty;

    public Nurse(String Nspecialty) {
        this.Nspecialty = Nspecialty;
    }

    public Nurse( int id, String name,BirthPlace birthplace, char gender, Date birthday, double salary,String Nspecialty) {
        super(id, name, birthplace, gender, birthday, salary);
        this.Nspecialty = Nspecialty;
    }
    
    public Nurse() {
        this(0, "", null, ' ', null, 0,"");
    }

    public String getNspecialty() {
        return Nspecialty;
    }

    public void setNspecialty(String Nspecialty) {
        this.Nspecialty = Nspecialty;
    }
    public void display() {
        System.out.println("Name: " + getName()+"  Specialty: " + getNspecialty());
        System.out.println("-------------------------------------------------------");
    }
    
  

    @Override
    public String toString() {
        return "Nurse{" + "Nspecialty=" + Nspecialty + '}';
    }

}

