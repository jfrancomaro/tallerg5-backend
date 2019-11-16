package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.AlumnoProgramaBeneficio;

public interface IAlumnoProgramaBeneficioDAO {

	public List<AlumnoProgramaBeneficio> getAllAlumnoProgramaBeneficio();
	
	public List<AlumnoProgramaBeneficio> getAlumnoProgramaBeneficioIdByCodAlumno(String codAlumno);						

	public void addAlumnoProgramaBeneficio(AlumnoProgramaBeneficio alumnoPrograma);

	public void updateAlumnoProgramaBeneficio(AlumnoProgramaBeneficio alumnoPrograma);

	public void deleteAlumnoProgramaBeneficio(String codAlumno);
	
	
}
