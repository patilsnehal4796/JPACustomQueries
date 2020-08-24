package com.cjc.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;

@Repository
public interface DaoStudRepository extends JpaRepository<Student,Integer>
{
	public Student findByLoginLid(int lid);
	}

