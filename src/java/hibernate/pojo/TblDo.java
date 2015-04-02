package hibernate.pojo;
// Generated Apr 2, 2015 12:31:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TblDo generated by hbm2java
 */
public class TblDo  implements java.io.Serializable {


     private BigDecimal IDoId;
     private TblPlant tblPlant;
     private Date dtIssueDate;
     private Date dtIssueTime;
     private String TConsignee;
     private String TConsigner;
     private String TDeliveryAddress;
     private Set tblMappings = new HashSet(0);

    public TblDo() {
    }

	
    public TblDo(BigDecimal IDoId, TblPlant tblPlant) {
        this.IDoId = IDoId;
        this.tblPlant = tblPlant;
    }
    public TblDo(BigDecimal IDoId, TblPlant tblPlant, Date dtIssueDate, Date dtIssueTime, String TConsignee, String TConsigner, String TDeliveryAddress, Set tblMappings) {
       this.IDoId = IDoId;
       this.tblPlant = tblPlant;
       this.dtIssueDate = dtIssueDate;
       this.dtIssueTime = dtIssueTime;
       this.TConsignee = TConsignee;
       this.TConsigner = TConsigner;
       this.TDeliveryAddress = TDeliveryAddress;
       this.tblMappings = tblMappings;
    }
   
    public BigDecimal getIDoId() {
        return this.IDoId;
    }
    
    public void setIDoId(BigDecimal IDoId) {
        this.IDoId = IDoId;
    }
    public TblPlant getTblPlant() {
        return this.tblPlant;
    }
    
    public void setTblPlant(TblPlant tblPlant) {
        this.tblPlant = tblPlant;
    }
    public Date getDtIssueDate() {
        return this.dtIssueDate;
    }
    
    public void setDtIssueDate(Date dtIssueDate) {
        this.dtIssueDate = dtIssueDate;
    }
    public Date getDtIssueTime() {
        return this.dtIssueTime;
    }
    
    public void setDtIssueTime(Date dtIssueTime) {
        this.dtIssueTime = dtIssueTime;
    }
    public String getTConsignee() {
        return this.TConsignee;
    }
    
    public void setTConsignee(String TConsignee) {
        this.TConsignee = TConsignee;
    }
    public String getTConsigner() {
        return this.TConsigner;
    }
    
    public void setTConsigner(String TConsigner) {
        this.TConsigner = TConsigner;
    }
    public String getTDeliveryAddress() {
        return this.TDeliveryAddress;
    }
    
    public void setTDeliveryAddress(String TDeliveryAddress) {
        this.TDeliveryAddress = TDeliveryAddress;
    }
    public Set getTblMappings() {
        return this.tblMappings;
    }
    
    public void setTblMappings(Set tblMappings) {
        this.tblMappings = tblMappings;
    }




}


