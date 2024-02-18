package com.cibertec.laboratorio1.service;

import java.util.List;

import com.cibertec.laboratorio1.model.Prescription;

public interface PrescriptionService {

	public List<Prescription> list();
	public Prescription add(Prescription pr);
	public Prescription update(Prescription pr);
	public void delete(int id);
}
