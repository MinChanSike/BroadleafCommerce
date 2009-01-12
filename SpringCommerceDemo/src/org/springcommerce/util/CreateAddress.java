package org.springcommerce.util;

import java.io.Serializable;

import javax.persistence.Transient;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CreateAddress implements Serializable {
    private static final long serialVersionUID = 1L;
    @SuppressWarnings("unused")
    @Transient
    private final Log logger = LogFactory.getLog(getClass());
    private String addressLine1;
    private String addressLine2;
    private String addressName;
    private String city;
    private String state;
    private String zipCode;

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getAddressName() {
        return addressName;
    }

    public String getCity() {
        return city;
    }

    public Log getLogger() {
        return logger;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
