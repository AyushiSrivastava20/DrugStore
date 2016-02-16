/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author ayushi
 */
public class Store {
    
    private String storeName;
    private String storeId;
    private String address;
    private String contact;
    private String email;
    private String manager;
    private InventoryList inventoryList;
    
    public Store(){
        inventoryList = new InventoryList();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public InventoryList getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(InventoryList inventoryList) {
        this.inventoryList = inventoryList;
    }
    @Override
    public String toString(){
        return storeName;
    }

   
}
