public class Patient extends Person {

    //ط§ظ„ظپط±ظ‚ ط¨ظٹظ† ط§ظ„ط§ط«ظ†ظٹظ† ط°ظˆظ„
    private static int numOfFiles;
    private int fileNo;
   
       public Patient() {
        this(0, "", null, ' ');
    }

    public Patient(int id, String name, BirthPlace birthPlace, char gender) {
        super(id, name, birthPlace, gender);
        this.fileNo = ++numOfFiles;
    }
    public void display() {
        System.out.println("Patient Information: ");
        System.out.println("Name: " + getName());
        System.out.println("Id: " + getId());
        System.out.println("Gender: " + getGender());
        System.out.println("File No: " + getFileNo());
    }

    public static int getNumOfFiles() {
        return numOfFiles;
    }

    public static void setNumOfFiles(int numOfFiles) {
        Patient.numOfFiles = numOfFiles;
    }

    public int getFileNo() {
        return fileNo;
    }

    public void setFileNo(int fileNo) {
        this.fileNo = fileNo;
    }   @Override
    public String toString() {
        return super.toString() + "Patient{" + "fileNo=" + fileNo + '}';
    }

}

