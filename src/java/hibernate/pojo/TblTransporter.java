package hibernate.pojo;
// Generated Apr 2, 2015 12:31:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TblTransporter generated by hbm2java
 */
public class TblTransporter  implements java.io.Serializable {


     private BigDecimal ITransporterId;
     private TblPlant tblPlant;
     private String TTransporterName;
     private String TTransporterMobileNo;
     private String TTransporterAddr;
     private String TTransporterCity;
     private String TTransporterState;
     private String ITransporterPin;
     private String TTransporterEmailId;
     private Set tblMappings = new HashSet(0);
     private Set tblDrivers = new HashSet(0);

    public TblTransporter() {
    }

	
    public TblTransporter(BigDecimal ITransporterId, TblPlant tblPlant) {
        this.ITransporterId = ITransporterId;
        this.tblPlant = tblPlant;
    }
    public TblTransporter(BigDecimal ITransporterId, TblPlant tblPlant, String TTransporterName, String TTransporterMobileNo, String TTransporterAddr, String TTransporterCity, String TTransporterState, String ITransporterPin, String TTransporterEmailId, Set tblMappings, Set tblDrivers) {
       this.ITransporterId = ITransporterId;
       this.tblPlant = tblPlant;
       this.TTransporterName = TTransporterName;
       this.TTransporterMobileNo = TTransporterMobileNo;
       this.TTransporterAddr = TTransporterAddr;
       this.TTransporterCity = TTransporterCity;
       this.TTransporterState = TTransporterState;
       this.ITransporterPin = ITransporterPin;
       this.TTransporterEmailId = TTransporterEmailId;
       this.tblMappings = tblMappings;
       this.tblDrivers = tblDrivers;
    }
   
    public BigDecimal getITransporterId() {
        return this.ITransporterId;
    }
    
    public void setITransporterId(BigDecimal ITransporterId) {
        this.ITransporterId = ITransporterId;
    }
    public TblPlant getTblPlant() {
        return this.tblPlant;
    }
    
    public void setTblPlant(TblPlant tblPlant) {
        this.tblPlant = tblPlant;
    }
    public String getTTransporterName() {
        return this.TTransporterName;
    }
    
    public void setTTransporterName(String TTransporterName) {
        this.TTransporterName = TTransporterName;
    }
    public String getTTransporterMobileNo() {
        return this.TTransporterMobileNo;
    }
    
    public void setTTransporterMobileNo(String TTransporterMobileNo) {
        this.TTransporterMobileNo = TTransporterMobileNo;
    }
    public String getTTransporterAddr() {
        return this.TTransporterAddr;
    }
    
    public void setTTransporterAddr(String TTransporterAddr) {
        this.TTransporterAddr = TTransporterAddr;
    }
    public String getTTransporterCity() {
        return this.TTransporterCity;
    }
    
    public void setTTransporterCity(String TTransporterCity) {
        this.TTransporterCity = TTransporterCity;
    }
    public String getTTransporterState() {
        return this.TTransporterState;
    }
    
    public void setTTransporterState(String TTransporterState) {
        this.TTransporterState = TTransporterState;
    }
    public String getITransporterPin() {
        return this.ITransporterPin;
    }
    
    public void setITransporterPin(String ITransporterPin) {
        this.ITransporterPin = ITransporterPin;
    }
    public String getTTransporterEmailId() {
        return this.TTransporterEmailId;
    }
    
    public void setTTransporterEmailId(String TTransporterEmailId) {
        this.TTransporterEmailId = TTransporterEmailId;
    }
    public Set getTblMappings() {
        return this.tblMappings;
    }
    
    public void setTblMappings(Set tblMappings) {
        this.tblMappings = tblMappings;
    }
    public Set getTblDrivers() {
        return this.tblDrivers;
    }
    
    public void setTblDrivers(Set tblDrivers) {
        this.tblDrivers = tblDrivers;
    }




}


