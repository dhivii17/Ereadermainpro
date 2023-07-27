package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Models2;

@Repository
public interface repository2 extends JpaRepository<Models2, Integer>{

}
