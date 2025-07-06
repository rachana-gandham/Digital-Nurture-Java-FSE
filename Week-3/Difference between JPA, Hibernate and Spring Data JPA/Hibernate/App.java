package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        System.out.println("Hibernate example started...");

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            Employee emp1 = new Employee("Raja Shekhar", "HR");
            Employee emp2 = new Employee("Rachana Gandham", "IT");

            session.persist(emp1);
            session.persist(emp2);

            tx.commit();

            System.out.println("Employees saved successfully");

        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        HibernateUtil.getSessionFactory().close();
    }
}

