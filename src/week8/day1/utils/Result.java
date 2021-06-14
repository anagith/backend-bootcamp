package week8.day1.utils;

import week8.day1.models.Product;

import java.util.Arrays;

public class Result {
    Product[] products;

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Result{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}
