public abstract class Staff extends Person {

    private static int numOfStaffs;
    private int staffId;
    private Date birthday ;
    private double salary;

    public Staff() {
        this(0, "", null, ' ', null, 0);
    }
    public Staff(int id, String name, BirthPlace birthPlace, char gender, Date birthday, double salary) {
        super(id, name, birthPlace, gender);
        staffId = ++numOfStaffs;
        this.birthday = birthday;
        this.salary = salary;
    }
    public static int getNumOfStaffs() {
        return numOfStaffs;
    }
    public static void setNumOfStaffs(int numOfStaffs) {
        Staff.numOfStaffs = numOfStaffs;
    }
    public int getStaffId() {
        return staffId;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return super.toString() + "Staff{" + "staffId=" + staffId + ", Birthday=" + birthday+ ", salary=" + salary + '}';
        
        
    }

}

      
