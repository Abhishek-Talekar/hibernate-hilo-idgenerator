package com.hilo.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hilo.entities.Reviews;
import com.hilo.helper.SessionFactoryRegistry;

public class HiloTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Reviews reviews = null;
		boolean flag = false;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			reviews = new Reviews();
			reviews.setCategory("Fashion");
			reviews.setProductName("Jacket");
			reviews.setReviewDate(new Date());
			reviews.setReviewName("Product Review");
			Object id = session.save(reviews);
			System.out.println(id);
			System.out.println(reviews);
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			SessionFactoryRegistry.close();
		}
	}
}