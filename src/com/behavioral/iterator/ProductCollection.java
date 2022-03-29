package com.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public Iterator createIterator() {
    return new ProductIterator(this);
  }

  public class ProductIterator implements Iterator {
    private ProductCollection collection;
    private int index;

    public ProductIterator(ProductCollection collection){
      this.collection = collection;
    }

    @Override
    public void next(){
      index++;
    }

    @Override
    public Product current(){
      return collection.products.get(index);
    }

    @Override
    public boolean hasNext(){
      return (index < collection.products.size());
    }
  }
}
