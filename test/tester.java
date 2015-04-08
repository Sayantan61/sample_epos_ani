/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hibernate.helper.*;

import hibernate.pojo.*;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import epos.*;


public class tester {     
    
    public static void main(String[] args) {
     
         Do_handler d=new Do_handler();
         TblDo doo=d.get_tuple(10);
// Plant_handler ph=new Plant_handler();
      // ph.delete_from_table(14);//get_tuple(10);
       //display d=new display(a);
       //ph.insert_into_table("jrd", "tata");
      // String str=ph.insert_into_table("dsA", "Cdsds");
      /*Driver_handler d=new Driver_handler();
d.insert_into_table(23, 1, 3455,null, null, null, null, null, null, null, null, "5dfmdkf2");
 d.insert_into_table(23, 1, 66, "sf", null, null, null, null, null, null, null, "7sfdvj");
     // TblDriver tb=d.get_tuple(34);
      // display drt=new display(tb);*/
 //  Process_handler ph=new Process_handler();
   //ph.delete_from_table(2);
  // ph.insert_into_table(1,"jhjhj");
//Vehicle_handler vh=new Vehicle_handler();
        //vh.insert_into_table("abc123", 1, null, null, 12345, null, null, null);
     //Do_handler d=new Do_handler();
     //TblDo doo=d.get_tuple(1);
     ///d.insert_into_table(1, 4, null, null, "F", "U", "c");d.
     //display dksakjs=new display(doo);
  
     /* List emp= ph.run_query("FROM TblPlant WHERE i_plant_id",3);   
        for(Iterator it=emp.iterator();it.hasNext();)
            {
                    TblPlant plant = (TblPlant) it.next();
                    display d=new display(plant);
            }       
  */
     /*Transporter_handler cd=new Transporter_handler();   
         cd.insert_into_table(1, 7, "fdf","dfd","jh",null,null,null,null ); 
         System.out.println(cd);/*/
             
    Card_handler ch=new Card_handler();
        ch.delete_from_table("a600");
        //String cd=ch.insert_into_table("a600",10);
      // System.out.println(cd);
    
       
        
     /*  Epos_handler eph=new Epos_handler();
       eph.insert_into_table(101,1 ,2, "GATE A");
        TblEpos ep=(TblEpos)eph.get_tuple(65);
        display d=new display(ep);
        String str=eph.update_in_table(101, 1, 3, "Gate B");
        String str=eph.delete_from_table(101);
        System.err.println(str);
        eph.insert_into_table(machine_id, plant_id, terminal_id, null)
    

        
        ph.insert_into_table("notankit","raj");
        String s= ph.delete_from_table(8);    */  
       
        System.exit(0x1);
     
    }

}