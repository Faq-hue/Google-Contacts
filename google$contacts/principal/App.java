//Facundo Zamora, fzamora994@alumnos.iua.edu.ar

class App {

    public static void main(String[] args) {

        DataBase db = new DataBase();

        for (int i = 0; i < 5; i++) {

            db.add(GenerateContact.contactGenerator());

        }

        System.out.println("Show contact list");

        db.show();

        System.out.println("\nDelete contact 3");

        db.delete(2);

        System.out.println("\nShow contact list again");

        db.show();

        System.out.println("\nAdd contact");

        db.add(GenerateContact.contactGenerator());

        System.out.println("\nShow contact list again");

        db.show();

        System.out.println("\nSearch by contact label: Work");

        ContactLabel.searchByLabel("Work", db);

    }

}