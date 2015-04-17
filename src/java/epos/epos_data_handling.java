/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epos;
import hibernate.helper.Data_handler;
import  hibernate.pojo.*;
import java.math.BigDecimal;
import java.util.Date;//import hibernate.helper.Plant_handler;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import hibernate.helper.Epos_handler;
import hibernate.helper.Exceptions_handler;
import hibernate.helper.Mapping_handler;
import hibernate.helper.Vehicle_flight_handler;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author ani
 */
public class epos_data_handling implements Runnable{
     // private Thread thr;
   private String original_string;
    private String TModelNo;
   private String TDataStatus;
   private String TEvent;
    private int Tid;
    private int Mid;
    private String card_no;
    private TblData data;
    //Time time_v;
    Date date_time;
   

    public epos_data_handling(TblData dat) {
        this.data=dat;
    //this.original_string = original_string;   
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
    Tid=Integer.parseInt(values[3]);
    Mid=Integer.parseInt(values[4]);
    card_no=values[5];
    date_time = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(values[7]+values[6]);
   
}
    public void save_this_swipe()
    {
        //save the object
        // to do that we need the trip_id from card_no
        
        Vehicle_flight_handler vfh=new Vehicle_flight_handler();
                    Mapping_handler mh=new Mapping_handler();
                    
                   Session session=hibernate.NewHibernateUtil.getSessionFactory().openSession();
                   Query query=session.createQuery("FROM TblMapping WHERE c_card_id= :id AND b_is_active=true ORDER BY dt_created DESC");
                    query.setParameter("id",card_no);
                  
               List  emp= query.setMaxResults(1).list();
                Iterator it=emp.iterator();
       //if(it.hasNext())
                 
                TblMapping obj=(TblMapping) it.next();
                int trip_id=obj.getITripId().intValueExact();
              
                   
                vfh.insert_into_table(TModelNo, TDataStatus, TEvent, date_time, Mid, card_no,trip_id);
    }
    
    void create_an_exception()
    {          
        //to get the trip_id 
       Mapping_handler mh=new Mapping_handler(); //Vehicle_flight_handler();
        String hql_query[]={"FROM TblMapping WHERE c_card_id= :card AND b_is_active= true","id",card_no};
        List emp=mh.run_query(hql_query, 1,false);
        TblMapping v= (TblMapping) emp.iterator().next();
         
        int trip_id= v.getITripId().intValue();
        int plant_id=v.getTblPlant().getIPlantId().intValue();
        
        //this is dummy data, will be filled in reality by timer function provided by agent
        Date expected_time=Date.from(Instant.EPOCH);
        
        Exceptions_handler eh=new Exceptions_handler();
        eh.insert_into_table(plant_id, trip_id, Mid,expected_time , false, date_time);
       // eh.
    }
    
    @Override
    public void run() {
        
        //original_string=data.getEposData();
       // System.out.println("is it working");
       try {
           original_string=data.getEposData();
           
           set_values(original_string);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            } 
       catch (ParseException ex) 
       {
           Logger.getLogger(epos_data_handling.class.getName()).log(Level.SEVERE, null, ex);
       }
      
       Epos_handler eh=new Epos_handler();
       TblEpos epos_obj=eh.get_tuple(Mid);
       
       if(epos_obj.getisBBothways()==false)
       {
 
               //retrieve the last swipe 
          /* { Session session=hibernate.NewHibernateUtil.getSessionFactory().openSession();
                Query query=session.createQuery("FROM TblVehicleFlight WHERE c_card_id= :id ORDER BY dt_time DESC");
                query.setParameter("id",card_no);
                List emp= query.setMaxResults(1).list();
            }*/
           
           Vehicle_flight_handler vfh=new Vehicle_flight_handler();
           
           String hql_query[]={"FROM TblVehicleFlight WHERE c_card_id= :id ORDER BY dt_time ASC", "id",card_no};
            List emp=vfh.run_query(hql_query,1,false);
        
              
    // List l=vfh.run_query("FROM TblVehicleFlight WHERE c_card_id= :id ORDER BY dt_time ASC", 1);    //ORDER BY dt_time DESC"
                Iterator it=emp.iterator();
                TblVehicleFlight last_swipe=(TblVehicleFlight) it.next();
                
                if(last_swipe.getTblCard().getCCardId().equalsIgnoreCase(card_no)==true)
                {
                    
                     //reject this swipe
                }
                else
                {
                   save_this_swipe();
                }
                
                Data_handler dh=new Data_handler();
                dh.update_in_table(data.getIDataId().intValueExact(), true);                  
                return;

       }
       else
       {
           Session session=hibernate.NewHibernateUtil.getSessionFactory().openSession();
                Query query=session.createQuery("FROM TblVehicleFlight WHERE c_card_id= :id ORDER BY dt_time DESC");
                query.setParameter("id",card_no);
                List emp= query.setMaxResults(2).list();
              
    // List l=vfh.run_query("FROM TblVehicleFlight WHERE c_card_id= :id ORDER BY dt_time ASC", 1);    //ORDER BY dt_time DESC"
                Iterator it=emp.iterator();
                TblVehicleFlight last_swipe=(TblVehicleFlight) it.next();
                
                TblVehicleFlight last_to_last_swipe=(TblVehicleFlight) it.next();
                
                if(last_swipe.getTblCard().getCCardId().equalsIgnoreCase(card_no)==false)
                    {
                    
                     //diferent machine ids represent this is 1st swipe @this machine.
                      //This is in swipe @ this machine, i will save it.
                    save_this_swipe();
                    }
                else
                {
                    //represents this swipe can be out-/out/out+ swipe
                    if (true) 
                        {
                        
                        } 
                    
                    else 
                        {
                        
                        }
                }
       }
              
       
    }


}