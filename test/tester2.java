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

public class tester2 {
    public static void main(String[] args)
    {
        Plant_Ops ph=new Plant_Ops();
        String str=ph.insert_into_table("JRD","Tata");
        System.out.println("Id is "+str);
        //String replies with "success" or "failure"
    }
    
}
