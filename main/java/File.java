import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class File {
    
    public static void main(String[] args) {

         ArrayList<Clinic> clinics = new ArrayList<>();

        
        Clinic c1 = new Clinic("Eye Clinic", 5 ,2);
        Clinic c2 = new Clinic("Dental Clinic", 3,1);
        Clinic c3 = new Clinic("Emergance Clinc", 4,2);

     
        c1.addDoctor(new Doctor(1111, "Dr.Abdullah", new BirthPlace("Saudi Arabia", "Riyadh"), 'M',new Date(8, 2, 1990), 14000, "Ophthalmology"));
        c1.addDoctor(new Doctor(2222, "Dr.Amal", new BirthPlace("Egypt", "cairo"), 'F', new Date(12, 9, 1998), 9000, "Ophthalmology"));
        c1.addDoctor(new Doctor(3333, "Dr.Fahad", new BirthPlace("Saudi Arabia", "jedah"), 'M', new Date(1, 8, 1995), 10000, "Ophthalmology"));
        c1.addNurse(new  Nurse(1111, "N.Norah", new BirthPlace("Saudi Arabia", "Riyadh"), 'F',new Date(8, 2, 1989), 15000, "Nursing"));
        
        c2.addDoctor(new Doctor(4444, "Dr.Mohammed", new BirthPlace("Sudan", "Khartoum"), 'M', new Date(9, 11, 1999), 20000, "Dantal"));
        c2.addDoctor(new Doctor(333, "Dr.jessica", new BirthPlace("Uk", "Landon"), 'F', new Date(9, 11, 1997), 18000, "Dntal"));
        c2.addNurse(new Nurse(1111, "Dr.Fatimah", new BirthPlace("Saudi Arabia", "Riyadh"), 'F',new Date(15, 4, 1989), 15000, "Nursing"));
        
        
        
       
        c3.addDoctor(new Doctor(1111, "Dr.Norah", new BirthPlace("Saudi Arabia", "Riyadh"), 'F',new Date(8, 2, 1989), 15000, "Emergency"));
        c3.addNurse(new Nurse(1111, "N.Mere", new BirthPlace("Saudi Arabia", "Riyadh"), 'F',new Date(24, 7, 1989), 15000, "Nursing"));
          
        
        clinics.add(c1);
        clinics.add(c2);
        clinics.add(c3);
        //save clinics to file
        saveData(clinics);
    }

    public static void saveData(ArrayList<Clinic> clinics) {

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

  

  
    }
    
    
    
    
    
    
    
    
    
    
    
    


