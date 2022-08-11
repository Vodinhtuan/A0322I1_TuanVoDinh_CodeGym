package ss17_IO_binary_file_serialization.exercise.product_management;

import java.io.Serializable;

public class Items implements Serializable {
    private int idItem;
    private String nameItem, brandItem, description;
    private double priceItem;

    public Items() {
    }

    public Items(int idItem, String nameItem, String brandItem, String description, double priceItem) {
        this.idItem = idItem;
        this.nameItem = nameItem;
        this.brandItem = brandItem;
        this.description = description;
        this.priceItem = priceItem;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public String getBrandItem() {
        return brandItem;
    }

    public void setBrandItem(String brandItem) {
        this.brandItem = brandItem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(double priceItem) {
        this.priceItem = priceItem;
    }

    @Override
    public String toString() {
        return "Items " +
                "idItem= " + idItem +
                ", nameItem= '" + nameItem + '\'' +
                ", brandItem= '" + brandItem + '\'' +
                ", description= '" + description + '\'' +
                ", priceItem= " + priceItem ;
    }
}
