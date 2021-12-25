package com.oop;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(); //referans olusturma
        product1.id = 1;
        product1.name = "Lenovo";
        product1.unitPrice = 20;
        product1.detail = "1 TB Harddisk";

        Product[] products = {product1};

        System.out.println(products.length);

        ProductService productService = new ProductService();
        productService.addToCart(product1);
    }
}
