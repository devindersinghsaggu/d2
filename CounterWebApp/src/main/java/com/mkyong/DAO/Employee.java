package com.mkyong.DAO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Jadoo")
public class Employee {

	/*@OneToOne
	public Work work;
	*/
	/*public Work getWork() {
		return work;
	}

	public void setWork(Work work) {
		this.work = work;
	}*/

	
	private int id;

	/*
	 * private Long userId;
	 */
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy=GenerationType.IDENTITY)
	 * 
	 * @Column public Long getUserID(){ return userId; }
	 * 
	 * public void setUserId(Long userId) { this.userId = userId; }
	 */

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String name;
	private String salary;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	public int getId() {
		return id;
	}

	
	
	public Employee(int id, String name, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}

	/*@Override
	public String toString() {
		return "Employee [work=" + work + ", id=" + id + ", name=" + name
				+ ", salary=" + salary + "]";
	}*/

	
	 

}
