package com.cerebro.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cerebro.core.model.MActividad;
import com.cerebro.core.repository.ActRepo;

@Service
public class AService implements ActService {
	
	// Implementamos los metodos para el crud
	
	@Autowired
	private ActRepo repositorio;

	@Override
	public List<MActividad> listar() {
		
		return repositorio.findAll();
	}

	@Override
	public MActividad listarId(int id) {
		
		return repositorio.findById(id);
	}

	@Override
	public MActividad add(MActividad act) {
		return repositorio.save(act);
	}

	@Override
	public MActividad edit(MActividad act) {
		return repositorio.save(act);
	}

	@Override
	public boolean delete(int id) {
		try {
			MActividad act = repositorio.findById(id);
			repositorio.delete(act);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	@Override
	public List<MActividad> listarName(String nombres) {
		
		return repositorio.findByNombres(nombres);
	}
	
	@Override
	public List<MActividad> listarFechas(String fecha) {
		
		return repositorio.findByFecha(fecha);
	}

}
