package de.neuefische.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    public void productGetName() {
        // GIVEN
        Product product = new Product(1, "bier");

        // WHEN
        String actual = product.getName();

        // THEN
        assertEquals("bier", actual);
    }

    @Test
    public void orderGetId() {
        // GIVEN
        Product product = new Product(1, "bier");

        // WHEN
        int actual = product.getId();

        // THEN
        assertEquals(1, actual);
    }

}