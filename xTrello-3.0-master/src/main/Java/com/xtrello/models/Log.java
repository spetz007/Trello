package com.xtrello.models;

/**
 *клас відповідає  картоки на дошці
 */

public class Log {
    private long id;
    private String name;
    /** Log creator */
    private long user_id;
    private String dateCreate;

    public Log(long id, String name, long user_id, String dateCreate) {
        this.id = id;
        this.name = name;
        this.user_id = user_id;
        this.dateCreate = dateCreate;
    }

    public Log() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }
}
