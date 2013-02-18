package com.ashok.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryTemplate {

	private HibernateSessionFactoryTemplate() {
	}

	private final static SessionFactory sessionFactory = new Configuration()
			.configure().buildSessionFactory();

	public static final SessionFactory getSessionFactoryInstance() {
		return sessionFactory;
	}

}
