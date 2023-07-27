package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Wishlist;

@Repository
public interface Wishrepo extends JpaRepository<Wishlist,Integer>{

}
