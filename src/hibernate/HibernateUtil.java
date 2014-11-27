package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.annotationfactory.AnnotationFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class HibernateUtil
{

   private static SessionFactory sessionFactory;

     static {
    	Configuration configuration = new Configuration().configure();
    	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        sessionFactory = configuration.buildSessionFactory(builder.build());
     }


    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }



   /*
   private static HibernateUtil instance = null;
   private static SessionFactory sessionFactory;
   private static final ThreadLocal<Session> session = new ThreadLocal<>();
   private Session currentSession = null;
   private static ServiceRegistry serviceRegistry;

   public static HibernateUtil getInstance()
   {
      if (instance == null) {
         instance = new HibernateUtil();
      }
      return instance;
   }

   public void createHibernateSession()
   {
      try {
         Configuration conf = new Configuration().configure();
         serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
         sessionFactory = conf.buildSessionFactory(serviceRegistry);
      } catch (Throwable ex) {
         System.err.println("Initial SessionFactory creation failed." + ex);
         throw new ExceptionInInitializerError(ex);
      }

      currentSession = (Session) session.get();
      if (currentSession == null) {
         currentSession = sessionFactory.openSession();
         session.set(currentSession);
      }
   }


   public Session currentSession() throws HibernateException
   {
      return this.currentSession;
   }

   public void closeSession() throws HibernateException
   {
      Session s = (Session) session.get();
      session.set(null);
      if (s != null) {
         s.close();
      }
   }

   public SessionFactory getSessionFactory()
   {
      return sessionFactory;
   }*/
}