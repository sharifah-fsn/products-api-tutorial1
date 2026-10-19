package org.example;

public class DigitalProduct extends Product {
    private String downloadUrl;
    private double fileSizeMB;

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

}
