/**
 * This file was generated by the Jeddict
 */
package com.fanos.lole.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "order_laundry")
//@IdClass(OrderLaundryPK.class)
public class OrderLaundry implements Serializable {

//    @Column(name = "order_id", table = "order_laundry", nullable = false)
//    @Id
//    private int orderId;
//
//    @Column(name = "laundry_id", table = "order_laundry", nullable = false)
//    @Id
//    private int laundryId;

    @Column(name = "unit_price", table = "order_laundry", nullable = false, scale = 2, precision = 12)
    @Basic(optional = false)
    private BigDecimal unitPrice;

    @Column(name = "quantity", table = "order_laundry", nullable = false)
    @Basic(optional = false)
    private int quantity;

    @Column(name = "created_at", table = "order_laundry")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at", table = "order_laundry")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @ManyToOne(optional = false)
    @Id
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false)
    private LoleOrder loleOrder;

    @ManyToOne(optional = false)
    @Id
    @JoinColumn(name = "LAUNDRY_ID", referencedColumnName = "LAUNDRY_ID", insertable = false, updatable = false)
    private Laundry laundry;

//    public int getOrderId() {
//        return this.orderId;
//    }
//
//    public void setOrderId(int orderId) {
//        this.orderId = orderId;
//    }
//
//    public int getLaundryId() {
//        return this.laundryId;
//    }
//
//    public void setLaundryId(int laundryId) {
//        this.laundryId = laundryId;
//    }

    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LoleOrder getLoleOrder() {
        return this.loleOrder;
    }

    public void setLoleOrder(LoleOrder loleOrder) {
        this.loleOrder = loleOrder;
    }

    public Laundry getLaundry() {
        return this.laundry;
    }

    public void setLaundry(Laundry laundry) {
        this.laundry = laundry;
    }

}