package com.cibertec.laboratorio1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.laboratorio1.model.Pharmacy;
import com.cibertec.laboratorio1.repository.PharmacyRepository;
import com.cibertec.laboratorio1.service.PharmacyService;

@Service
public class PharmacyServiceImpl implements PharmacyService {
	
	@Autowired
	PharmacyRepository pharmacyRepo;

	@Override
	public List<Pharmacy> list() {
		return pharmacyRepo.findAll();
	}

	@Override
	public Pharmacy add(Pharmacy p) {
		return pharmacyRepo.save(p);
	}

	@Override
	public Pharmacy update(Pharmacy p) {
		return pharmacyRepo.save(p);
	}

	@Override
	public void delete(int id) {
		pharmacyRepo.deleteById(id);
	}

}
