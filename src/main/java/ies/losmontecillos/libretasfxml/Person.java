package ies.losmontecillos.libretasfxml;

import javafx.beans.property.SimpleStringProperty;

public class Person {
    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty email;

    public Person() {
        this("", "", "");
    }

    public Person(String firstName, String lastName, String email) {
        this.firstName = new SimpleStringProperty("");
        this.lastName = new SimpleStringProperty("");
        this.email = new SimpleStringProperty("");
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
    }

    public String getFirstName() {
        return this.firstName.get();
    }

    public void setFirstName(String fName) {
        this.firstName.set(fName);
    }

    public String getLastName() {
        return this.lastName.get();
    }

    public void setLastName(String fName) {
        this.lastName.set(fName);
    }

    public String getEmail() {
        return this.email.get();
    }

    public void setEmail(String fName) {
        this.email.set(fName);
    }
}
