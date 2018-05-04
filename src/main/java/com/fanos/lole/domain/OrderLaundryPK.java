//
// This file was generated by the Jeddict
//
package com.fanos.lole.domain;

import java.io.Serializable;
import java.util.Objects;

public class OrderLaundryPK implements Serializable {

    private int orderId;

    private int laundryId;

    public OrderLaundryPK() {
    }

    public OrderLaundryPK(int orderId, int laundryId) {
        this.orderId = orderId;
        this.laundryId = laundryId;
    }

    public int getOrderId() {
        return this.orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getLaundryId() {
        return this.laundryId;
    }

    public void setLaundryId(int laundryId) {
        this.laundryId = laundryId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Objects.equals(getClass(), obj.getClass())) {
            return false;
        }
        final OrderLaundryPK other = (OrderLaundryPK) obj;
        if (!java.util.Objects.equals(this.getOrderId(), other.getOrderId())) {
            return false;
        }
        if (!java.util.Objects.equals(this.getLaundryId(), other.getLaundryId())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.getOrderId();
        hash = 31 * hash + this.getLaundryId();
        return hash;
    }

    @Override
    public String toString() {
        return "OrderLaundryPK{" + " orderId=" + orderId + ", laundryId=" + laundryId + '}';
    }

}