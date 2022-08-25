package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model1.University;
public interface UniversityRepository extends JpaRepository<University,Integer>{
	University findByName(String name);
}