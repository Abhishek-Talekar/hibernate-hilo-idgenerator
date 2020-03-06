package com.hilo.test;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hilo.entities.Reviews;
import com.hilo.helper.SessionFactoryRegistry;

public class HiloTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;

		Reviews reviews = null;
		boolean flag = false;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
		} finally {
//			if (transaction != null) {
//				if (flag) {
//					transaction.commit();
//				} else {
//					transaction.rollback();
//				}
		}
	}
}
