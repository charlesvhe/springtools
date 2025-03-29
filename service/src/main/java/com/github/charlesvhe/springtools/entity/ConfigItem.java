package com.github.charlesvhe.springtools.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ConfigItem implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String appId;

    private String metaCode;

    private Long parentId;

    private Short sort;

    private String varchar1;

    private String varchar2;

    private String varchar3;

    private String varchar4;

    private String varchar5;

    private String text1;

    private String text2;

    private String text3;

    private java.math.BigDecimal decimal1;

    private java.math.BigDecimal decimal2;

    private java.math.BigDecimal decimal3;

    private java.util.Date timestamp1;

    private java.util.Date timestamp2;

    private java.util.Date timestamp3;

    private java.util.Date gmtCreate;

    private java.util.Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMetaCode() {
        return metaCode;
    }

    public void setMetaCode(String metaCode) {
        this.metaCode = metaCode;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public String getVarchar1() {
        return varchar1;
    }

    public void setVarchar1(String varchar1) {
        this.varchar1 = varchar1;
    }

    public String getVarchar2() {
        return varchar2;
    }

    public void setVarchar2(String varchar2) {
        this.varchar2 = varchar2;
    }

    public String getVarchar3() {
        return varchar3;
    }

    public void setVarchar3(String varchar3) {
        this.varchar3 = varchar3;
    }

    public String getVarchar4() {
        return varchar4;
    }

    public void setVarchar4(String varchar4) {
        this.varchar4 = varchar4;
    }

    public String getVarchar5() {
        return varchar5;
    }

    public void setVarchar5(String varchar5) {
        this.varchar5 = varchar5;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public java.math.BigDecimal getDecimal1() {
        return decimal1;
    }

    public void setDecimal1(java.math.BigDecimal decimal1) {
        this.decimal1 = decimal1;
    }

    public java.math.BigDecimal getDecimal2() {
        return decimal2;
    }

    public void setDecimal2(java.math.BigDecimal decimal2) {
        this.decimal2 = decimal2;
    }

    public java.math.BigDecimal getDecimal3() {
        return decimal3;
    }

    public void setDecimal3(java.math.BigDecimal decimal3) {
        this.decimal3 = decimal3;
    }

    public java.util.Date getTimestamp1() {
        return timestamp1;
    }

    public void setTimestamp1(java.util.Date timestamp1) {
        this.timestamp1 = timestamp1;
    }

    public java.util.Date getTimestamp2() {
        return timestamp2;
    }

    public void setTimestamp2(java.util.Date timestamp2) {
        this.timestamp2 = timestamp2;
    }

    public java.util.Date getTimestamp3() {
        return timestamp3;
    }

    public void setTimestamp3(java.util.Date timestamp3) {
        this.timestamp3 = timestamp3;
    }

    public java.util.Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(java.util.Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public java.util.Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(java.util.Date gmtModified) {
        this.gmtModified = gmtModified;
    }

}
