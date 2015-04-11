/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ani
 */
import hibernate.helper.*;

import hibernate.pojo.*;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class tester2 {
    public static void main(String[] args)
    {
        Plant_handler ph=new Plant_handler(); //Plant_Ops();
        String t_plant_owner="tata";
         //System.out.println ("If you need to 'quote' in Java");
        //System.out.println ("you can use double \" quote");
        String hq[]={"FROM TblPlant WHERE t_plant_owner= :owner AND t_plant_name= :name ORDER BY i_plant_id DESC","owner","tata","name","JRD"};
      
            List l=ph.run_query(hq, 5);
                
            
                Iterator it=l.iterator();
                while(it.hasNext())
                {
                TblPlant last_swipe=(TblPlant) it.next();
                display d=new display(last_swipe);
                }
        //String replies with "success" or "failure";
    }
    
}
