package com.bean;

import java.io.IOException;
import com.dao.StudentInfo;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import javax.persistence.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CurdOperations {
    static Configuration configuration = new Configuration().configure();
    static SessionFactory sessionFactory = configuration.buildSessionFactory();

    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));


    public static void createUser(StudentInfo student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(student);

        transaction.commit();

        session.close();

    }


    public static void SelectUser() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        List<StudentInfo> studentInfoList = new ArrayList<StudentInfo>();

//        Criteria c = c.createCriteria(StudentInfo.class);
//        c.add(Restrictions.gt("price",p));
//        if(studentInfoList.equals("asc")) {
//            c.addOrder(Order.asc(StudentInfo));
//        }else if(studentInfoList.equals("desc")) {
//            c.addOrder(Order.desc(StudentInfo));
//        }
//        c.list();
//        return;

        try {
            Query query = session.createQuery("from StudentInfo");
            studentInfoList = query.getResultList();

            Iterator iterator = studentInfoList.listIterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

    }



    public static void UpdateUser() throws IOException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        System.out.println("Enter id:");
        int id = Integer.parseInt(sc.readLine());
        System.out.println("Enter Updated(name,age,address)");
        //   String change = sc.readLine();

        StudentInfo studentInfo = session.get(StudentInfo.class, id);
        studentInfo.setName(sc.readLine());
        studentInfo.setAge(Integer.parseInt(sc.readLine()));
        studentInfo.setAddress(sc.readLine());

        session.saveOrUpdate(studentInfo);
        transaction.commit();
        session.close();

    }
    public static void DeleteUser() throws IOException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        System.out.println("Enter ID:");
        int id = Integer.parseInt(sc.readLine());

        StudentInfo studentInfo = session.get(StudentInfo.class,id);

        session.delete(studentInfo);

        transaction.commit();

        session.close();

    }
    public static List<StudentInfo> fetchByRestriction(int age){
        Session session = configuration.buildSessionFactory().openSession();
        Criteria criteria = session.createCriteria(StudentInfo.class);
        criteria.add(Restrictions.gt("age",age));

        return criteria.list();
    }

    public static List<StudentInfo> fetchByOrder(String order,String pn) {
        Session session = configuration.buildSessionFactory().openSession();
        Criteria criteria = session.createCriteria(StudentInfo.class);

        if(order.equalsIgnoreCase("asc")){
            criteria.addOrder(Order.asc(pn));
        } else if (order.equalsIgnoreCase("desc")) {
            criteria.addOrder(Order.desc(pn));
        }

        return criteria.list();
    }

    public static void singleprojection() throws IOException {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        System.out.print("Enter property name to fetch records: ");
        String propertyName = sc.readLine();

        Criteria criteria = session.createCriteria(StudentInfo.class);
        criteria.setProjection(Projections.property(propertyName));

        List<Object> result = criteria.list();

        for (Object price : result) {
            System.out.println("property Name: " + result);
        }

        tx.commit();
        session.close();
    }

}
