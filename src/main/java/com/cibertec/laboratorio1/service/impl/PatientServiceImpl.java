package com.cibertec.laboratorio1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.laboratorio1.model.Patient;
import com.cibertec.laboratorio1.projections.ReportPatientPrescription;
import com.cibertec.laboratorio1.repository.PatientRepository;
import com.cibertec.laboratorio1.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepository patientRepo;
	
	@Override
	public List<Patient> list() {
		return patientRepo.findAll();
	}

	@Override
	public Patient add(Patient pa) {
		return patientRepo.save(pa);
	}

	@Override
	public Patient update(Patient pa) {
		return patientRepo.save(pa);
	}

	@Override
	public void delete(int id) {
		patientRepo.deleteById(id);
	}

	@Override
	public List<ReportPatientPrescription> getReportPatientPrescriptions() {
		List<ReportPatientPrescription> list = patientRepo.getReportPatientPrescriptions();
		return list;
	}

}
