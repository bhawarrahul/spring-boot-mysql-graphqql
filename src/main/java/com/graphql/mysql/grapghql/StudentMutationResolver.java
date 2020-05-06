package com.graphql.mysql.grapghql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.mysql.entity.Student;
import com.graphql.mysql.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentMutationResolver implements GraphQLMutationResolver {

    @Autowired
    StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
