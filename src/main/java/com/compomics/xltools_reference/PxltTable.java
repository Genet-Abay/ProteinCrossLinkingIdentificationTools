/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compomics.xltools_reference;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Genet
 */
@Entity
@Table(name = "pxlt_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PxltTable.findAll", query = "SELECT p FROM PxltTable p")
    , @NamedQuery(name = "PxltTable.findByPmid", query = "SELECT p FROM PxltTable p WHERE p.pmid = :pmid")
    , @NamedQuery(name = "PxltTable.findByToolName", query = "SELECT p FROM PxltTable p WHERE p.toolName = :toolName")
    , @NamedQuery(name = "PxltTable.findByToolType", query = "SELECT p FROM PxltTable p WHERE p.toolType = :toolType")
    , @NamedQuery(name = "PxltTable.findByInterface1", query = "SELECT p FROM PxltTable p WHERE p.interface1 = :interface1")
    , @NamedQuery(name = "PxltTable.findByPublishedYear", query = "SELECT p FROM PxltTable p WHERE p.publishedYear = :publishedYear")
    , @NamedQuery(name = "PxltTable.findByScoringFun", query = "SELECT p FROM PxltTable p WHERE p.scoringFun = :scoringFun")
    , @NamedQuery(name = "PxltTable.findByMSCleavable", query = "SELECT p FROM PxltTable p WHERE p.mSCleavable = :mSCleavable")
    , @NamedQuery(name = "PxltTable.findByLabling", query = "SELECT p FROM PxltTable p WHERE p.labling = :labling")
    , @NamedQuery(name = "PxltTable.findByDecoy", query = "SELECT p FROM PxltTable p WHERE p.decoy = :decoy")
    , @NamedQuery(name = "PxltTable.findByDevLanguage", query = "SELECT p FROM PxltTable p WHERE p.devLanguage = :devLanguage")
    , @NamedQuery(name = "PxltTable.findByAvailability", query = "SELECT p FROM PxltTable p WHERE p.availability = :availability")
    , @NamedQuery(name = "PxltTable.findByWebAddress", query = "SELECT p FROM PxltTable p WHERE p.webAddress = :webAddress")})
public class PxltTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PMID")
    private String pmid;
    @Size(max = 50)
    @Column(name = "Tool_Name")
    private String toolName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Tool_Type")
    private String toolType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Interface")
    private String interface1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PublishedYear")
    private String publishedYear;
    @Size(max = 100)
    @Column(name = "ScoringFun")
    private String scoringFun;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "MSCleavable")
    private String mSCleavable;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Labling")
    private String labling;
    @Size(max = 50)
    @Column(name = "Decoy")
    private String decoy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Dev_Language")
    private String devLanguage;
    @Size(max = 50)
    @Column(name = "Availability")
    private String availability;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Web_Address")
    private String webAddress;

    public PxltTable() {
    }

    public PxltTable(String pmid) {
        this.pmid = pmid;
    }

    public PxltTable(String pmid, String toolType, String interface1, String publishedYear, String mSCleavable, String labling, String devLanguage, String webAddress) {
        this.pmid = pmid;
        this.toolType = toolType;
        this.interface1 = interface1;
        this.publishedYear = publishedYear;
        this.mSCleavable = mSCleavable;
        this.labling = labling;
        this.devLanguage = devLanguage;
        this.webAddress = webAddress;
    }

    public String getPmid() {
        return pmid;
    }

    public void setPmid(String pmid) {
        this.pmid = pmid;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public String getToolType() {
        return toolType;
    }

    public void setToolType(String toolType) {
        this.toolType = toolType;
    }

    public String getInterface1() {
        return interface1;
    }

    public void setInterface1(String interface1) {
        this.interface1 = interface1;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getScoringFun() {
        return scoringFun;
    }

    public void setScoringFun(String scoringFun) {
        this.scoringFun = scoringFun;
    }

    public String getMSCleavable() {
        return mSCleavable;
    }

    public void setMSCleavable(String mSCleavable) {
        this.mSCleavable = mSCleavable;
    }

    public String getLabling() {
        return labling;
    }

    public void setLabling(String labling) {
        this.labling = labling;
    }

    public String getDecoy() {
        return decoy;
    }

    public void setDecoy(String decoy) {
        this.decoy = decoy;
    }

    public String getDevLanguage() {
        return devLanguage;
    }

    public void setDevLanguage(String devLanguage) {
        this.devLanguage = devLanguage;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pmid != null ? pmid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PxltTable)) {
            return false;
        }
        PxltTable other = (PxltTable) object;
        if ((this.pmid == null && other.pmid != null) || (this.pmid != null && !this.pmid.equals(other.pmid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.compomics.xltools_reference.PxltTable[ pmid=" + pmid + " ]";
    }
    
}
