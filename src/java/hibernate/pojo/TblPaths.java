package hibernate.pojo;
// Generated Apr 2, 2015 12:31:44 PM by Hibernate Tools 4.3.1


import java.io.Serializable;

/**
 * TblPaths generated by hbm2java
 */
public class TblPaths  implements java.io.Serializable {


     private Serializable IArrPath;
     private TblPlant tblPlant;
     private String TName;

    public TblPaths() {
    }

	
    public TblPaths(Serializable IArrPath, TblPlant tblPlant) {
        this.IArrPath = IArrPath;
        this.tblPlant = tblPlant;
    }
    public TblPaths(Serializable IArrPath, TblPlant tblPlant, String TName) {
       this.IArrPath = IArrPath;
       this.tblPlant = tblPlant;
       this.TName = TName;
    }
   
    public Serializable getIArrPath() {
        return this.IArrPath;
    }
    
    public void setIArrPath(Serializable IArrPath) {
        this.IArrPath = IArrPath;
    }
    public TblPlant getTblPlant() {
        return this.tblPlant;
    }
    
    public void setTblPlant(TblPlant tblPlant) {
        this.tblPlant = tblPlant;
    }
    public String getTName() {
        return this.TName;
    }
    
    public void setTName(String TName) {
        this.TName = TName;
    }




}


