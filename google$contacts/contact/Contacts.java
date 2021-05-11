import java.util.ArrayList;

//Facundo Zamora, fzamora994@alumnos.iua.edu.ar

public class Contacts {

    public Contacts() {
    }

    // general label
    private ArrayList<GeneralLabel> phoneLabel = new ArrayList<GeneralLabel>();
    private ArrayList<GeneralLabel> emailLabel = new ArrayList<GeneralLabel>();
    private GeneralLabel eventsLabel = new GeneralLabel();
    private GeneralLabel webLabel = new GeneralLabel();
    private GeneralLabel webCallLabel = new GeneralLabel();
    private GeneralLabel relationshipLabel = new GeneralLabel();
    private GeneralLabel chatLabel = new GeneralLabel();
    private GeneralLabel personalizedLabel = new GeneralLabel();

    // añadir validaciones

    // name, surname, etc
    private String name;
    private String surname;
    private String nickname;

    // personal dates
    private String birth;
    private String relationship;

    // country
    private String country;

    // business
    private String business;
    private String position;
    private String departament;

    // direction
    private String direction;
    private String direction2;
    private String postalCode;
    private String city;
    private String province;
    private String postalMail;

    // weird things
    private String preffix;
    private String suffix;
    private String phoneticName;
    private String phoneticSecondName;
    private String phoneticSurname;
    private String fileAs;

    // string things
    private String notes;

    // label
    private String label;

    // methods
    public String getPhoneLabel() {
        return phoneLabel.toString();
    }

    public void setListPhoneLabel(String data, String label) {

        GeneralLabel a = new GeneralLabel();

        a.setData(data);
        a.setLabel(label);

        phoneLabel.add(a);

    }

    public String getEmailLabel() {
        return emailLabel.toString();
    }

    public void setListEmailLabel(String data, String label) {

        GeneralLabel e = new GeneralLabel();

        e.setData(data);
        e.setLabel(label);

        emailLabel.add(e);

    }

    public String getEventsLabel() {
        return eventsLabel.toString();
    }

    public void setEventsLabel(String data, String label) {

        try {

            validation(data);
            eventsLabel.setData(data);

        } catch (Exception e) {
            System.out.println(e);
        }

        try {

            validation(label);
            eventsLabel.setLabel(label);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public String getWebLabel() {
        return webLabel.toString();
    }

    public void setWebLabel(String data, String label) {

        try {

            validation(data);
            webLabel.setData(data);

        } catch (Exception e) {
            System.out.println(e);
        }

        try {

            validation(label);
            webLabel.setLabel(label);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public String getWebCallLabel() {
        return webCallLabel.toString();
    }

    public void setWebCallLabel(String data, String label) {
        
        try {

            validation(data);
            webCallLabel.setData(data);

        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        webCallLabel.setLabel(label);
    }

    public String getRelationshipLabel() {
        return relationshipLabel.toString();
    }

    public void setRelationshipLabel(String data, String label) {
        relationshipLabel.setData(data);
        relationshipLabel.setLabel(label);
    }

    public String getChatLabel() {
        return chatLabel.toString();
    }

    public void setChatLabel(String data, String label) {
        chatLabel.setData(data);
        chatLabel.setLabel(label);
    }

    public String getPersonalizedLabel() {
        return personalizedLabel.toString();
    }

    public void setPersonalizedLabel(String data, String label) {
        personalizedLabel.setData(data);
        personalizedLabel.setLabel(label);
    }

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
    public String toString() {

        String ts = "Name: " + this.getName() + "\nSurname: " + this.getSurname() + "\nPhone and label: "
                + this.phoneLabel.toString() + "\nCountry: " + this.country + "\nEmail and label: "
                + this.emailLabel.toString() + "\nContact label: " + this.label;

        return ts;
    }

}
