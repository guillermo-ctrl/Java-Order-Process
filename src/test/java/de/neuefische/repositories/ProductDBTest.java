package de.neuefische.repositories;

import de.neuefische.entities.Product;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductDBTest {
    @Test
    public void productDBget(){
        // GIVEN
        Product product = new Product(1, "bier");
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        ProductDB productDB =  new ProductDB(productList);
        // WHEN
        Product expected = productDB.get(1);
        // THEN
        assertEquals(product,expected);

    }
    @Test
    public void productDBlist(){
        // GIVEN
        Product product = new Product(1,"bier");
        Product product1 = new Product(2, "keks");
        List<Product> productList = new ArrayList<>();

        productList.add(product);
        productList.add(product1);
        ProductDB expected = new ProductDB(productList);
        // WHEN
        List<Product> actual = expected.list();
        // THEN
        assertEquals(productList, actual);

    }
}