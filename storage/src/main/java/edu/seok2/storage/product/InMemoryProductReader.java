package edu.seok2.storage.product;

import edu.seok2.domain.product.model.Product;
import edu.seok2.domain.product.repository.ProductReader;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class InMemoryProductReader implements ProductReader {

    private final Map<Long, Product> elements = new HashMap<>();

    @Override
    public Product findById(Long id) {
        return elements.get(id);
    }
}
