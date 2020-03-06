package com.hilo.entities;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hilo.helper.SessionFactoryRegistry;

public class ReviewDao {
	public static void save(List<Reviews> reviewsList) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			for (Reviews reviews : reviewsList) {
				Object id = session.save(reviews);
				System.out.println(id);
			}
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