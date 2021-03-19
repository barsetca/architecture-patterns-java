package com.cherniak.architecture.patterns.rebase;

public class Main {

  public static void main(String[] args) {
    User user = new User(2, "name2", "mail2");
    System.out.println(user.setDefaultConcat());
    System.out.println(user.setDefaultName());
    System.out.println(user.setDefaultEmail());
    System.out.println("Rebase");
   // var registry = new PrometheusMeterRegistry(PrometheusConfig.DEFAULT);
  }

}
