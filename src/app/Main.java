package app;

import hibernate.HibernateUtil;
import model.Address;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Main
{

   public static void listAddresses()
   {
      Address address = new Address();
      Session session = HibernateUtil.getSessionFactory().openSession();

      //Transaction tx = session.beginTransaction();
      Query query = session.createQuery("FROM Address");
      List<Address> addresses = query.list();

      if(addresses != null){
         for(Address a: addresses){
            System.out.println("Name: "+a.getFirstName()+" "+a.getLastName());
         }
      }
      //tx.commit();

      session.close();
   }

   public static void main(String[] args)
   {
      listAddresses();

      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         e.printStackTrace();
         System.exit(0);
      }

   }
}
