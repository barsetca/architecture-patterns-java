package com.cherniak.architecture.patterns.rebase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private Integer id;
  private String name;
  private String email;

  public String concat(){
    return this.name + "->" + this.email;
  }

}
