package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model1.*;
import com.example.demo.repository.UniversityRepository;
@Service
public class UniversityService {
@Autowired
private UniversityRepository repository;
public University saveUniversity(University us) {
	return repository.save(us);
	}
public List<University>saveUniversity(List<University>up){
	return repository.saveAll(up);
}
public List<University>getUniversity(){
	return repository.findAll();
}
public University getUniversityById(int Id) {
	return repository.findById(Id).orElse(null);
}
public University getUniversityByName(String name) {
	return repository.findByName(name);
}
public String deleteUniversity(int Id) {
	repository.deleteById(Id);
	return "University is removed"+Id;
}
public University UpdateUniversity(University k) {
	University es=repository.findById(k.getId()).orElse(null);  es.setName(k.getName());
es.setTotalclgs(k.getTotalclgs());
return repository.save(es);
}
}