package com.cibertec.laboratorio1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.laboratorio1.model.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {

}
