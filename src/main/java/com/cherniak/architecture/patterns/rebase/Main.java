package com.cherniak.architecture.patterns.rebase;

public class Main {

  public static void main(String[] args) {
    User user = new User(1, "name", "mail");
    System.out.println(user.setDefaultName());
  }

}