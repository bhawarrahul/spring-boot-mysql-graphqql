package com.graphql.mysql.grapghql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.mysql.entity.Student;
import com.graphql.mysql.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentQueryResolver implements GraphQLQueryResolver {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public long getStudentCount() {
        return studentRepository.count();
    }
    public Student getStudent(int id) {
        return studentRepository.findById(id).orElseThrow(null);
    }

}
