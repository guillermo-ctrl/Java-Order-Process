package de.neuefische.repositories;

import de.neuefische.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductDB {
    private List<Product> productList = new ArrayList<>();


    public ProductDB(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> list() {
        return productList;
    }
    public Product get(int id){
        Product finalProduct = new Product(1, "b");
        for(Product product:productList){
            if (product.getId() == id){
                finalProduct = product;
            }
        }
      return finalProduct;
    }
}
