package com.cibertec.laboratorio1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.laboratorio1.model.Pharmacy;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Integer> {

}
