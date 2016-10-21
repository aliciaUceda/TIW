package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public enum ORM {
	INSTANCE;
	
	private final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();


	public Session openSession() {
		return this.sessionFactory.openSession();
	}
}
