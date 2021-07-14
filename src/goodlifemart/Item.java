package goodlifemart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Item {
    String itemId;
    String itemName;
    String itemCategory;
    String company;
    String availability;
    int price;
    int discount;
    
    public Item(){
    
    };
    
    public Item(String itemId, String itemName, String itemCategory, String company, String availability, int price, int discount) {
        this.itemId=itemId;
        this.itemName=itemName;
        this.itemCategory=itemCategory;
        this.company=company;
        this.availability=availability;
        this.price=price;
        this.discount=discount;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public String getCompany() {
        return company;
    }

    public String isAvailability() {
        return availability;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    
}
