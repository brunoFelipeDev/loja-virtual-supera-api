package br.com.supera.lojavirtual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.supera.lojavirtual.dto.ProductDto;
import br.com.supera.lojavirtual.model.Product;
import br.com.supera.lojavirtual.repository.ProductRepositoryJpa;

@Service
public class ProductService {

	@Autowired
	private ProductRepositoryJpa productRepository;

	public List<ProductDto> getProductsDto() {
		return ProductDto.to(productRepository.findAll());
	}

	public Product save(ProductDto productDto) {
		Product product = from(productDto);

		return productRepository.saveAndFlush(product);
	}

	public void saveAll(List<ProductDto> productsDto) {
		for (ProductDto productDto : productsDto) {
			Product product = from(productDto);
			productRepository.saveAndFlush(product);
		}
	}

	private Product from(ProductDto productDto) {

		Product product = new Product();
		product.setId(productDto.getId());
		product.setImage(productDto.getImage());
		product.setName(productDto.getName());
		product.setPrice(productDto.getPrice());
		product.setScore(productDto.getScore());

		return product;
	}
}
