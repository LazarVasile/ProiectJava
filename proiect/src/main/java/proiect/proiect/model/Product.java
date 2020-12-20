package proiect.proiect.model;
import proiect.proiect.model.Provider;

import java.util.Date;

public class Product {
    private int id;
    private String name;
    private Provider provider;
    private int price;
    private Date expirationDate;
    private String barcode;

    public Product() {}

    public Product(int id, String name, Provider provider, int price, Date expirationDate, String barcode) {
        this.id = id;
        this.name = name;
        this.provider = provider;
        this.price = price;
        this.expirationDate = expirationDate;
        this.barcode = barcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
