package app;

import model.User;
import model.UserDAO;

public class Main
{

   public static void printList()
   {
      UserDAO userDAO = new UserDAO();

      for (User user : userDAO.findAllUsers()) {
         System.out.println("Name: " + user.getFirstName() + " " + user.getLastName());
      }

   }

   public static void main(String[] args)
   {
      UserDAO userDAO = new UserDAO();
      //User user = new User();

      //System.out.println(userDAO.findUserById(5));
      System.out.println(userDAO.findUserByZipCity("33333", "Frankfurt"));



      try {
         Thread.sleep(1000);
         System.exit(0);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

   }
}
