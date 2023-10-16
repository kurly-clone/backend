package com.kurlyclone.backend.dtos;

import com.kurlyclone.backend.entities.Product;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class ProductDto {
	@Getter
	@Setter
	@Builder
	public static class BasicProduct {
		private int id;
		private String name;
		private String deliveryType;
		private String brand;
		private double price;
		private double discount;
		private String image;
		private int reviewCount;

		public static BasicProduct ProductToBasicProductDto(Product product, int reviewCount) {
			return BasicProduct.builder()
				.id(product.getId())
				.name(product.getName())
				.deliveryType(product.getDeliveryType())
				.brand(product.getBrand())
				.price(product.getPrice())
				.discount(product.getDiscount())
				.image(product.getImage())
				.reviewCount(reviewCount)
				.build();
		}
	}

}
