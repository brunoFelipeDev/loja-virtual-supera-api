package br.com.supera.lojavirtual.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.supera.lojavirtual.model.Product;

public class ProductDto {

	private Long id;
	private String name;
	private BigDecimal price;
	private int score;
	private String image;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public static ProductDto to(Product product) {
		ProductDto productDto = new ProductDto();
		productDto.setId(product.getId());
		productDto.setImage(product.getImage());
		productDto.setName(product.getName());
		productDto.setPrice(product.getPrice());
		productDto.setScore(product.getScore());

		return productDto;
	}

	public static List<ProductDto> to(List<Product> products) {
		List<ProductDto> productsDto = new ArrayList<ProductDto>();
		for (Product product : products) {
			productsDto.add(ProductDto.to(product));
		}

		return productsDto;
	}
}
