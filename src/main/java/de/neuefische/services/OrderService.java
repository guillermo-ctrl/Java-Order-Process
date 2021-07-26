package de.neuefische.services;

import de.neuefische.entities.Order;
import de.neuefische.repositories.OrderDB;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private OrderDB orderDB = new OrderDB();

    public List<Order> listOrders() {
        return orderDB.list();
    }

    public void addOrder(Order order) {
        //Exception for empty, illegal argument exception, look at 21
        try {
            orderDB.add(order);
        } catch (IllegalArgumentException e) {
            System.out.println("Argument hast to be an order." + e);
        }
    }
    //prüfen ob Produkte drinnen sind, falls nicht /illegal Argument exception
}
