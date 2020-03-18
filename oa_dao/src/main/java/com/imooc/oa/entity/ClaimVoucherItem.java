package com.imooc.oa.entity;

/**
 * Created by Administrator on 2019/12/11.
 */
public class ClaimVoucherItem {
    private Integer id;
    private Integer claimVoucherId;
    private String item;
    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private String comment;

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClaimVoucherId() {
        return claimVoucherId;
    }

    public void setClaimVoucherId(Integer claimVoucherId) {
        this.claimVoucherId = claimVoucherId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
