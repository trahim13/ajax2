package org.trahim.spring.ajax2.models;

import org.trahim.spring.ajax2.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductModel {

    public Product find() {
        return new Product("pr1", "name1", 20);
    }

    public List<Product> findAllProduct() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("pr1", "name1", 20));
        products.add(new Product("pr2", "name2", 30));
        products.add(new Product("pr3", "name3", 40));
        products.add(new Product("pr4", "name4", 50));
        products.add(new Product("pr5", "name5", 60));
        return products;
    }
}
