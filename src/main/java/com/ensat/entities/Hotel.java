package com.ensat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Product entity.
 */
@Entity
public class Hotel {
	
	  	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id_hotel;
	  
	  	private String nombre;
	  	private String nit;
	  	private String direccion;
	  	private Integer estrellas;
	  	private Integer habitaciones_disponibles;
	  	private String telefono;
		public Integer getId_hotel() {
			return id_hotel;
		}
		public void setId_hotel(Integer id_hotel) {
			this.id_hotel = id_hotel;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getNit() {
			return nit;
		}
		public void setNit(String nit) {
			this.nit = nit;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public Integer getEstrellas() {
			return estrellas;
		}
		public void setEstrellas(Integer estrellas) {
			this.estrellas = estrellas;
		}
		public Integer getHabitaciones_disponibles() {
			return habitaciones_disponibles;
		}
		public void setHabitaciones_disponibles(Integer habitaciones_disponibles) {
			this.habitaciones_disponibles = habitaciones_disponibles;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
	  	
	  	
	  	

}
