package com.example.JPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JPA.Model.JPAModel;
import com.example.JPA.Service.JPASer;
@RestController
public class JPAController {

	@Autowired
	JPASer servi;
	@GetMapping("/login")
	public List<JPAModel> main(){
		return servi.main();
	}
	
	@PostMapping("/signin")
	public JPAModel sub(@RequestBody JPAModel ds) {
		return servi.sub(ds);
	}
	
	@PutMapping("/signup")
	public JPAModel dub(@RequestBody JPAModel ds) {
		return servi.sub(ds);
	}
	
	
	@DeleteMapping("/del/{id}")
	public void delete(@PathVariable("id") int cost) {
		servi.del(cost);
	}
	
	@GetMapping("/get/{id}")
	public JPAModel get(@PathVariable("id") int cost) {
		return servi.get(cost);
	}
}
