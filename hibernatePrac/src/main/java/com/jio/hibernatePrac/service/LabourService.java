package com.jio.hibernatePrac.service;

import org.springframework.stereotype.Service;

import com.jio.hibernatePrac.controller.model.Labour;
import com.jio.hibernatePrac.controller.repository.LabourRepository;

@Service
public class LabourService {

	LabourRepository labourRepository;

	public LabourService(LabourRepository labourRepository) {
		this.labourRepository = labourRepository;
	}
	
	
	public void save(Labour labour) {
			labourRepository.save(labour);
	}
	
	public Labour  fetch(int id) {
	return 	labourRepository.fetch(id);
	}
	
	public String update(int id,Labour labour) {
			Labour labour2=	labourRepository.fetch(id);
			if(!labour.equals(labour2)) {
				labour2.setName(labour.getName());
				labour2.setAge(labour.getAge());
				labourRepository.save(labour2);
			return "updated";
			}else {
				return "already Updated";
			}
	}
	
	public String delete(int id) {
		Labour labour=	labourRepository.fetch(id);
		
		if(labour == null) {
			return "user not found";
		}else {
			labourRepository.remove(id);
		return "deleted";
		}
	
	
	}
	
}
