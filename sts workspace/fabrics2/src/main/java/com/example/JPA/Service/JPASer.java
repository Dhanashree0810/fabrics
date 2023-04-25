package com.example.JPA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JPA.Model.JPAModel;
import com.example.JPA.Repository.JPARepo;
@Service
public class JPASer {

	@Autowired
	JPARepo rep;
	public List<JPAModel> main(){
		return rep.findAll();
	}
	public JPAModel sub (JPAModel ds) {
		return rep.save(ds);
	}
	public void del(int cost)
	{
		rep.deleteById(cost);
	}
	public JPAModel get(int cost) {
		return rep.findById(cost).get();
	}
}
