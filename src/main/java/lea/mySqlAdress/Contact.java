package lea.mySqlAdress;

/**
 * Created by john on 30.01.17.
 */
public class Contact {
    private String first_name;
    private String second_name;
    private int telephon;
    private String town;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public int getTelephon() {
        return telephon;
    }

    public void setTelephon(int telephon) {
        this.telephon = telephon;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "first_name='" + first_name + '\'' +
                ", second_name='" + second_name + '\'' +
                ", telephon=" + telephon +
                ", town='" + town + '\'' +
                '}';
    }

//    public String toString () {
//        return
//    }
}
