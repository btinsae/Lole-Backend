/**
 * This file was generated by the Jeddict
 */
package com.fanos.lole.domain;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "product_rating_and_comment")
public class ProductRatingAndComment {

    @Column(name = "rating_comment_id", table = "product_rating_and_comment", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ratingCommentId;

    @Column(name = "rating", table = "product_rating_and_comment")
    @Basic
    private Integer rating;

    @Column(name = "comment", table = "product_rating_and_comment", length = 100)
    @Basic
    private String comment;

    @Column(name = "created_at", table = "product_rating_and_comment", nullable = false)
    @Basic(optional = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at", table = "product_rating_and_comment", nullable = false)
    @Basic(optional = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @ManyToOne(optional = false)
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    private Product productId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID")
    private Customer customerId;

    public Integer getRatingCommentId() {
        return this.ratingCommentId;
    }

    public void setRatingCommentId(Integer ratingCommentId) {
        this.ratingCommentId = ratingCommentId;
    }

    public Integer getRating() {
        return this.rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public Product getProductId() {
        return this.productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Customer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

}