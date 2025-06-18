import java.io.Serializable;

public abstract class Person implements Serializable {

    private int id;
    private String name;
    private BirthPlace birthPlace;
    private char gender; 

    public Person() {
        this(0, "", null, ' ');
    }

    public Person(int id, String name, BirthPlace birthPlace, char gender) {
        this.id = id;
        this.name = name;
        this.birthPlace = birthPlace ;
        this.gender = gender;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BirthPlace getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(BirthPlace birthPlace) {
        this.birthPlace = birthPlace;
    }

 

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + "id:" + id + ", name:" + name + ", Place of Birth:" + birthPlace + ", gender:" + gender + '}';
    }

}

