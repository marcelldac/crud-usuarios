package com.crud_usuarios.crud_usuarios.services;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud_usuarios.crud_usuarios.models.User;
import com.crud_usuarios.crud_usuarios.repository.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<User> getUsers() {
    return userRepository.getUsers();
  }

  public Optional<User> getById(Integer id) {
    if (id == null) {
      throw new InputMismatchException("Id not found.");
    }
    return userRepository.getById(id);
  }

  public User addUser(User user) {
    return userRepository.addUser(user);
  }

  public void removeUser(Integer id) {
    userRepository.removeUser(id);
  }

  public User updateUser(User user) {
    return userRepository.updateUser(user);
  }

}
