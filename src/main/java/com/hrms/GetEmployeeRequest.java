package com.hrms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEmployeeRequest", propOrder = {
    "employeeId"
})
public class GetEmployeeRequest {

    protected int employeeId;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int value) {
        this.employeeId = value;
    }

}
