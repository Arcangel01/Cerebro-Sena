package com.cerebro.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACTIVIDAD")
public class MActividad {
	
	// Definimos el modelo que usaremos

	@Id
	@Column
	@GeneratedValue
	private int id;
	
	@Column
	private String hora_inicio;
	 
	@Column
	private String hora_fin;
	
	@Column
	private int t_invertido;
	
	@Column
	private String fecha;
	
	@Column
	private String descripcion;
	
	@Column
	private String nombres;
	
	public MActividad() {}

	public MActividad(int id, String hora_inicio, String hora_fin, int t_invertido, String fecha, String descripcion,
			String nombres) {
		this.id = id;
		this.hora_inicio = hora_inicio;
		this.hora_fin = hora_fin;
		this.t_invertido = t_invertido;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.nombres = nombres;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public String getHora_fin() {
		return hora_fin;
	}

	public void setHora_fin(String hora_fin) {
		this.hora_fin = hora_fin;
	}

	public int getT_invertido() {
		return t_invertido;
	}

	public void setT_invertido(int t_invertido) {
		this.t_invertido = t_invertido;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	
}
