package com.mostafa.sna.entity;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.query.Query;

public class MyGenerator implements IdentifierGenerator {
	
	int id;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		try {
			
			Query<?> query = session.createQuery("select max(id) from Student");
			List<?> queryList = query.list();
			
			if (queryList.get(0)==null) {
				id=1;
			} else {
				id= (int) queryList.get(0);
				id=id+1;
			}
			System.out.println("id "+id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return id;
		
	}

}
