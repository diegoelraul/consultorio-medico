package net.kielsaenz.consultorio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;
import javax.persistence.NamedQuery;

@Entity
@Table(name = "Distrito")
@NamedQueries( {
		@NamedQuery(name = "Distrito.getDistritoPorId", query = "SELECT d FROM Distrito d WHERE d.departamentoId = :departamentoId AND d.provinciaId = :provinciaId AND d.distritoId = :distritoId ORDER BY d.nombre ASC"),
		@NamedQuery(name = "Distrito.getDistritosPorProvincia", query = "SELECT d FROM Distrito d WHERE d.departamentoId = :departamentoId AND d.provinciaId = :provinciaId ORDER BY d.nombre ASC")})
public class Distrito extends Bean {

	@Column(name = "Departamento_Id")
	private String departamentoId;

	@Column(name = "Provincia_Id")
	private String provinciaId;

	@Id
	@Column(name = "Distrito_Id")
	private String distritoId;

	@Column(name = "Nombre")
	private String nombre;

	public String getDepartamentoId() {
		return departamentoId;
	}

	public void setDepartamentoId(String departamentoId) {
		this.departamentoId = departamentoId;
	}

	public String getProvinciaId() {
		return provinciaId;
	}

	public void setProvinciaId(String provinciaId) {
		this.provinciaId = provinciaId;
	}

	public String getDistritoId() {
		return distritoId;
	}

	public void setDistritoId(String distritoId) {
		this.distritoId = distritoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
