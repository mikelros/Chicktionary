package com.ckt.mikel.chicktionary;

import java.io.Serializable;

/**
 * Created by Mikel on 06/10/2016.
 */
public class Person implements Serializable {
    private String name;
    private String email;
    private Integer phone;
    private Float rating;
    private Integer picture;

    public Person(String name, String email, Integer phone, Integer picture, Float rating) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.picture = picture;
        this.rating = rating;
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

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Integer getPicture() {
        return picture;
    }

    public void setPicture(Integer picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", rating=" + rating +
                ", picture='" + picture + '\'' +
                '}';
    }
}
