/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UniqueClasses;

/**
 *
 * @author DELL
 */
public class Metermodel {
    private String meterID;
    private String meterNo;
    private String rpu;
    private String connectedDate;
    private String madeIn;
    private String ownerID;
public Metermodel(){ //create default Metermodel construter.....

}

public Metermodel(String meterID, String meterNo, String rpu, String connectedDate, String madeIn ,String ownerID) {
        this.meterID = meterID;
        this.meterNo = meterNo;
        this.rpu = rpu;
        this.connectedDate = connectedDate;
        this.madeIn = madeIn;
        this.ownerID = ownerID;
        
}

    /**
     * @return the meterID
     */
    public String getMeterID() {
        return meterID;
    }

    /**
     * @param meterID the meterID to set
     */
    public void setMeterID(String meterID) {
        this.meterID = meterID;
    }

    /**
     * @return the meterNo
     */
    public String getMeterNo() {
        return meterNo;
    }

    /**
     * @param meterNo the meterNo to set
     */
    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    /**
     * @return the rpu
     */
    public String getRpu() {
        return rpu;
    }

    /**
     * @param rpu the rpu to set
     */
    public void setRpu(String rpu) {
        this.rpu = rpu;
    }

    /**
     * @return the connectedDate
     */
    public String getConnectedDate() {
        return connectedDate;
    }

    /**
     * @param connectedDate the connectedDate to set
     */
    public void setConnectedDate(String connectedDate) {
        this.connectedDate = connectedDate;
    }

    /**
     * @return the madeIn
     */
    public String getMadeIn() {
        return madeIn;
    }

    /**
     * @param madeIn the madeIn to set
     */
    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
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