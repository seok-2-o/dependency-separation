package edu.seok2.domain.product.application;

import edu.seok2.domain.product.model.Product;
import edu.seok2.domain.product.repository.ProductReader;

import java.util.NoSuchElementException;

public class ProductQueryService {

    private final ProductReader productQueryRepository;

    public ProductQueryService(ProductReader productQueryRepository) {
        this.productQueryRepository = productQueryRepository;
    }

    public Product find(Long id) {
        return productQueryRepository.findById(id);

    }
}
