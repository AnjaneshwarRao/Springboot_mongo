package com.cistech.SpringDemoApplication.service;

import com.cistech.SpringDemoApplication.beans.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserService {
    private static List<User> users=new ArrayList();

    static {
        users.add(new User(1,"Test 1",LocalDate.now().minusYears(12)));
        users.add(new User(2,"Test 2",LocalDate.now().minusYears(13)));
        users.add(new User(3,"Test 3",LocalDate.now().minusYears(14)));
    }

    public List<User> getUsers(){
        return users;
    }


    public User getById(int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst().get();
    }

    public User addNewUser(User u){
        u.setId(users.size()+1);
        users.add(u);
        return u;
    }

    public User deleteById(int id){
        User u=users.stream().filter(user -> user.getId()==id).findFirst().get();
        users.remove(u);
        return u;
    }
    
    public User updateUser(User user) {
        int id= user.getId();
        int index=users.stream().map(u->u.getId()).collect(Collectors.toList()).indexOf(id);
        users.set(index,user);
        return user;
    }
}
