package com.edu.emp.repository;



import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.edu.emp.dao.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	Employee findByEmployeename(String employeename);

	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value = "update employee set employeesalary=? where employeeid=?",nativeQuery = true)
	public int updateEmployeeSalaryById(float employeesalary, Integer employeeid);

	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value = "update employee set employeesalary=? where employeeemail=?",nativeQuery = true)
	int updateEmployeeSalaryByEmail(float employeesalary, String employeeemail, Integer employeeid);

	Employee findByEmployeeemailOrEmployeephonenumber(String employeeemail, String employeephonenumber);
 
	Employee findByEmployeeemail(String employeeemail);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value = "delete from employee where employeeemail=?",nativeQuery = true)
	void delelteByEmail(String employeeemail);

	

	List<Employee> findByEmployeedateofbirthBetween(Date fdate, Date todate);

	
	
	//@Query(value = "select * from employee where employeedateofbirth between ?1 and ?2",nativeQuery = true)
	//List<Employee> findByEmployeeDate(Date fdate, Date todate);
   
	

	

	

	

}
			