package com.mindhub.homebanking.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Account {
    //Attributes or properties
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name="native",strategy = "native")
    private Long id;
    private String number;
    private String balance;
    private LocalDate creationDate;

    @ManyToOne(fetch = FetchType.EAGER)
    private Client client;
    //Constructors

    public Account() {
    }

    public Account(String number, String balance, LocalDate creationDate) {
        this.number = number;
        this.balance = balance;
        this.creationDate = creationDate;
    }

    //Methods or behaviors



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    /*@Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance='" + balance + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }*/

    @JsonIgnore
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
