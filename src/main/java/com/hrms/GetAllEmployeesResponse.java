package com.hrms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllEmployeesResponse", propOrder = {
    "employyeDetails"
})
public class GetAllEmployeesResponse {

    @XmlElement(required = true)
    protected List<EmployyeDetails> employyeDetails;

    public List<EmployyeDetails> getEmployyeDetails() {
        if (employyeDetails == null) {
            employyeDetails = new ArrayList<EmployyeDetails>();
        }
        return this.employyeDetails;
    }

}
