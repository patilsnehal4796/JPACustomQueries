package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Login;
import com.cjc.model.Student;
import com.cjc.service.ServiceI;

@RestController
@CrossOrigin("*")
public class HomeController
{
	@Autowired
	private ServiceI serviceI;

	
	@PostMapping("/addstudent")
	public int addStudent(@RequestBody Student student)
	{
		System.out.println("In add Controller");
		System.out.println(student.getLogin().getUname());
		int i=serviceI.addStudent(student);
		return i;
	}
	 
	@GetMapping("/{uname}/{pass}")
	public Student allData(@PathVariable("uname") String uname, @PathVariable("pass") String pass) 
	  {
		Login lg =serviceI.allData(uname, pass);
		System.out.println(uname   +"      "+pass);
		  System.out.println("show all data");
		  if(lg.getUname().equals(uname)&&lg.getPass().equals(pass)){
			  Student st=serviceI.getSingleStudent(lg.getLid());
			  
			  return st;
		  }
		  else {
		   return new Student();
		  }
	}
	
	
	  @GetMapping("/single/{lid}")
	  public Student getSingleStudent(@PathVariable int lid)
	  { 
		  Student s=serviceI.getSingleStudent(lid);
		  return s; 
		 }
	 
	
	@PutMapping("/edit")
	public List<Student> updateStudent(@RequestBody Student student)
	{
		System.out.println("update cotroller");
		List<Student> s=serviceI.updateStudent(student);
		return s;
	}

	@DeleteMapping("/{rno}")
	public List<Student> deleteStudent(@PathVariable int rno) 
	{
		List<Student> list=serviceI.deleteStudent(rno);
		return list;
	}

	@GetMapping("/showa")
	public List<Student> display(@ModelAttribute Student student){
		List<Student> s=serviceI.display();
		return s;
		
	} 
	


}
