package org.example;

public class DigitalProduct extends Product implements Discountable {
    private String downloadUrl;
    private double fileSizeMB;
    private double discountedPrice;

    public DigitalProduct(Long id,String name,double price,String downloadUrl,double fileSizeMB){
        super(id,name,price);
        this.downloadUrl=downloadUrl;
        this.fileSizeMB=fileSizeMB;
    }

    public DigitalProduct(){
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    @Override
    public String getSummary() {
        return "Digital: " + getName() + "| Download:"+downloadUrl;
    }

    @Override
    public void applyDiscount (double rate){
        this.discountedPrice = getPrice() * (1-rate);
    }

    @Override
    public double getDiscountedPrice(){
        return discountedPrice;
    }


}
