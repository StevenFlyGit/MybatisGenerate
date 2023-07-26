package com.wpf.domain.cargo;

import java.util.Date;

public class Packing {
    private String packingListId;

    private String seller;

    private String buyer;

    private String invoiceNo;

    private Date invoiceDate;

    private String marks;

    private String descriptions;

    private String exportIds;

    private String exportNos;

    private Date packingTime;

    private Double packingMoney;

    private Double totalVolume;

    private Double netWeights;

    private Double grossWeights;

    private Integer state;

    private String createBy;

    private String createDept;

    private Date createTime;

    private String companyId;

    private String companyName;

    public String getPackingListId() {
        return packingListId;
    }

    public void setPackingListId(String packingListId) {
        this.packingListId = packingListId;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getExportIds() {
        return exportIds;
    }

    public void setExportIds(String exportIds) {
        this.exportIds = exportIds;
    }

    public String getExportNos() {
        return exportNos;
    }

    public void setExportNos(String exportNos) {
        this.exportNos = exportNos;
    }

    public Date getPackingTime() {
        return packingTime;
    }

    public void setPackingTime(Date packingTime) {
        this.packingTime = packingTime;
    }

    public Double getPackingMoney() {
        return packingMoney;
    }

    public void setPackingMoney(Double packingMoney) {
        this.packingMoney = packingMoney;
    }

    public Double getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(Double totalVolume) {
        this.totalVolume = totalVolume;
    }

    public Double getNetWeights() {
        return netWeights;
    }

    public void setNetWeights(Double netWeights) {
        this.netWeights = netWeights;
    }

    public Double getGrossWeights() {
        return grossWeights;
    }

    public void setGrossWeights(Double grossWeights) {
        this.grossWeights = grossWeights;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateDept() {
        return createDept;
    }

    public void setCreateDept(String createDept) {
        this.createDept = createDept;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}