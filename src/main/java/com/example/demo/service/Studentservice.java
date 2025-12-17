package com.example.demo.service;
import java.util.List;
import java.util.Optimal;
import com.example.demo.entity.Studententity;

public interface StudentService{

    Studententity insertStudententity(Studententity st);
    List<Studententity>getAllStudententity();
    Optional<Studententity>getOneStudent(Long id);
    void deleteStudent(Long id);
}
