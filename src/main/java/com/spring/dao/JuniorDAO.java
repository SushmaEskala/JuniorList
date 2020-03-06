package com.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.domain.Junior;

@Transactional
@Repository
public class JuniorDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public List<Junior> getJuniorList() {
		Session session = sessionFactory.getCurrentSession();
		 Query query = session.createSQLQuery(
				"select first_name,last_name,email,department,batch,date_of_birth from junior");
		List<Junior> rows = query.list();
		
		return rows;

	}

}
