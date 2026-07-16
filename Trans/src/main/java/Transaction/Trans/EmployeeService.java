package Transaction.Trans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service

public class EmployeeService {

	
	@Autowired

	private EmployeeRepository er;

	@Transactional

	public Employee addEmp(Employee emp) throws Exception{

	Employee employeeSaveToDB=this.er.save(emp);
	
	return employeeSaveToDB;

	}


}
