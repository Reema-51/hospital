
import java.io.Serializable;

public class BirthPlace implements Serializable {

    private String country;
    private String city;
  

    public BirthPlace() {
        this("", "");
    }

    public BirthPlace(String country, String city) {
        this.country = country;
        this.city = city;
    }

   
 
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" + "country=" + country + ", city=" + city + '}';
    }


}



