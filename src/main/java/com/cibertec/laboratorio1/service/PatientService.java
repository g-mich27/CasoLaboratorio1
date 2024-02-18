package com.cibertec.laboratorio1.service;

import java.util.List;

import com.cibertec.laboratorio1.model.Patient;
import com.cibertec.laboratorio1.projections.ReportPatientPrescription;

public interface PatientService {

	public List<Patient> list();
	public Patient add(Patient pa);
	public Patient update(Patient pa);
	public void delete(int id);
	
	public List<ReportPatientPrescription> getReportPatientPrescriptions();
}
