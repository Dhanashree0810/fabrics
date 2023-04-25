package com.example.JPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JPA.Model.JPAModel;
@Repository
public interface JPARepo extends JpaRepository<JPAModel , Integer> {

}
