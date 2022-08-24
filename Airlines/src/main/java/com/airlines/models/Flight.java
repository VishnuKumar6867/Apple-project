/*package com.airlines.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Data
@Document("FlightDetails")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long flightid;
    private String flightname;
    private String contactnumber;
    private String contactAddress;
    private boolean blockedStatus;

    @Override
    public String toString() {
        return "Flight{" +
                "flightid=" + flightid +
                ", flightname='" + flightname + '\'' +
                ", contactnumber='" + contactnumber + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                ", blocked=" + blockedStatus +
                '}';
    }

    public long getFlightid() {
        return flightid;
    }

    public void setFlightid(long flightid) {
        this.flightid = flightid;
    }

    public String getFlightname() {
        return flightname;
    }

    public void setFlightname(String flightname) {
        this.flightname = flightname;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public boolean getBlockedStatus() {
        return blockedStatus;
    }

    public void setBlocked(boolean blocked) {
        this.blockedStatus = blocked;
    }

    public Flight() {
    }

    public Flight(long flightid, String flightname, String contactnumber, String contactAddress, boolean blocked) {
        this.flightid = flightid;
        this.flightname = flightname;
        this.contactnumber = contactnumber;
        this.contactAddress = contactAddress;
        this.blockedStatus = blockedStatus;
    }
}
*/