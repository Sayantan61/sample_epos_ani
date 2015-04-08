package hibernate.pojo;
// Generated Apr 7, 2015 9:20:06 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TblEpos generated by hbm2java
 */
public class TblEpos  implements java.io.Serializable {


     private BigDecimal IMachineId;
     private TblPlant tblPlant;
     private BigDecimal ITerminalId;
     private BigDecimal IGateNo;
     private String TGatewayName;
     private String TLocation;
     private boolean BBothways;
     private BigDecimal ITimeInBetween;
     private Set tblExceptionses = new HashSet(0);
     private Set tblVehicleFlights = new HashSet(0);
     private Set tblLinksesForITo = new HashSet(0);
     private Set tblLinksesForIFrom = new HashSet(0);

    public TblEpos() {
    }

	
    public TblEpos(BigDecimal IMachineId, BigDecimal ITerminalId, boolean BBothways) {
        this.IMachineId = IMachineId;
        this.ITerminalId = ITerminalId;
        this.BBothways = BBothways;
    }
    public TblEpos(BigDecimal IMachineId, TblPlant tblPlant, BigDecimal ITerminalId, BigDecimal IGateNo, String TGatewayName, String TLocation, boolean BBothways, BigDecimal ITimeInBetween, Set tblExceptionses, Set tblVehicleFlights, Set tblLinksesForITo, Set tblLinksesForIFrom) {
       this.IMachineId = IMachineId;
       this.tblPlant = tblPlant;
       this.ITerminalId = ITerminalId;
       this.IGateNo = IGateNo;
       this.TGatewayName = TGatewayName;
       this.TLocation = TLocation;
       this.BBothways = BBothways;
       this.ITimeInBetween = ITimeInBetween;
       this.tblExceptionses = tblExceptionses;
       this.tblVehicleFlights = tblVehicleFlights;
       this.tblLinksesForITo = tblLinksesForITo;
       this.tblLinksesForIFrom = tblLinksesForIFrom;
    }
   
    public BigDecimal getIMachineId() {
        return this.IMachineId;
    }
    
    public void setIMachineId(BigDecimal IMachineId) {
        this.IMachineId = IMachineId;
    }
    public TblPlant getTblPlant() {
        return this.tblPlant;
    }
    
    public void setTblPlant(TblPlant tblPlant) {
        this.tblPlant = tblPlant;
    }
    public BigDecimal getITerminalId() {
        return this.ITerminalId;
    }
    
    public void setITerminalId(BigDecimal ITerminalId) {
        this.ITerminalId = ITerminalId;
    }
    public BigDecimal getIGateNo() {
        return this.IGateNo;
    }
    
    public void setIGateNo(BigDecimal IGateNo) {
        this.IGateNo = IGateNo;
    }
    public String getTGatewayName() {
        return this.TGatewayName;
    }
    
    public void setTGatewayName(String TGatewayName) {
        this.TGatewayName = TGatewayName;
    }
    public String getTLocation() {
        return this.TLocation;
    }
    
    public void setTLocation(String TLocation) {
        this.TLocation = TLocation;
    }
    public boolean isBBothways() {
        return this.BBothways;
    }
    
    public void setBBothways(boolean BBothways) {
        this.BBothways = BBothways;
    }
    public BigDecimal getITimeInBetween() {
        return this.ITimeInBetween;
    }
    
    public void setITimeInBetween(BigDecimal ITimeInBetween) {
        this.ITimeInBetween = ITimeInBetween;
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
    public  boolean  getisBBothways()
    {
        return this.BBothways;
    }
    
    public void setTblVehicleFlights(Set tblVehicleFlights) {
        this.tblVehicleFlights = tblVehicleFlights;
    }
    public Set getTblLinksesForITo() {
        return this.tblLinksesForITo;
    }
    
    public void setTblLinksesForITo(Set tblLinksesForITo) {
        this.tblLinksesForITo = tblLinksesForITo;
    }
    public Set getTblLinksesForIFrom() {
        return this.tblLinksesForIFrom;
    }
    
    public void setTblLinksesForIFrom(Set tblLinksesForIFrom) {
        this.tblLinksesForIFrom = tblLinksesForIFrom;
    }




}


