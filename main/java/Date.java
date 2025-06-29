
import java.io.Serializable;

public class Date implements Serializable {

    private int day;
    private int month;
    private int year;

    public Date() {
        this(0, 0, 0);
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

 
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d-%02d-%04d", getDay(), getMonth(), getYear());
    }

}

