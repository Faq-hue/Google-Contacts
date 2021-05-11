import java.util.List;

//Facundo Zamora, fzamora994@alumnos.iua.edu.ar

public class ContactLabel {

    public static void searchByLabel(String search, DataBase db) {

        List <Contacts> data = db.getDataBase();

        for (int i = 0; i < data.size(); i++) {

            if (data.get(i).getLabel() == search) {

                System.out.println(search + "): " + data.get(i).getName() + " " + data.get(i).getSurname());

            }

        }

    }

}
