package com.example.simplecrudapp.dao;

import com.example.simplecrudapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Long>{


}
