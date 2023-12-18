package com.example.tool;

public abstract class Tool {
    private String name; // name of the instrument
    private String typeOfUsage; // professional or for home usage
    private String brandName;
    private String madeIn; // Country where it's manufactured

    @Override
    public String toString() {
        return "Tool{" +
                "name='" + name + '\'' +
                ", typeOfUsage='" + typeOfUsage + '\'' +
                ", brandName='" + brandName + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", price=" + price +
                '}';
    }

    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfUsage() {
        return typeOfUsage;
    }

    public void setTypeOfUsage(String typeOfUsage) {
        this.typeOfUsage = typeOfUsage;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Tool(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public Tool() {

    }
    public abstract void sound();

}
