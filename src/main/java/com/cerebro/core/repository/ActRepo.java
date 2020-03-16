package com.cerebro.core.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cerebro.core.model.MActividad;


@Repository("repositorioAct")
public interface ActRepo extends JpaRepository<MActividad, Integer> {
	
	public abstract List<MActividad> findByNombres(String nombres);
	
	public abstract List<MActividad> findByFecha(String fecha);
	
	public abstract MActividad findById(int id);
	
	public List<MActividad>findAll();
	
	public MActividad save(MActividad act);
	
	public void delete(MActividad act);
}
