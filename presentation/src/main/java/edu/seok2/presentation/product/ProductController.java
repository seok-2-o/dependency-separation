package edu.seok2.presentation.product;

import edu.seok2.domain.product.application.ProductQueryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductQueryService productQueryService;

    public ProductController(ProductQueryService productQueryService) {
        this.productQueryService = productQueryService;
    }

    @GetMapping("{id}")
    public ResponseEntity<String> find(@PathVariable  Long id) {
        return ResponseEntity.ok("hi" + id);
    }


}
