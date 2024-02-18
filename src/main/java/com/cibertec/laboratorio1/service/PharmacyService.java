package com.cibertec.laboratorio1.service;

import java.util.List;

import com.cibertec.laboratorio1.model.Pharmacy;

public interface PharmacyService {

	public List<Pharmacy> list();
	public Pharmacy add(Pharmacy p);
	public Pharmacy update(Pharmacy p);
	public void delete(int id);
}
