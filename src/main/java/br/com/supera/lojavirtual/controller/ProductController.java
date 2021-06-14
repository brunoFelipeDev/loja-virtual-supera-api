package br.com.supera.lojavirtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.supera.lojavirtual.dto.ProductDto;
import br.com.supera.lojavirtual.model.Product;
import br.com.supera.lojavirtual.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping
	public ResponseEntity<Product> includeMany(@RequestBody ProductDto productDto) {
		return ResponseEntity.ok(productService.save(productDto));
	}
}
