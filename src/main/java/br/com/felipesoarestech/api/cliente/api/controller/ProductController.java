package br.com.felipesoarestech.api.cliente.api.controller;

import br.com.felipesoarestech.api.cliente.domain.dto.ProductRequestDTO;
import br.com.felipesoarestech.api.cliente.domain.dto.ProductResponseDTO;
import br.com.felipesoarestech.api.cliente.domain.dto.UserRequestDTO;
import br.com.felipesoarestech.api.cliente.domain.dto.UserResponseDTO;
import br.com.felipesoarestech.api.cliente.domain.model.Product;
import br.com.felipesoarestech.api.cliente.domain.model.User;
import br.com.felipesoarestech.api.cliente.domain.repository.ProductRepository;
import br.com.felipesoarestech.api.cliente.domain.service.ProductService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductRepository repository;
    @Autowired
    ProductService productService;
    @SecurityRequirement(name = "Bearer Authentication")
    @PostMapping
    public ProductResponseDTO postProduct(@RequestBody @Valid ProductRequestDTO body){
        Product newProduct = new Product(body);
        return productService.save(newProduct);
    }
    @SecurityRequirement(name = "Bearer Authentication")
    @GetMapping
    public ResponseEntity getAllProducts(){
        List<ProductResponseDTO> productList =  productService.getAllProducts();

        return ResponseEntity.ok(productList);
    }
    @SecurityRequirement(name = "Bearer Authentication")
    @DeleteMapping("/{productID}")
    public ResponseEntity deleteProduct(@PathVariable Integer productID){

      return productService.delete(productID);
    }
}

