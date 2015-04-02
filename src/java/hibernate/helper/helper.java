/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.helper;
import org.hibernate.Session;
import java.math.BigDecimal;
import hibernate.pojo.*;

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

public interface helper {
    
    public  final static boolean FLAG=true;     //true indicates not to replace solid values with null values in update query

   
    
    public void insert_into_table();
    //public void insert_into_table_test();
    
    public  void delete_from_table();
    //public  void delete_from_table_test();
    
    public void update_in_table();
    //public void update_in_table_test();
     
}
