package com.mindhub.homebanking.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Account {
    //Attributes or properties
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name="native",strategy = "native")
    private Long id;
    private string number, balance;
    private LocalDate creationDate;


    //Constructors

    public Account() {
    }

    public Account(string number, string balance, LocalDate creationDate) {
        this.number = number;
        this.balance = balance;
        this.creationDate = creationDate;
    }
    //Methods or behaviors


    public string getNumber() {
        return number;
    }

    public void setNumber(string number) {
        this.number = number;
    }

    public string getBalance() {
        return balance;
    }

    public void setBalance(string balance) {
        this.balance = balance;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", balance=" + balance +
                ", creationDate=" + creationDate +
                '}';
    }
}
