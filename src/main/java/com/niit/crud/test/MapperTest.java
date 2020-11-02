package com.niit.crud.test;

import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.crud.bean.Department;
import com.niit.crud.bean.Employee;
import com.niit.crud.dao.DepartmentMapper;
import com.niit.crud.dao.EmployeeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class MapperTest {
	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Test
	public void testMapper() {
		
	departmentMapper.insertSelective(new Department(null, "122"));
		departmentMapper.insertSelective(new Department(null, "144"));
		
	for (int i = 0; i < 10; i++) {
			String uid = UUID.randomUUID().toString().substring(0, 5);
			employeeMapper.insertSelective(new Employee(null, uid, "M", uid+"@niit.com.cn", 1));
		}
		
	}
}
