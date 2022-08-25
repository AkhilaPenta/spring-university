package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.model1.*;
import com.example.demo.service.*;
@RestController
public class UniversityController{
@Autowired
private UniversityService service;
@PostMapping("/addUniversity")
public University addUniversity(@RequestBody University k) {
return service.saveUniversity(k);
}
@PostMapping("/addUniversities")
public List< University> addUniversities(@RequestBody List<University> m) {
return service.saveUniversity(m);
}
@GetMapping("/University")
public List<University>findAllUniversities(){
	return service.getUniversity();
}
@GetMapping("/University/{Id}")
public University findUniversityById(@PathVariable int Id){
	return service.getUniversityById(Id);
}
@GetMapping("/University/{Name}")
public University findUniversityByName(@PathVariable String name){
	return service.getUniversityByName(name);
}
@PostMapping("/Update")
public University UpdateUniversity(@RequestBody University k){
	return service.UpdateUniversity(k);
}
@GetMapping("/Delete/{Id}")
public String deleteUniversity(@PathVariable int Id){
	return service.deleteUniversity(Id);
}
}
