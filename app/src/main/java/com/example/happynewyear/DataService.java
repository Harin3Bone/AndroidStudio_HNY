package com.example.happynewyear;

public class DataService {
    private static DataService instance;
    private String firstname;
    private String lastname;
    private String wish;

    private DataService(){

    }

    public static DataService getInstance(){
        if (instance == null){
            instance = new DataService();
        }
        return instance;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }
}
