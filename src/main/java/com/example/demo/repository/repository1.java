package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Models1;

@Repository
public interface repository1 extends JpaRepository<Models1, Integer>{

}
