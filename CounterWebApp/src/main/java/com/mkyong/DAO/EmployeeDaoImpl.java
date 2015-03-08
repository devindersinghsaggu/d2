package com.mkyong.DAO;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class EmployeeDaoImpl extends HibernateDaoSupport  implements EmployeeDao {
	
	public EmployeeDaoImpl(SessionFactory sessionfactory){
	    setSessionFactory(sessionfactory);
	}
 
	public EmployeeDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ApplicationContext initializesession()
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring_hibernate_config.xml");
				
				/*StudentDao studentDao = (StudentDao) context.getBean("studentDAO");

				studentDao.addStudent(s);*/
		return context;
	}
/*	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}
   
	public void addCustomer(Employee employee)
	{
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
	}*/

	@Override
	public void addCustomer(Employee employee) {
		// TODO Auto-generated method stub
		
		getHibernateTemplate().saveOrUpdate(employee);
		//getHibernateTemplate().save(employee);
	}
	
}
