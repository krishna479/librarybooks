package com.example.Sql_Rocks;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_info")
public class User {
    @Id
    @Column(unique = true)
    private int id;

    private String name;
@Column(unique = true)
private String email;
    private String mobno;
    private int age;
    @Column(name="country_name")
    private String country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(){

    }
    public User(int id, String name, String mobno, int age) {
        this.id = id;
        this.name = name;
        this.mobno = mobno;
        this.age = age;

    }

}
