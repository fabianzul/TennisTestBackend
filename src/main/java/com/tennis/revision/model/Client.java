package com.tennis.revision.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "clients")
public class Client {
    private int id;
    private String cc;
    private String firstName;
    private String lastName;
    private Date birthday;

    public Client() {
    }

    public Client(int id, String cc, String firstName, String lastName, Date birthday) {
        this.id = id;
        this.cc = cc;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
