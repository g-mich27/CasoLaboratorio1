package com.cibertec.laboratorio1.projections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportPatientPrescription {

	private Integer patientId;
	private String patientFName;
	private String patientLName;
	private Double prescriptionCost;
}
