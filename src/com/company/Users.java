package com.company;

public class Users {

    /**
     * the class users with all thz parameters
     */
        private String name;
        private String firstname;
        private String work;
        private int departement;
        private int age;

    public Users (String n, String fn, String w, int depart, int a){
        this.name = n;
        this.firstname = fn;
        this.work = w;
        this.departement = depart;
        this.age = a;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getDepartement() {
        return departement;
    }

    public void setDepartement(int departement) {
        this.departement = departement;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
