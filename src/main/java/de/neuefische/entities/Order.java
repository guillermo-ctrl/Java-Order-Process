package de.neuefische.entities;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> list = new ArrayList<>();
    private int id;

    public Order(int id, List<Product> list) {
        this.id = id;
        this.list = list;
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

