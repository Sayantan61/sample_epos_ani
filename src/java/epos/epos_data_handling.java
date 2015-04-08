/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epos;
import  hibernate.pojo.*;
import java.math.BigDecimal;
import java.util.Date;
//import hibernate.helper.Plant_handler;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import hibernate.helper.Epos_handler;
import hibernate.helper.Vehicle_flight_handler;

/**
 *
 * @author ani
 */
public class epos_data_handling implements Runnable{
      private Thread thr;
   private String original_string;
    private String TModelNo;
   private String TDataStatus;
   private String TEvent;
    private String Tid;
    private String Mid;
    private String card_no;
    //Time time_v;
    Date date_time;

    public epos_data_handling(String original_string) {
        this.original_string = original_string;   
    }  
    
    /**
     *
     * @param Str
     */
    public void set_values(String Str) throws ParseException
{
    String values[]=Str.split(",");
    /*for(int i=0;i<8;i++)
    {
            System.out.println(values[i]);
    }*/
    
    TModelNo=values[0];
    TDataStatus=values[1];
    TEvent=values[2];
    Tid=values[3];
    Mid=values[4];
    card_no=values[5];
    Date date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(values[7]+values[6]);
   
}
 
 public void start ()
   {
      //System.out.println("Starting " +  threadName );
      if (thr == null)
      {
         thr = new Thread (this);
         thr.start ();
      }
   }
    
    public static void main(String[] args) throws ParseException 
 { 
           
        
     /* Plant_handler ph=new Plant_handler();
        TblPlant x=ph.get_tuple(2);
        System.out.println("\n"+x.getIPlantId()+"\t"+x.getTPlantName()+"\t"+x.getTPlantOwner());
      */ 
       
}

    @Override
    public void run() {
        
       try {
           set_values(original_string);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            } 
       catch (ParseException ex) 
       {
           Logger.getLogger(epos_data_handling.class.getName()).log(Level.SEVERE, null, ex);
       }
      
       Epos_handler eh=new Epos_handler();
       TblEpos epos_obj=eh.get_tuple(Integer.parseInt(Mid));
       if(epos_obj.getisBBothways()==false)
       {
           Vehicle_flight_handler vfh=new Vehicle_flight_handler();
           //TblVehicleFlight vf_obj=vfh.run_query("", 1);
                 
       }  
       
       
           }


}