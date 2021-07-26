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
        Product product = new Product(1, "bier");
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        Order order1 = new Order(1, productList);
        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);

        OrderDB orderDB = new OrderDB();
        orderDB.add(order1);
        //WHEN
        List<Order> actual = orderDB.list();
        // THEN
        assertEquals(orderList, actual);
    }

    @Test
    public void orderDBadd() {
        //GIVEN
        Product product = new Product(1, "bier");
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        Order order1 = new Order(1, productList);
        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);

        OrderDB orderDB = new OrderDB();
        orderDB.add(order1);
        //WHEN
        int actual = orderList.size();
        //THEN
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void orderDBget() {
        //GIVEN
        Product product = new Product(1, "bier");
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        Order order1 = new Order(1, productList);
        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        //WHEN
        OrderDB orderDB = new OrderDB();
        orderDB.add(order1);
        Order actual = orderDB.get(1);
        //THEN
        assertEquals(order1, actual);
    }
}