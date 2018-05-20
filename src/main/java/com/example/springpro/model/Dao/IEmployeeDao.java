package com.example.springpro.model.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springpro.dto.EmployeeDto;

public interface IEmployeeDao extends JpaRepository<EmployeeDto,Integer> 
{

}
