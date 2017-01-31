package lea.myResultSetExtractor;

import java.util.List;

/**
 * Created by User on 31.01.2017.
 */
public class Adress {
    private String first_name;
    private String second_name;
    private int telephon;
    private String town;
    private List<Profession> list;


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


    public List<Profession> getList() {
        return list;
    }

    public void setList(List<Profession> list) {
        this.list = list;
    }


    @Override
    public String toString() {
        return "Adress{" +
                "first_name='" + first_name + '\'' +
                ", second_name='" + second_name + '\'' +
                ", telephon=" + telephon +
                ", town='" + town + '\'' +
       //         ", list=" + list +
                '}';
    }
}
