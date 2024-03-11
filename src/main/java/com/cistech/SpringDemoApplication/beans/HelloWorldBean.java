package com.cistech.SpringDemoApplication.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloWorldBean {
    String message;

    //my first commit with develop branch
    public HelloWorldBean(String message) {
        this.message = message;
    }

    public static void main(String[] args) {


        System.out.println("anjanis good boy");

        System.out.println("abhi is good");

        // bugfix branch
    }
}
