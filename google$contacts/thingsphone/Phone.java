import java.util.ArrayList;

//Facundo Zamora, fzamora994@alumnos.iua.edu.ar

public class Phone {
    ArrayList<String> phones = new ArrayList<String>();

    public Phone() {
    }

    public void setPhone(String num) {

        phones.add(num);

    }

    public ArrayList<String> getPhones() {

        return phones;
    }

    public void show() {

        for (int i = 0; i < phones.size(); i++) {
        
            System.out.println(i + 1 + ")" + phones.get(i));
        
        }

    }

    @Override
    public String toString() {

        if (phones.size() != 0) {

            return phones.get(0);

        }

        return null;
    }

}
