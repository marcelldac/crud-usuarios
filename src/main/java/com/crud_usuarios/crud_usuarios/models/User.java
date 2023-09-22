package com.crud_usuarios.crud_usuarios.models;

public class User {

  // #region Atributtes
  private Integer id;
  private String username;
  private String email;
  private String password;
  // #endregion

  // #region Getters and Setters
  public Integer getId() {
    return id;
  }

  public void setId(Integer lastId) {
    this.id = lastId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  // #endregion
}
