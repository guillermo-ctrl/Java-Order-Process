package de.neuefische.repositories;

import de.neuefische.entities.Order;
import de.neuefische.entities.Product;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderDBTest {
    @Test
    public void orderDBlist() {
        //GIVEN
        Product product1 = new Product(1, "bier");
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        Order order = new Order(1, productList);
        OrderDB orderDB = new OrderDB(order);
         //WHEN
        OrderDB actual = orderDB.list();
        // THEN
        assertEquals();
    }

    @Test
    public void orderDBadd() {
        //GIVEN
        //WHEN
        //THEN
    }

    @Test
    public void orderDBget() {
        //GIVEN
        //WHEN
        //THEN
    }
}