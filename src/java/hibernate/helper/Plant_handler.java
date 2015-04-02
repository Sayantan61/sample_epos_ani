/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.helper;

import hibernate.pojo.TblPlant;
import java.math.BigDecimal;
import org.hibernate.Session;
import javax.persistence.Query;
import org.hibernate.Transaction;

/*
    Handles operations of table objects;
  public void insert_into_table(args)                       --inserts data into table
  public void delete_from_table(args)                       --deletes data from table
  public void update_in_table(args)                         --updates data in table 
  
public  final static boolean FLAG=true;     //true indicates not to replace solid values with null values in update query

  public void insert_into_table()                       --inserts test data into table
  public void delete_from_table()                       --deletes test data from table
  public void update_in_table()                         --updates test data in table
*/

public class Plant_handler implements helper{
    private Session session;
     //public  final static boolean FLAG=true;          --inherited from interface
    
    public Plant_handler(){}

    @Override
    public void insert_into_table()
    {
        insert_into_table(20,"ani","aniruddha" );         
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void insert_into_table(int id,String name,String owner)
  {
        
        session=hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
        org.hibernate.Transaction tx = null;
        try
        {
           // org.hibernate.Transaction tx=session.beginTransaction();
            tx=session.beginTransaction();
            hibernate.pojo.TblPlant plant= new hibernate.pojo.TblPlant();  //(new BigDecimal(3), "babu", "kochu");
           plant.setIPlantId(new BigDecimal(id));
            plant.setTPlantName(name);
            plant.setTPlantOwner(owner);
            
            session.save(plant);
            tx.commit();
        }
        catch(Exception e)
        {
             if (tx != null) {
                tx.rollback();
            e.printStackTrace();
        }
        }
        finally
        {
            session.close();
        }
        
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

     @Override
    public void delete_from_table() {
        
         delete_from_table(5);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void delete_from_table(int id) {
    session=hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
        org.hibernate.Transaction tx = null;
        try
        {
           // org.hibernate.Transaction tx=session.beginTransaction();
            tx=session.beginTransaction();
            TblPlant plant= new TblPlant();  //(new BigDecimal(3), "babu", "kochu");
           plant.setIPlantId(new BigDecimal(id));
            //plant.setTPlantName("ja khusi");
            //plant.setTPlantOwner("ami");          
            session.delete(plant);
            tx.commit();
        }
        catch(Exception e)
        {
             if (tx != null) {
                tx.rollback();
            e.printStackTrace();
        }
        }
        finally
        {
            session.close();
        }    
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
TblPlant get_tuple(int id)   //, String &name, String &owner)
{
    session=hibernate.NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx = null;
    TblPlant plant = null;
        try
        {
           // org.hibernate.Transaction tx=session.beginTransaction();
            tx=session.beginTransaction();
             plant=(TblPlant) session.get(TblPlant.class ,new BigDecimal(id));
        }
         catch(Exception e)
        {
             if (tx != null) {
                tx.rollback();
            e.printStackTrace();
        }
        }
        finally
        {
            session.close();
             return plant;
        }      
}

    
    @Override
    public void update_in_table() {
        
       update_in_table(2,null ,"btr");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   /*
            if new parameters contain null value, then the previous value of that particular fiels will be retained
    */
    public void update_in_table(int id,String name,String owner) {
        
       session=hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
        org.hibernate.Transaction tx = null;
        try
        {
           // org.hibernate.Transaction tx=session.beginTransaction();
            
     TblPlant plant=(TblPlant) session.get(TblPlant.class ,new BigDecimal(id));
      if(FLAG==true)
      {
         if(name!=plant.getTPlantName() || owner!=plant.getTPlantOwner())
        {   
              if(name == null || name.isEmpty())  name=plant.getTPlantName();
              if(owner==null || owner.isEmpty())  owner=plant.getTPlantOwner();
        }
      }
                 
        tx=session.beginTransaction();
          
           plant.setTPlantName(name);  
           plant.setTPlantOwner(owner);    
        // session.update(plant);
       //  session.flush();
            tx.commit();
        }
        catch(Exception e)
        {
             if (tx != null) {
                tx.rollback();
            e.printStackTrace();
        }
        }
        finally
        {
            session.close();
        }
    }

    
     
}
