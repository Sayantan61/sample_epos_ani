package hibernate.pojo;
// Generated Apr 17, 2015 9:43:47 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;

/**
 * TblMapping generated by hbm2java
 */
public class TblMapping  implements java.io.Serializable {

@Column(columnDefinition = "serial")
     private BigDecimal ITripId;
     private TblCard tblCard;
     private TblDo tblDo;
     private TblDriver tblDriver;
     private TblLivePath tblLivePath;
     private TblPlant tblPlant;
     private TblProcess tblProcess;
     private TblTransporter tblTransporter;
     private TblVehicle tblVehicle;
     private Date dtCreated;
     private boolean BIsActive;
     private Set tblExceptionses = new HashSet(0);
     private Set tblVehicleFlights = new HashSet(0);

    public TblMapping() {
    }

	
    public TblMapping(BigDecimal ITripId, TblCard tblCard, TblLivePath tblLivePath, TblPlant tblPlant, TblVehicle tblVehicle, boolean BIsActive) {
        this.ITripId = ITripId;
        this.tblCard = tblCard;
        this.tblLivePath = tblLivePath;
        this.tblPlant = tblPlant;
        this.tblVehicle = tblVehicle;
        this.BIsActive = BIsActive;
    }
    public TblMapping(BigDecimal ITripId, TblCard tblCard, TblDo tblDo, TblDriver tblDriver, TblLivePath tblLivePath, TblPlant tblPlant, TblProcess tblProcess, TblTransporter tblTransporter, TblVehicle tblVehicle, Date dtCreated, boolean BIsActive, Set tblExceptionses, Set tblVehicleFlights) {
       this.ITripId = ITripId;
       this.tblCard = tblCard;
       this.tblDo = tblDo;
       this.tblDriver = tblDriver;
       this.tblLivePath = tblLivePath;
       this.tblPlant = tblPlant;
       this.tblProcess = tblProcess;
       this.tblTransporter = tblTransporter;
       this.tblVehicle = tblVehicle;
       this.dtCreated = dtCreated;
       this.BIsActive = BIsActive;
       this.tblExceptionses = tblExceptionses;
       this.tblVehicleFlights = tblVehicleFlights;
    }
   
    public BigDecimal getITripId() {
        return this.ITripId;
    }
    
    public void setITripId(BigDecimal ITripId) {
        this.ITripId = ITripId;
    }
    public TblCard getTblCard() {
        return this.tblCard;
    }
    
    public void setTblCard(TblCard tblCard) {
        this.tblCard = tblCard;
    }
    public TblDo getTblDo() {
        return this.tblDo;
    }
    
    public void setTblDo(TblDo tblDo) {
        this.tblDo = tblDo;
    }
    public TblDriver getTblDriver() {
        return this.tblDriver;
    }
    
    public void setTblDriver(TblDriver tblDriver) {
        this.tblDriver = tblDriver;
    }
    public TblLivePath getTblLivePath() {
        return this.tblLivePath;
    }
    
    public void setTblLivePath(TblLivePath tblLivePath) {
        this.tblLivePath = tblLivePath;
    }
    public TblPlant getTblPlant() {
        return this.tblPlant;
    }
    
    public void setTblPlant(TblPlant tblPlant) {
        this.tblPlant = tblPlant;
    }
    public TblProcess getTblProcess() {
        return this.tblProcess;
    }
    
    public void setTblProcess(TblProcess tblProcess) {
        this.tblProcess = tblProcess;
    }
    public TblTransporter getTblTransporter() {
        return this.tblTransporter;
    }
    
    public void setTblTransporter(TblTransporter tblTransporter) {
        this.tblTransporter = tblTransporter;
    }
    public TblVehicle getTblVehicle() {
        return this.tblVehicle;
    }
    
    public void setTblVehicle(TblVehicle tblVehicle) {
        this.tblVehicle = tblVehicle;
    }
    public Date getDtCreated() {
        return this.dtCreated;
    }
    
    public void setDtCreated(Date dtCreated) {
        this.dtCreated = dtCreated;
    }
    public boolean isBIsActive() {
        return this.BIsActive;
    }
    
    public void setBIsActive(boolean BIsActive) {
        this.BIsActive = BIsActive;
    }
    public Set getTblExceptionses() {
        return this.tblExceptionses;
    }
    
    public void setTblExceptionses(Set tblExceptionses) {
        this.tblExceptionses = tblExceptionses;
    }
    public Set getTblVehicleFlights() {
        return this.tblVehicleFlights;
    }
    
    public void setTblVehicleFlights(Set tblVehicleFlights) {
        this.tblVehicleFlights = tblVehicleFlights;
    }




}


