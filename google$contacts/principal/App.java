//Facundo Zamora, fzamora994@alumnos.iua.edu.ar

class App {

    public static void main(String[] args) {

        DataBase db = new DataBase();

        for (int i = 0; i < 5; i++) {

            db.add(GenerateContact.contactGenerator());

        }

        db.show();

        Label.searchByLabel("Work", db);

    }

}