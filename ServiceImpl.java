package com.cjc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.Dao.DaoLoginRepository;
import com.cjc.Dao.DaoStudRepository;
import com.cjc.model.Login;
import com.cjc.model.Student;

@Service
public class ServiceImpl implements ServiceI
{

	@Autowired
	private DaoLoginRepository daolr;
	
	@Autowired
	private DaoStudRepository daosr;
	
	@Override
	public int addStudent(Student student) 
	{
		System.out.println("In servvice add Student");
		daosr.save(student);
			return student.getRno();
	}

	@Override
	public Login allData(String uname,String pass) 
	{
		System.out.println("In servvice all data");
		   Login lg= daolr.findByUnameAndPass(uname, pass);
			return lg;
	}

	public Student getSingleStudent(int lid) 
	{
		System.out.println("In servvice get Single data");
		Student s=daosr.findByLoginLid(lid);
		return s;
	}

	
	@Override
	public List<Student> updateStudent(Student s)
	{
			daosr.save(s);
			System.out.println("In servvice update data");
			List<Student> list=daosr.findAll();
			
		     return list;
	}

	@Override
	public List<Student> deleteStudent(int rno) 
	{
		daosr.deleteById(rno);
		List<Student> stu=daosr.findAll();
		return stu;
	}

	@Override
	public List<Student> display() 
	{
	List<Student> list=daosr.findAll();
		return list;
	}

	
}
