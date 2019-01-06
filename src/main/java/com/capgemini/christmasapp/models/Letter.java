package com.capgemini.christmasapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Letter {

    @Id
    @GeneratedValue
    private long id;
    private String letterText;

    public Letter() {}

    public String getLetterText() {
        return letterText;
    }

    public void setLetterText(String letterText) {
        this.letterText = letterText;
    }
}
