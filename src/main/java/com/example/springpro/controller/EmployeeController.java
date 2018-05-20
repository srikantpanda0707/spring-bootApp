package com.example.springpro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.springpro.dto.EmployeeDto;
import com.example.springpro.model.Service.EmployeeServiceImpl;

public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl EmployeeServiceImpl;

	public EmployeeController() {
		System.out.println("employee controller object controller");
	}

	@PostMapping(value = "/save")
	public void saveOrUpdate(@RequestBody EmployeeDto dto) {
		EmployeeServiceImpl.saveOrUpdate(dto);
	}

	@PostMapping(value = "/saveFromView")
	public ModelAndView saveorUpdateView(EmployeeDto dto) {
		EmployeeServiceImpl.saveorUpdateView(dto);
		return new ModelAndView("index");
	}

	@PostMapping(value = "/saveAll")
	public void saveOrUpdateAll(@RequestBody List<EmployeeDto> dto) {
		EmployeeServiceImpl.saveOrUpdateAll(dto);
	}

	@GetMapping(value = "/get")
	public @ResponseBody List<EmployeeDto> getAllEmp() {
		return EmployeeServiceImpl.getAllEmp();
	}

	@GetMapping(value = "/getEmp{id}")
	public @ResponseBody Optional<EmployeeDto> getEmp(@PathVariable("id") int id) {
		Optional<EmployeeDto> dto = EmployeeServiceImpl.getEmpById(id);
		return dto;
	}
}
