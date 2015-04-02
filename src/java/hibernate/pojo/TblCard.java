package hibernate.pojo;
// Generated Apr 2, 2015 12:31:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TblCard generated by hbm2java
 */
public class TblCard  implements java.io.Serializable {


     private BigDecimal ICardId;
     private TblPlant tblPlant;
     private Set tblVehicleFlights = new HashSet(0);
     private Set tblMappings = new HashSet(0);

    public TblCard() {
    }

	
    public TblCard(BigDecimal ICardId, TblPlant tblPlant) {
        this.ICardId = ICardId;
        this.tblPlant = tblPlant;
    }
    public TblCard(BigDecimal ICardId, TblPlant tblPlant, Set tblVehicleFlights, Set tblMappings) {
       this.ICardId = ICardId;
       this.tblPlant = tblPlant;
       this.tblVehicleFlights = tblVehicleFlights;
       this.tblMappings = tblMappings;
    }
   
    public BigDecimal getICardId() {
        return this.ICardId;
    }
    
    public void setICardId(BigDecimal ICardId) {
        this.ICardId = ICardId;
    }
    public TblPlant getTblPlant() {
        return this.tblPlant;
    }
    
    public void setTblPlant(TblPlant tblPlant) {
        this.tblPlant = tblPlant;
    }
    public Set getTblVehicleFlights() {
        return this.tblVehicleFlights;
    }
    
    public void setTblVehicleFlights(Set tblVehicleFlights) {
        this.tblVehicleFlights = tblVehicleFlights;
    }
    public Set getTblMappings() {
        return this.tblMappings;
    }
    
    public void setTblMappings(Set tblMappings) {
        this.tblMappings = tblMappings;
    }




}


