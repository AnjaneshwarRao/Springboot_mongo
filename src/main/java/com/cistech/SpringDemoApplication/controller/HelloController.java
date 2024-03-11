package com.cistech.SpringDemoApplication.controller;

import com.cistech.SpringDemoApplication.beans.HelloWorldBean;
import com.cistech.SpringDemoApplication.beans.User;
import com.cistech.SpringDemoApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    UserService service;

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWorld() {
        return "Hello-World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello-World");
    }

    @GetMapping(path = "/hello-world/{name}")
    public String helloWorldPathVariable(@PathVariable String name) {
        return "Hello-World" + name;
    }

    @GetMapping(path = "/users")
    public List<User> getUser() {
        return service.getUsers();
    }

    @GetMapping(path = "/users/{id}")
    public User getUserById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping(path = "/users")
    public User addUser(@RequestBody User u) {
        return service.addNewUser(u);
    }

    @DeleteMapping(path = "/users/{id}")
    public User deleteUserById(@PathVariable int id) {
        return service.deleteById(id);
    }


    @PutMapping(path = "/users")
    public User updateUser(@RequestBody User u) {
        User user = service.updateUser(u);
        return user;
    }
        public User getUserById ( @PathVariable int id){
            User user = service.getById(id);
            return user;
        }
    }

