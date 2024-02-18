package com.cibertec.laboratorio1.model;

import java.time.LocalDate;
import java.sql.Time;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "appointment")
public class Appointment {

	private LocalDate Date;
	private Time time;
	
	@Id
	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patient patient;
	
	@Id
	@ManyToOne
	@JoinColumn(name="doctor_id")
	private Doctor doctor;
	
}
