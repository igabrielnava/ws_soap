package com.hrms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEmployeeResponse", propOrder = {
    "employyeDetails"
})
public class GetEmployeeResponse {

    @XmlElement(required = true)
    protected EmployyeDetails employyeDetails;

    public EmployyeDetails getEmployyeDetails() {
        return employyeDetails;
    }

    public void setEmployyeDetails(EmployyeDetails value) {
        this.employyeDetails = value;
    }

}
