package br.com.supera.lojavirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.supera.lojavirtual.model.Product;

public interface ProductRepositoryJpa extends JpaRepository<Product, Long> {

}