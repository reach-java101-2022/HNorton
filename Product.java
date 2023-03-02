package murach.business;

import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;
//constructor, sets code and description to empty string, and sets price to 0
    public Product() {
        code = "";
        description = "";
        price = 0;
    }
// constructor, set instance verible to parameters values received
    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    // shows price in a formated way
    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String priceFormatted = currency.format(price);
        return priceFormatted;
    }    
}