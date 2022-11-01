package com.example.springhibernate.orm;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Customer", schema = "dbo")
public class Customer {

    @javax.persistence.Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @NotNull(message = "Name cant be null")
    @Column(name = "NAME")
    private String name;
    @NotNull
    @Column(name = "SURNAME")
    private String surname;
    @NotNull
    @Column(name = "EMAIL")
    private String email;

    public Customer() {
    }

    public Customer(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String  toString() {
        return "Customer{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
