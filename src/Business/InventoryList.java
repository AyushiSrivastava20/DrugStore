/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author ayushi
 */
public class InventoryList {
    
    private ArrayList<Inventory>  inventoryList;
    
    public InventoryList(){
         inventoryList = new ArrayList<Inventory>();
    }

    public ArrayList<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }
    
     public void removeInventory(Inventory  i){
        inventoryList.remove(i);
    }
    public Inventory addInventory(Drug d, String ed, int q){
        Inventory i = new Inventory();
        i.setDrug(d);
        i.setExpiryDate(ed);
        i.setQuantity(q);
        inventoryList.add(i);
        return i;
    }
    
}

