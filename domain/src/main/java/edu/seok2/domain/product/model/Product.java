package edu.seok2.domain.product.model;

public class Product {

    private Long id;
    private String name;
    private Long price;

    public Product(Long id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
