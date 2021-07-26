package de.neuefische.services;

import de.neuefische.entities.Order;
import de.neuefische.entities.Product;
import de.neuefische.repositories.OrderDB;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @Test
    public void checkingAddOrder() {
        // GIVEN
        Product product = new Product(1, "bier");
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        Order order1 = new Order(1,productList);
        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);

        OrderService orderService = new OrderService();
        orderService.addOrder(order1);
        //OrderDB orderDB = new OrderDB(orderList);
        int expected = orderList.size();
        // WHEN
        int actual = orderService.listOrders().size();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    public void checkingListOrders() {
        // GIVEN
        Product product = new Product(1, "bier");
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        Order order1 = new Order(1,productList);
        List<Order> expected = new ArrayList<>();
        expected.add(order1);

        OrderService orderService = new OrderService();
        orderService.addOrder(order1);


        // WHEN
        List <Order> actual = orderService.listOrders();
        // THEN
        assertEquals(expected , actual);
    }

}