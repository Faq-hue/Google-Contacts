//Facundo Zamora, fzamora994@alumnos.iua.edu.ar

public class Contacts {


    public Contacts() {
    }

    public Contacts(String n, String s, String b, String p, String m) {

        this.setName(n);

        this.setSurname(s);

        this.setBusiness(b);

        this.setPosition(p);

        this.setMail(m);

    }


    // añadir validaciones

    // name, surname, etc
    private String name;

    private String surname;
    private String nickname;

    // personal dates
    private String birth;
    private String relationship;

    // phone
    public Phone numPhone = new Phone();

    //country
    private String country;

    // business
    private String business;
    private String position;
    private String departament;

    // direction hacer de esto una clase direccion que contenga los datos que se
    // listan y que se puedan agregar mas contactos
    private String direction;
    private String direction2;
    private String postalCode;
    private String city;
    private String province;
    private String postalMail;

    // mail
    private String mail;
    private String web;
    private String chat;
    private String webCall;

    // weird things
    private String preffix;
    private String suffix;
    private String phoneticName;
    private String phoneticSecondName;
    private String phoneticSurname;
    private String fileAs;
    private String events;

    // string things
    private String personalized;
    private String notes;

    // label
    private String label;

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {

        try {
            
            validation(name);

            this.name = name;

        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {

        try {
            
            validation(surname);

            this.surname = surname;

        } catch (Exception e) {
            System.out.println(e);
        }

        
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBirth() {
        return this.birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getRelationship() {
        return this.relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getBusiness() {
        return this.business;
    }

    public void setBusiness(String business) {

        try {
            
            validation(business);

            this.business = business;

        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartament() {
        return this.departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDirection2() {
        return this.direction2;
    }

    public void setDirection2(String direction2) {
        this.direction2 = direction2;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalMail() {
        return this.postalMail;
    }

    public void setPostalMail(String postalMail) {
        this.postalMail = postalMail;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getWeb() {
        return this.web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getChat() {
        return this.chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public String getWebCall() {
        return this.webCall;
    }

    public void setWebCall(String webCall) {
        this.webCall = webCall;
    }

    public String getPreffix() {
        return this.preffix;
    }

    public void setPreffix(String preffix) {
        this.preffix = preffix;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPhoneticName() {
        return this.phoneticName;
    }

    public void setPhoneticName(String phoneticName) {
        this.phoneticName = phoneticName;
    }

    public String getPhoneticSecondName() {
        return this.phoneticSecondName;
    }

    public void setPhoneticSecondName(String phoneticSecondName) {
        this.phoneticSecondName = phoneticSecondName;
    }

    public String getPhoneticSurname() {
        return this.phoneticSurname;
    }

    public void setPhoneticSurname(String phoneticSurname) {
        this.phoneticSurname = phoneticSurname;
    }

    public String getFileAs() {
        return this.fileAs;
    }

    public void setFileAs(String fileAs) {
        this.fileAs = fileAs;
    }

    public String getEvents() {
        return this.events;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public String getPersonalized() {
        return this.personalized;
    }

    public void setPersonalized(String personalized) {
        this.personalized = personalized;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

   
    public void validation(String word) {

        for (int i = 0; i < word.length(); i++) {

            char c = word.trim().charAt(i);

            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {

                throw new IllegalArgumentException(
                        "Invalid parameter: " + word + ". Only English alphabet characters are allowed.");
            }
        }

    }

    @Override
    public String toString(){

        String ts = this.getName() + " " + this.getSurname() + " " + this.numPhone + " " + this.country + " " + this.label;

        return ts;
    }

}
