package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.day5.carModel;

public interface carRepository extends JpaRepository<carModel,Integer> {

}
