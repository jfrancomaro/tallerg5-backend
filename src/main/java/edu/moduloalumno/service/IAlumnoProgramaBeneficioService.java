package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.AlumnoProgramaBeneficio;

public interface IAlumnoProgramaBeneficioService {

	public List<AlumnoProgramaBeneficio> getAllAlumnoProgramaBeneficio();

	public List<AlumnoProgramaBeneficio> getAlumnoProgramaBeneficioIdByCodAlumno(String codAlumno);

	public void addAlumnoProgramaBeneficio(AlumnoProgramaBeneficio alumnoProgramaBeneficio);

	public void updateAlumnoProgramaBeneficio(AlumnoProgramaBeneficio alumnoProgramaBeneficio);

	public void deleteAlumnoProgramaBeneficio(String codAlumno);
	
}
