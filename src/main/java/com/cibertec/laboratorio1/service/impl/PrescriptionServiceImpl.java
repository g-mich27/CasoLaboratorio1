package com.cibertec.laboratorio1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.laboratorio1.model.Prescription;
import com.cibertec.laboratorio1.repository.PrescriptionRepository;
import com.cibertec.laboratorio1.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

	@Autowired
	PrescriptionRepository prescriptionRepo;
	
	@Override
	public List<Prescription> list() {
		return prescriptionRepo.findAll();
	}

	@Override
	public Prescription add(Prescription pr) {
		return prescriptionRepo.save(pr);
	}

	@Override
	public Prescription update(Prescription pr) {
		return prescriptionRepo.save(pr);
	}

	@Override
	public void delete(int id) {
		prescriptionRepo.deleteById(id);
	}

}
