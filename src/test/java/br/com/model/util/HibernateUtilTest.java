package br.com.model.util;

import org.hibernate.Session;
import org.junit.Test;

public class HibernateUtilTest 
{
	@Test
	public void toConnect()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.close();
		HibernateUtil.getSessionFactory().close();
	}
}
