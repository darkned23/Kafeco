/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.*;
import java.util.Date;
/**
 *
 * @author darkn
 */
public class Reservation {
    private String name;
    private String email;
    private Date date;
    private Duration duration;
    private int numberPerson;

    public Reservation() {
    }

    public Reservation(String name, String email, Date date, Duration duration, int numberPerson) {
        this.name = name;
        this.email = email;
        this.date = date;
        this.duration = duration;
        this.numberPerson = numberPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }
    
}
