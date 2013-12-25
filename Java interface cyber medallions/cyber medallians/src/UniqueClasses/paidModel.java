/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UniqueClasses;

/**
 *
 * @author DELL
 */
public class paidModel {

    private String paidID;
    private String Balance;
    private String previousMonth;
    private String ownerID;
    
    
     public paidModel(){
  
  
  }


    public paidModel(String paidID, String Balance, String previousMonth, String ownerID) {
        this.paidID = paidID;
        this.Balance = Balance;
        this.previousMonth = previousMonth;
        this.ownerID = ownerID;
    }

    /**
     * @return the paidID
     */
    public String getPaidID() {
        return paidID;
    }

    /**
     * @param paidID the paidID to set
     */
    public void setPaidID(String paidID) {
        this.paidID = paidID;
    }

    /**
     * @return the Balance
     */
    public String getBalance() {
        return Balance;
    }

    /**
     * @param Balance the Balance to set
     */
    public void setBalance(String Balance) {
        this.Balance = Balance;
    }

    /**
     * @return the previousMonth
     */
    public String getPreviousMonth() {
        return previousMonth;
    }

    /**
     * @param previousMonth the previousMonth to set
     */
    public void setPreviousMonth(String previousMonth) {
        this.previousMonth = previousMonth;
    }

    /**
     * @return the ownerID
     */
    public String getOwnerID() {
        return ownerID;
    }

    /**
     * @param ownerID the ownerID to set
     */
    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }
}
