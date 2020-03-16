package com.cerebro.core.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cerebro.core.model.MActividad;
import com.cerebro.core.service.AService;
import com.cerebro.core.service.ActService;

@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@RestController
@RequestMapping({"/v1"})
public class ActController {
	
	// Este controlador nos permite tener la comunicacion Http con el cliente Rest
	// En el encontramos los verbos HTTP

	@Autowired
	AService service;
	
	@GetMapping("/obtener")
	public List<MActividad> listar(){
		return service.listar();
	}
	
	@GetMapping("/obtener/{id}")
	public MActividad listarById(@PathVariable("id") int id) {
		return service.listarId(id);
	}
	
	@GetMapping("/user/{nombres}")
	public List<MActividad> listarByName(@PathVariable("nombres") String nombres) {
		return service.listarName(nombres);
	}
	
	@GetMapping("/users/{fecha}")
	public List<MActividad> listarByDate(@PathVariable("fecha") String fecha) {
		return service.listarFechas(fecha);
	}
	
	@PostMapping("/actividad")
	public String agregarActividad(@RequestBody MActividad act) {
		 service.add(act);
		 return "Hola" + act.getNombres() + "registrado";
	}
	
	@PutMapping(path = {"edit/{id}"})
	public MActividad editar(@RequestBody MActividad act, @PathVariable("id") int id) {
		act.setId(id);
		return service.edit(act);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") int id) {
		return service.delete(id);
	}
}
