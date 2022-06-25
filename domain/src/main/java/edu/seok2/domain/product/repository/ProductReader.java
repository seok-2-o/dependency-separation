package edu.seok2.domain.product.repository;

import edu.seok2.domain.product.model.Product;

import java.util.Optional;

public interface ProductReader {

    Product findById(Long id);
}
