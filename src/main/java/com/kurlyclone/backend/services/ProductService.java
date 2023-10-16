package com.kurlyclone.backend.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kurlyclone.backend.dtos.ProductDto.BasicProduct;
import com.kurlyclone.backend.entities.Product;
import com.kurlyclone.backend.entities.Review;
import com.kurlyclone.backend.repositories.ProductRepository;
import com.kurlyclone.backend.repositories.ReviewRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	private final ProductRepository productRepository;
	private final ReviewRepository reviewRepository;
	private final Map<String, ArrayList<Integer>> algorithmMap = Map.ofEntries(
		Map.entry("test", new ArrayList<Integer>(List.of(1, 2, 3, 4, 5)))
	);

	public List<BasicProduct> getProductWithAlgorithm(String algorithm) {
		List<BasicProduct> productList = new ArrayList<>();
		ArrayList<Integer> id_list = algorithmMap.get(algorithm);

		if (id_list != null) {
			for (int id : id_list) {
				Optional<Product> product = productRepository.findById(id);
				if (product.isPresent()) {
					List<Review> reviews = reviewRepository.findByProductId(product.get());
					BasicProduct basicProduct = BasicProduct.ProductToBasicProductDto(product.get(), reviews.size());
					productList.add(basicProduct);
				}
			}
		}

		return productList;
	}
}
