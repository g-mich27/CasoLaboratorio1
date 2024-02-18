package com.cibertec.laboratorio1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.laboratorio1.model.Patient;
import com.cibertec.laboratorio1.projections.ReportPatientPrescription;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

	@Query("SELECT new com.cibertec.laboratorio1.projections.ReportPatientPrescription("
	        + "p.patientId, "
	        + "p.patientFName, "
	        + "p.patientLName, "
	        + "pr.prescriptionCost  )"
	        + "FROM Patient p "
	        + "INNER JOIN Prescription pr "
	        + "ON p.patientId = pr.patient.patientId")
	public List<ReportPatientPrescription> getReportPatientPrescriptions();
}
