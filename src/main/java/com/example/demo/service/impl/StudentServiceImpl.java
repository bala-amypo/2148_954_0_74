package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Studententity;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repo;

    public StudentServiceImpl(StudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public Studententity insertStudententity(Studententity st) {
        return repo.save(st);
    }

    @Override
    public List<Studententity> getAllStudententity() {
        return repo.findAll();
    }

    @Override
    public Optional<Studententity> getOneStudent(Long id) {
        return repo.findById(id);
    }

    @Override
    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }
}

