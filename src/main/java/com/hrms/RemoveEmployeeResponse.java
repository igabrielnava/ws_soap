package com.hrms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeEmployeeResponse", propOrder = {
    "status"
})
public class RemoveEmployeeResponse {

    protected boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean value) {
        this.status = value;
    }

}
