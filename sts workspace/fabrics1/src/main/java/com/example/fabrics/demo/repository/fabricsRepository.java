package com.example.fabrics.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fabrics.demo.model.fabrics;

@Repository
public interface fabricsRepository extends JpaRepository<fabrics, Integer>{

	
}
