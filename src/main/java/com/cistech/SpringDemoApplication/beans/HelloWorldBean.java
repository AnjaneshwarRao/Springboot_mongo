package com.cistech.SpringDemoApplication.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloWorldBean {
    String message;
    public HelloWorldBean(String message){ this.message=message;}
}
