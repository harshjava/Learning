package com.example.Zafar.model;

import jdk.nashorn.internal.objects.annotations.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class SessionState {
    @Id
    @GeneratedValue
    private long id;
    private String sessionState;
    private Date date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSessionState() {
        return sessionState;
    }

    public void setSessionState(String sessionState) {
        this.sessionState = sessionState;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public SessionState(long id, String sessionState, Date date) {
        this.id = id;
        this.sessionState = sessionState;
        this.date = date;
    }

    public SessionState() {
    }
}
