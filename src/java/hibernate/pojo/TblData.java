package hibernate.pojo;
// Generated Apr 7, 2015 9:32:40 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * TblData generated by hbm2java
 */
public class TblData  implements java.io.Serializable {


     private BigDecimal IDataId;
     private String eposData;
     private boolean seen;

    public TblData() {
    }

    public TblData(BigDecimal IDataId, String eposData, boolean seen) {
       this.IDataId = IDataId;
       this.eposData = eposData;
       this.seen = seen;
    }
   
    public BigDecimal getIDataId() {
        return this.IDataId;
    }
    
    public void setIDataId(BigDecimal IDataId) {
        this.IDataId = IDataId;
    }
    public String getEposData() {
        return this.eposData;
    }
    
    public void setEposData(String eposData) {
        this.eposData = eposData;
    }
    public boolean isSeen() {
        return this.seen;
    }
    
    public void setSeen(boolean seen) {
        this.seen = seen;
    }




}

