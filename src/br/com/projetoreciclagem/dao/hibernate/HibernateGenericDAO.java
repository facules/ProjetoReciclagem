package br.com.projetoreciclagem.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import br.com.projetoreciclagem.dao.GenericDAO;

public class HibernateGenericDAO<T> implements GenericDAO<T> {
	
	private final SessionFactory sessionFactory;
	private final Class <T> classe;
	public HibernateGenericDAO(final Class<T> classe, final SessionFactory sessionfactory){
		this.sessionFactory=sessionfactory;
		this.classe= classe;
	}


	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	@Transactional
	public void adicionar(Object entidade) throws Exception {
		// TODO Auto-generated method stub
		 getSession().save(entidade);
	}

	@Override
	@Transactional
	public void alterar(Object entidade) throws Exception {
		// TODO Auto-generated method stub
		getSession().update(entidade);
	}

	@Override
	@Transactional
	public void deletar(Object entidade) throws Exception {
		// TODO Auto-generated method stub
		getSession().delete(entidade);
	}

	@Override
	@Transactional
	public List<T> list() {
		return getSession().createCriteria(classe).list();
	}

	@Override
	@Transactional
	public T buscar(final long id) {
		return (T) getSession().load(classe, id);
	}

}
