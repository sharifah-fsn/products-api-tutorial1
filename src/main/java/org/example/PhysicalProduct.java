package org.example;// org.example.PhysicalProduct IS-A Product because...
// A ShoppingCart is NOT a Product because it holds products rather than being a product itself.

public class PhysicalProduct extends Product implements Discountable {
    private double weightKg;
    private String dimensions;
    private double discountPrice;

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

    @Override
    public String getSummary(){
        return "Physical: " + getName() + "| Weight:"+ weightKg + " | Dimensions"+dimensions;
    }

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        this.discountPrice = getPrice() * (1-capped);
    }
    @Override
    public double getDiscountedPrice() {
        return discountPrice;
    }

}
