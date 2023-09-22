package com.crud_usuarios.crud_usuarios.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.crud_usuarios.crud_usuarios.models.User;

@Repository
public class UserRepository {

  private List<User> users = new ArrayList<User>();
  private Integer lastId = 0;

  public List<User> getUsers() {
    return users;
  }

  public Optional<User> getById(Integer id) {
    return users
        .stream()
        .filter(user -> user.getId() == id)
        .findFirst();
  }

  public User addUser(User user) {
    lastId++;
    user.setId(lastId);
    users.add(user);
    return user;
  }

  public void removeUser(Integer id) {
    users.removeIf(user -> user.getId() == id);
  }

  public User updateUser(User user) {
    Optional<User> findUser = getById(user.getId());

    if (findUser.isEmpty()) {
      throw new InputMismatchException("User not found");
    }

    removeUser(user.getId());

    users.add(user);

    return user;
  }
}
