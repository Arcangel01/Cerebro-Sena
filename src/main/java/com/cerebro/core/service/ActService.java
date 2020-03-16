package com.cerebro.core.service;

import java.util.List;

import com.cerebro.core.model.MActividad;

public interface ActService {
	
	// Definimos los metodos que usaremos para el crud

	public List<MActividad>listar();
	public List<MActividad> listarName(String nombres);
	public List<MActividad> listarFechas(String fecha);
	public MActividad listarId(int id);
	public MActividad add(MActividad act);
	public MActividad edit(MActividad act);
	public boolean delete(int id);
	
}
