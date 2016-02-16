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
public class Drug {
    
    
   private String drugName;
   private static int count=0;
   private int drugId;
   private String pharmaComp;
   private String concentration;
   private String composition;
   private String listPrice;
   private String mfgContact;
   private String mfglic;
   private String mfgEmail;
   private String mrktBy;
   private int avail;
   
   public Drug(){
        count++;
        drugId = count;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Drug.count = count;
    }

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public String getPharmaComp() {
        return pharmaComp;
    }

    public void setPharmaComp(String pharmaComp) {
        this.pharmaComp = pharmaComp;
    }

    public String getConcentration() {
        return concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getListPrice() {
        return listPrice;
    }

    public void setListPrice(String listPrice) {
        this.listPrice = listPrice;
    }

    public String getMfgContact() {
        return mfgContact;
    }

    public void setMfgContact(String mfgContact) {
        this.mfgContact = mfgContact;
    }

    public String getMfglic() {
        return mfglic;
    }

    public void setMfglic(String mfglic) {
        this.mfglic = mfglic;
    }

    public String getMfgEmail() {
        return mfgEmail;
    }

    public void setMfgEmail(String mfgEmail) {
        this.mfgEmail = mfgEmail;
    }

    public String getMrktBy() {
        return mrktBy;
    }

    public void setMrktBy(String mrktBy) {
        this.mrktBy = mrktBy;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }
    
   
    
    @Override
    public String toString(){
        return drugName;
    }
    
    
    
}
