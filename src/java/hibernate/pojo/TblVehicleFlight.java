package hibernate.pojo;
// Generated Apr 2, 2015 12:31:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * TblVehicleFlight generated by hbm2java
 */
public class TblVehicleFlight  implements java.io.Serializable {


     private BigDecimal IVfid;
     private TblCard tblCard;
     private TblEpos tblEpos;
     private TblMapping tblMapping;
     private BigDecimal IPlantId;
     private Date dtTime;

    public TblVehicleFlight() {
    }

	
    public TblVehicleFlight(BigDecimal IVfid, TblCard tblCard, TblEpos tblEpos, TblMapping tblMapping, BigDecimal IPlantId) {
        this.IVfid = IVfid;
        this.tblCard = tblCard;
        this.tblEpos = tblEpos;
        this.tblMapping = tblMapping;
        this.IPlantId = IPlantId;
    }
    public TblVehicleFlight(BigDecimal IVfid, TblCard tblCard, TblEpos tblEpos, TblMapping tblMapping, BigDecimal IPlantId, Date dtTime) {
       this.IVfid = IVfid;
       this.tblCard = tblCard;
       this.tblEpos = tblEpos;
       this.tblMapping = tblMapping;
       this.IPlantId = IPlantId;
       this.dtTime = dtTime;
    }
   
    public BigDecimal getIVfid() {
        return this.IVfid;
    }
    
    public void setIVfid(BigDecimal IVfid) {
        this.IVfid = IVfid;
    }
    public TblCard getTblCard() {
        return this.tblCard;
    }
    
    public void setTblCard(TblCard tblCard) {
        this.tblCard = tblCard;
    }
    public TblEpos getTblEpos() {
        return this.tblEpos;
    }
    
    public void setTblEpos(TblEpos tblEpos) {
        this.tblEpos = tblEpos;
    }
    public TblMapping getTblMapping() {
        return this.tblMapping;
    }
    
    public void setTblMapping(TblMapping tblMapping) {
        this.tblMapping = tblMapping;
    }
    public BigDecimal getIPlantId() {
        return this.IPlantId;
    }
    
    public void setIPlantId(BigDecimal IPlantId) {
        this.IPlantId = IPlantId;
    }
    public Date getDtTime() {
        return this.dtTime;
    }
    
    public void setDtTime(Date dtTime) {
        this.dtTime = dtTime;
    }




}


