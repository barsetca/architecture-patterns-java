package com.cherniak.architecture.patterns.rebase;

import java.util.ArrayList;
import java.util.List;
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

  public Integer concat(){
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


  public boolean setIdNull2(){
    this.id = null;
    return true;
  }

  public String setDefaultEmail(){
    return this.email = "default@email";
  }

  public String setDefaultName(){
    return  this.email = "defaultName";
  }

  public String setDefaultConcat(){
    return setDefaultEmail() + " - "+ setDefaultName() + multiplyId()*2;
  }

  public List<Integer> getIds(){
    return new ArrayList<>(this.id);
  }


}
