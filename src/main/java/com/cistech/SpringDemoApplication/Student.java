package com.cistech.SpringDemoApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Student {
    private long Id;
    public String Name;
    public String Email;
    @Autowired
    @Qualifier("univ1")
    University univ;

    public Student() {
        System.out.println("This is a Constructor");
    }

    public Student(long id, String name, String email) {
        Id = id;
        Name = name;
        Email = email;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void printStudentDetails(){
        univ.setName("JNTU");
        univ.setAddress("Address");
        univ.getUniversityDetails();
        System.out.println(this.Id+" "+this.Name+" "+this.Email);
    }
}
