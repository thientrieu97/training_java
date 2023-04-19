package com.example.product.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class ProductForm {
    private Long id;
    private String name;
    private String price;

    private String quantity;
    private MultipartFile image;

    public ProductForm() {
    }

    public ProductForm(ProductFormBuilder productFormBuilder) {
        this.name = productFormBuilder.name;
        this.price = productFormBuilder.price;
        this.quantity = productFormBuilder.quantity;
        this.image = productFormBuilder.image;
    }

    public static class ProductFormBuilder {
        private final String name;
        private String price;

        private String quantity;
        private MultipartFile image;



        public ProductFormBuilder(String name) {

            this.name = name;
        }

        public ProductFormBuilder price(String price) {
            this.price = price;
            return this;
        }

        public ProductFormBuilder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        public ProductFormBuilder image(MultipartFile image) {
            this.image = image;
            return this;
        }

        public ProductForm build() {
            return new ProductForm(this);
        }
    }
}
