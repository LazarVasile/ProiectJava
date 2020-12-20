package proiect.proiect.model;
import proiect.proiect.model.Product;

import java.util.Date;

public class Sale {
    private int id;
    private int number;
    private Date date;
    private Product product;

    public Sale(int id, int number, Date date, Product product) {
        this.id = id;
        this.number = number;
        this.date = date;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
