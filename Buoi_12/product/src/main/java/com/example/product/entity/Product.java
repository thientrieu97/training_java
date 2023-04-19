package com.example.product.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "price", nullable = false, length = 100)
    private String price;

    @Column(name = "image", nullable = false, length = 100)
    private String image;
    @Column(name = "quantity", nullable = false, length = 100)
    private String quantity;

    //Builder Pattern : không phải nhồi nhét hàng tá tham số vào các constructor của mình
    public Product(ProductBuilder productBuilder) {
        this.name = productBuilder.name;
        this.price = productBuilder.price;
        this.quantity = productBuilder.quantity;
        this.image = productBuilder.image;
    }

    public Product() {
    }


    public static class ProductBuilder {
        private final String name;
        private String price;
        private String image;
        private String quantity;


        public ProductBuilder(String name) {
            this.name = name;
        }

        public ProductBuilder price(String price) {
            this.price = price;
            return this;
        }

        public ProductBuilder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        public ProductBuilder image(String image) {
            this.image = image;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
