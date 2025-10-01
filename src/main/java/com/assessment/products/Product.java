package com.assessment.products;

/**
 * Abstract base class for all products
 */
public abstract class Product {
    // TODO: Declare private fields for id, name, price, and stockQuantity
    private String id;
    private String name;
    private double price;
    private int stockQuantity;

    /**
     * Constructs a Product object.
     * @param id The product ID.
     * @param name The product name.
     * @param price The unit price of the product.
     * @param stockQuantity The number of units in stock.
     */
    // TODO: Create a constructor that initializes all fields
    public Product(String id, String name, double price, int stockQuantity) {
        // TODO: IMPLEMENT: Initialize fields, calling setters for price and stockQuantity.
        this.id = id;
        this.name = name;
        setPrice(price);
        setStockQuantity(stockQuantity);
    }

    // TODO: Create getters for all fields
    public String getId() { return this.id;}
    public String getName() { return this.name;}
    public double getPrice() { return this.price;}
    public int getStockQuantity() { return this.stockQuantity;}

    // TODO: Create setters for price and stockQuantity with validation
    public void setPrice(double price) {
        // TODO: IMPLEMENT: Set price, throwing IllegalArgumentException if price < 0.
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        // TODO: IMPLEMENT: Set stockQuantity, throwing IllegalArgumentException if quantity < 0.
        if (stockQuantity < 0) {
            throw new IllegalArgumentException("Stock Quantity cannot be negative");
        }
        this.stockQuantity = stockQuantity;
    }

    /**
     * Abstract method to calculate the product's discount based on its specific type rules.
     * @return The discount amount in dollars (not percentage).
     */
    public abstract double calculateDiscount();

    /**
     * Calculates the price after applying the discount.
     * @return The final price after discount.
     */
    public double getDiscountedPrice() {
        // TODO: IMPLEMENT: Return the price after subtracting the discount.
        double discountedPrice = this.price - calculateDiscount();
        return Math.max(discountedPrice, 0.0);
    }

    @Override
    public String toString() {
        // TODO: IMPLEMENT: Return a formatted string with core product information.
        return "Product ID: " + id +
                ", Name: " + name +
                ", Price: $" + String.format("%.2f", price) +
                ", Stock Quantity: " + stockQuantity;
    }
}