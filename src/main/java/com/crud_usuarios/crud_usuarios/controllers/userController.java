package com.crud_usuarios.crud_usuarios.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud_usuarios.crud_usuarios.models.User;
import com.crud_usuarios.crud_usuarios.services.UserService;

@RestController
@RequestMapping("/users")
public class userController {

  @Autowired
  private UserService userService;

  @GetMapping("/{id}")
  public Optional<User> getById(@PathVariable Integer id) {
    return userService.getById(id);
  }

  @GetMapping
  public List<User> getUsers() {
    return userService.getUsers();
  }

  @PostMapping
  public User addUser(@RequestBody User user) {
    return userService.addUser(user);
  }

  @DeleteMapping("/{id}")
  public String removeUser(Integer id) {
    userService.removeUser(id);
    return "User with id " + id + " removed sucessfully.";
  }

  @PutMapping("/{id}")
  public User updateUser(User user) {
    return userService.updateUser(user);
  }

}
