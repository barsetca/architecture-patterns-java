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

  public String concat1(){
    return this.name + "->" + this.email;
  }

  public Integer concat2(){
    return this.id;
  }

  public Integer doubleIncrementId(){
    return this.id+2;

  }
    public Integer doubleDecrement(){
      return this.id-2;}


      public void setIdNull(){
    this.id = null;
         }

  public long multiplyId(){
    return (long) id*id;}
}
