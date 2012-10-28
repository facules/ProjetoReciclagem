package br.com.projetobase.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import br.com.projetobase.dao.GenericDAO;

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
	public void adicionar(Object entidade) throws Exception {
		// TODO Auto-generated method stub
		 getSession().save(entidade);
	}

	@Override
	public void alterar(Object entidade) throws Exception {
		// TODO Auto-generated method stub
		getSession().update(entidade);
	}

	@Override
	public void deletar(Object entidade) throws Exception {
		// TODO Auto-generated method stub
		getSession().delete(entidade);
	}

	@Override
	public List list() {
		// TODO Auto-generated method stub
		
		return getSession().createCriteria(classe).list();
				
	}

	@Override
	public T buscar(final long id) {
		// TODO Auto-generated method stub
		
		return (T) getSession().load(classe, id);
	}

}
