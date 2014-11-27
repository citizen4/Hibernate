package model;

import hibernate.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by Student on 27.11.2014.
 */
public class UserDAO
{

    /*
    public List<User> findAllUsers()
    {
        List<User> userList;
        Session session = HibernateUtil.getSessionFactory().openSession();
        SQLQuery query = session.createSQLQuery("SELECT * FROM address_tbl");
        userList = query.list();
        session.close();
        return  userList;
    }*/


    public List<User> findAllUsers()
    {
        List<User> userList;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM User");
        userList = query.list();
        session.close();
        return userList;
    }

    public void attatchUser(final User user)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(user);
            tx.commit();
            System.out.println("TX result:" + tx.wasCommitted());
        } catch (HibernateException e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }

    public User findUserById(final long id)
    {
        List<User> userList;
        Session session = HibernateUtil.getSessionFactory().openSession();

        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.idEq(id));

        userList = criteria.list();

        session.close();

        return (userList != null && userList.size() > 0) ? userList.get(0) : new User();
    }


    public List<User> findByExample(final User user)
    {
        List<User> userList;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(User.class);
        Example example = Example.create(user);
        criteria.add(example);

        userList = criteria.list();
        session.close();
        return userList;
    }

    public void deleteUserById(final long id)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            User user = (User) session.load(User.class, id);
            session.delete(user);
            tx.commit();
            System.out.println("TX result:" + tx.wasCommitted());
        } catch (HibernateException e) {
            e.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }


    public User findUserByZipCity(final String zipCode, final String city)
    {
        List<User> userList;
        User exampleUser = new User();
        exampleUser.setZipCode(zipCode);
        exampleUser.setCity(city);

        Session session = HibernateUtil.getSessionFactory().openSession();

        Criteria criteria = session.createCriteria(User.class);
        Example example = Example.create(exampleUser);
        criteria.add(example);
        userList = criteria.list();
        session.close();

        return (userList != null && userList.size() != 0) ? userList.get(0) : new User();
    }

}
