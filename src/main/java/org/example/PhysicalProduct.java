package org.example;// org.example.PhysicalProduct IS-A Product because...
// A ShoppingCart is NOT a Product because it holds products rather than being a product itself.

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){
    }

    public PhysicalProduct(Long id, String name, double price, double weightKg,String dimensions){
        super(id,name,price);
        this.weightKg=weightKg;
        this.dimensions=dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
