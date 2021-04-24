package bd;

import java.util.HashMap;
import java.util.Map;

import contact.Contacts;

public class DataBase {
    
    private static Map <String, Contacts> contacts = new HashMap<String, Contacts>();

    public static void setContact( Contacts c ){
        contacts.put(c.getName(), c);
    }

    public static Contacts getContactByName( String name ){
        return contacts.get(name);
    }

}
