package com.example.demo.service.Impl;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;

@Service
public class StudentServiceImple
implements StudentService{
    private final Map<Long,Student>
    store=new HashMap<>();
    private long counter=1;

    @Override
    public class Student
    insertStudent(Student st){
        st.setId(counter++);
        store.put(st.getId(),st);
        return st;
    }
    @Override
    public List<Student>getAllStudents(){}
    }
}