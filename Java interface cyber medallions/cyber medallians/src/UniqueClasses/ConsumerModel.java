/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UniqueClasses;

public class ConsumerModel {

    private String ownerID;
    private String name;
    private String nic;
    private String homeNo;
    private String street;
    private String homeTown;
    private String mainCity;
    private String TlpNo;

    public ConsumerModel(String nic) {
        this.nic = nic;
    }

    public ConsumerModel() {
    }

    public ConsumerModel(String ownerID, String name, String nic, String homeNo, String street, String homeTown, String mainCity, String TlpNo) {
        this.ownerID = ownerID;
        this.name = name;
        this.nic = nic;
        this.homeNo = homeNo;
        this.street = street;
        this.homeTown = homeTown;
        this.mainCity = mainCity;
        this.TlpNo = TlpNo;
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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the homeNo
     */
    public String getHomeNo() {
        return homeNo;
    }

    /**
     * @param homeNo the homeNo to set
     */
    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the homeTown
     */
    public String getHomeTown() {
        return homeTown;
    }

    /**
     * @param homeTown the homeTown to set
     */
    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    /**
     * @return the mainCity
     */
    public String getMainCity() {
        return mainCity;
    }

    /**
     * @param mainCity the mainCity to set
     */
    public void setMainCity(String mainCity) {
        this.mainCity = mainCity;
    }

    /**
     * @return the TlpNo
     */
    public String getTlpNo() {
        return TlpNo;
    }

    /**
     * @param TlpNo the TlpNo to set
     */
    public void setTlpNo(String TlpNo) {
        this.TlpNo = TlpNo;
    }
}
