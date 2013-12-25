/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UniqueClasses;

/**
 *
 * @author DELL
 */

public class HastopayModel {
    private String AccountID;
    private String amount;
    private String OwnerID;
    
    
     public HastopayModel(){
  
  
  }

    public HastopayModel(String AccountID, String amount, String QwnerID) {
        this.AccountID = AccountID;
        this.amount = amount;
        this.OwnerID = OwnerID;
    }

    /**
     * @return the AccountID
     */
    public String getAccountID() {
        return AccountID;
    }

    /**
     * @param AccountID the AccountID to set
     */
    public void setAccountID(String AccountID) {
        this.AccountID = AccountID;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * @return the QwnerID
     */
    public String getOwnerID() {
        return OwnerID;
    }

    /**
     * @param OwnerID the OwnerID to set
     */
    public void setOwnerID(String OwnerID) {
        this.OwnerID = OwnerID;
    }

}
