package com.mkyong.DAO;

import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public interface EmployeeDao {	
	
	public void addCustomer(Employee employee);
	
	ApplicationContext initializesession();

	
}
