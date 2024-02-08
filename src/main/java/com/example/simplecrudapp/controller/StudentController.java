package com.example.simplecrudapp.controller;

import com.example.simplecrudapp.dao.StudentDao;
import com.example.simplecrudapp.dto.StudentDTO;
import com.example.simplecrudapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentDao studentDao;

    @GetMapping("/students/{id}")
    public StudentDTO getStudent(@PathVariable long id){
        Optional<Student>optionalStudent = studentDao.findById(id);
        StudentDTO studentDTO = null;
        if(optionalStudent.isEmpty()){
            return studentDTO;
        }
        studentDTO = new StudentDTO();
        studentDTO.setId(optionalStudent.get().getId());
        studentDTO.setName(optionalStudent.get().getName());
        studentDTO.setEmail(optionalStudent.get().getEmail());

        return studentDTO;
    }

}
