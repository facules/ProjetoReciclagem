package br.com.projetobase.dao.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.projetobase.business.entity.HelloWorld;
import br.com.projetobase.dao.HelloWorldDAO;

@Repository
public class HibernateHelloWorldDAO implements HelloWorldDAO{

	private final SessionFactory factory;

	@Autowired
	public HibernateHelloWorldDAO(SessionFactory factory) {
		this.factory = factory;
	}
	
	@Override
	@Transactional
	public void adicionar(HelloWorld helloWorld) {
		factory.getCurrentSession().save(helloWorld);		
	}
}
