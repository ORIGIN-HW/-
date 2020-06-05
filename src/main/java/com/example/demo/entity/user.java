package com.example.demo.entity;

/**
 * @className user
 * @Description
 * @Date 2020-02-19 19:09
 * @created by Administrator
 */
public class user {
    private String name;
    private int id;
    private String pwd;
    private int age;
    private String email;

    public user() {
    }

    public user(String name, int id, String pwd, int age, String email) {
        this.name = name;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", email=" + email +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
