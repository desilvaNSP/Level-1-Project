/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UniqueClasses;

/**
 *
 * @author DELL
 */
public class ReadingModel {
     private String reading_id;
    private String dates;
    private String times;
    private String units;
    private String no_of_dates;
    private String months;
     private String meter_id;
    
    public ReadingModel(){ //create default readingmodel construter.....

}


    public ReadingModel(String reading_id, String dates, String times, String units, String no_of_dates, String months, String meter_id) {
        this.reading_id = reading_id;
        this.dates = dates;
        this.times = times;
        this.units = units;
        this.no_of_dates = no_of_dates;
        this.months = months;
        this.meter_id = meter_id;
    }

    /**
     * @return the reading_id
     */
    public String getReading_id() {
        return reading_id;
    }

    /**
     * @param reading_id the reading_id to set
     */
    public void setReading_id(String reading_id) {
        this.reading_id = reading_id;
    }

    /**
     * @return the dates
     */
    public String getDates() {
        return dates;
    }

    /**
     * @param dates the dates to set
     */
    public void setDates(String dates) {
        this.dates = dates;
    }

    /**
     * @return the times
     */
    public String getTimes() {
        return times;
    }

    /**
     * @param times the times to set
     */
    public void setTimes(String times) {
        this.times = times;
    }

    /**
     * @return the units
     */
    public String getUnits() {
        return units;
    }

    /**
     * @param units the units to set
     */
    public void setUnits(String units) {
        this.units = units;
    }

    /**
     * @return the no_of_dates
     */
    public String getNo_of_dates() {
        return no_of_dates;
    }

    /**
     * @param no_of_dates the no_of_dates to set
     */
    public void setNo_of_dates(String no_of_dates) {
        this.no_of_dates = no_of_dates;
    }

    /**
     * @return the months
     */
    public String getMonths() {
        return months;
    }

    /**
     * @param months the months to set
     */
    public void setMonths(String months) {
        this.months = months;
    }

    /**
     * @return the meter_id
     */
    public String getMeter_id() {
        return meter_id;
    }

    /**
     * @param meter_id the meter_id to set
     */
    public void setMeter_id(String meter_id) {
        this.meter_id = meter_id;
    }
   
}
