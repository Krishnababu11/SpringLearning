package com.KrishnaBabu.demo.Controller;
import com.KrishnaBabu.demo.Model.ProductModel;
import com.KrishnaBabu.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/check")
    public ResponseEntity<String> checkPostMethod() {
        String response = productService.checkPostmethodResponse();
        return ResponseEntity.ok(response);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addProduct(@RequestBody ProductModel product) {
        String response = productService.addProductResponse(product);
        return ResponseEntity.ok(response);
    }
}
