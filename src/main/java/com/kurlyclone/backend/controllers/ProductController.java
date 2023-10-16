package com.kurlyclone.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kurlyclone.backend.dtos.ProductDto.BasicProduct;
import com.kurlyclone.backend.repositories.ProductRepository;
import com.kurlyclone.backend.repositories.ReviewRepository;
import com.kurlyclone.backend.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ReviewRepository reviewRepository;

	@GetMapping("/products")
	public List<BasicProduct> getProductWithAlgorithm(@RequestParam String algorithm) {
		ProductService service = new ProductService(productRepository, reviewRepository);
		return service.getProductWithAlgorithm(algorithm);
	}
}
