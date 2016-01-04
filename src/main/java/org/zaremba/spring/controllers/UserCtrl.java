package org.zaremba.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zaremba.spring.entities.User;
import org.zaremba.spring.repo.UserRepo;

import javax.annotation.PostConstruct;

/**
 * @author Gorkhover D.
 * @since 2016-01-25
 */
@RestController
@RequestMapping("/user")
public class UserCtrl {

    @Autowired
    private UserRepo userRepo;

    @PostConstruct
    public void init() {
        System.out.println(userRepo.save(new User("user_name", "user_phone")));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User get(@PathVariable Integer id) {
        return userRepo.findOne(id);
    }
}
