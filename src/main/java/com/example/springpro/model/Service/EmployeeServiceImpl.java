package com.example.springpro.model.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springpro.dto.EmployeeDto;
import com.example.springpro.model.Dao.IEmployeeDao;

@Service
public class EmployeeServiceImpl {
	@Autowired
	private IEmployeeDao IEmployeeDao;

	public void saveOrUpdate(EmployeeDto dto) {
		IEmployeeDao.save(dto);
	}

	public void saveOrUpdateAll(List<EmployeeDto> dto) {
		IEmployeeDao.saveAll(dto);
	}

	public void saveorUpdateView(EmployeeDto dto) {
		IEmployeeDao.save(dto);
	}

	public Optional<EmployeeDto> getEmpById(int id) {
		Optional<EmployeeDto> dto = IEmployeeDao.findById(id);
		return dto;
	}

	public List<EmployeeDto> getAllEmp() {
		return IEmployeeDao.findAll();
	}

}
