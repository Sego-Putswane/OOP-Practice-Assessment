package com.assessment.products;

/** * Concrete product class for clothing */
public class ClothingProduct extends Product {
    // TODO: Add private fields for size (String) and material (String)
    private String size;
    private String material;

    /** * Constructs a ClothingProduct object. */
    public ClothingProduct(String id, String name, double price, int stockQuantity, String size, String material) {
        super(id, name, price, stockQuantity);
        // TODO: IMPLEMENT: Initialize clothing-specific fields.
        this.size = size;
        this.material = material;
    }

    // TODO: Create getters for size and material
    public String getSize() {
        return this.size;
    }

    public String getMaterial() {
        return this.material;
    }

    @Override
    public double calculateDiscount() {
        // TODO: IMPLEMENT: Clothing gets 15% discount if price > 100, otherwise 8%.
        return getPrice() > 100 ? getPrice() * 0.15 : getPrice() * 0.08;
    }

    @Override
    public String toString() {
        // TODO: IMPLEMENT: Call super.toString() and append size and material details.
        return super.toString() + ", Size: " + size + ", Material: " + material;
    }
}