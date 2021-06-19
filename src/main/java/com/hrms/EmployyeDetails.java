package com.hrms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employyeDetails", propOrder = {
    "employeeId",
    "employeeName",
    "location",
    "zipcode"
})
public class EmployyeDetails {

    protected int employeeId;
    @XmlElement(required = true)
    protected String employeeName;
    @XmlElement(required = true)
    protected String location;
    protected int zipcode;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int value) {
        this.employeeId = value;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String value) {
        this.employeeName = value;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String value) {
        this.location = value;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int value) {
        this.zipcode = value;
    }

}
