package de.neuefische.entities;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    public void orderGetId() {
        Product product = new Product(1, "bier");
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        // GIVEN
        Order order = new Order(1, productList);

        // WHEN
        int actual = order.getId();

        // THEN
        assertEquals(1, actual);

    }

    @Test
    public void orderGetList() {
        Product product = new Product(1, "bier");
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        // GIVEN
        Order order = new Order(1, productList);

        // WHEN
        List actual = order.getList();

        // THEN
        assertEquals(productList, actual);
    }
}


