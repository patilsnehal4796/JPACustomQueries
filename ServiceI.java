package com.cjc.service;

import java.util.List;

import com.cjc.model.Login;
import com.cjc.model.Student;

public interface ServiceI 
{
    int addStudent(Student student);
    Login allData(String uname,String pass);
    List<Student> display();
    Student getSingleStudent(int lid) ;   
    List<Student> updateStudent(Student s);
    List<Student> deleteStudent(int rno);
}
