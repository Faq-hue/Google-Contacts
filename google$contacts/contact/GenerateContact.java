package contact;

import java.util.Random;

public class GenerateContact {
    
    public String mail;

    public String generateName(){

        String name[] = {"Facundo","Dario","Lorenzo","Kevin","Thais","Angelo","Milagros","Sofia","Gabriel","Enzo","Karen","Micaela","Ezequiel","Yair","Tomas","Britney","Taylor","Camila","Joaquin","Nicolas"};

        Random r = new Random();

        int x = r.nextInt(19);

        mail = name[x];

        return name[x];
    }



    public String generateSurname(){

        String surname[] = {"Zamora","Yanes","Sosa","Zavala","Sanabria","Musa","Escudero","Manfredi","Spears","Swift","Cortez","Ikari","Varela","Gomez","Maldonado","Vega","Arevalo","Gomez","Peralta","Ponce"};

        Random r = new Random();

        int x = r.nextInt(19);

        mail = mail + surname[x];

        return surname[x];
    }


    public String generateBusiness(){

        String business[] = {"Apple","Google","Sony","Samsung","LG","Rexona","Lakai","Ford","Fiat","Nerv","Spotify","McDonalds","BMW","SpaceX","Adidas","Nestle","Heineken","P&G","Micrososft","Subway"}; 

        Random r = new Random();

        int x = r.nextInt(19);

        return business[x];
    }


    public String generatePosition(){

        String position[] = {"CEO","Ingeniero","Lavaplatos","Cocinero","Asistente","Tecnico","Gerente","Recursos Humanos","Administrador","Vendedor","Analista","Ejecutivo","Community Manager","Supervisor","Auditor","Chofer","Liquidador de Sueldos","Consultor","Webmaster","Programador"};

        Random r = new Random();

        int x = r.nextInt(19);

        return position[x];
    }


    public int generatePhoneNumber(){

        Random r = new Random();

        int x = r.nextInt(1000001) + 1;

        return x;
    }


    public String generateGmail(){

        return mail + "@gmail.com";
    }
}
