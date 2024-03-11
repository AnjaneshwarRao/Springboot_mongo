package com.cistech.SpringDemoApplication;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component("univ1")
public class University {
    String Name;
    String Address;

    public void getUniversityDetails(){
        System.out.println(this.getName()+this.getAddress());
    }
}
