package org.zaremba.spring.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zaremba.spring.entities.User;
import org.zaremba.spring.repo.UserRepo;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * @author Gorkhover D.
 * @since 2016-01-25
 */
@RestController
@RequestMapping("/user")
public class UserCtrl {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserCtrl.class);

    @Autowired
    private UserRepo userRepo;

    @PostConstruct
    public void init() {
        final User user = new User("user_name", "user_phone");
        LOGGER.info("[init]: {}", userRepo.save(user));
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> users() {
        return StreamSupport
                .stream(userRepo.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User get(@PathVariable Integer id) {
        return userRepo.findOne(id);
    }
}
