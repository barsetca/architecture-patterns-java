package com.cherniak.architecture.patterns.rebase;

import java.util.List;
import lombok.Data;

@Data
public class Category {

  private long id;
  private String title;
  private List<Product> products;

}
