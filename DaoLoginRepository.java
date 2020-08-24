package com.cjc.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Login;
import com.cjc.model.Student;

@Repository
public interface DaoLoginRepository extends JpaRepository<Login,Integer> 
{

	public Login findByUnameAndPass(String uname, String pass);



	
	
}
