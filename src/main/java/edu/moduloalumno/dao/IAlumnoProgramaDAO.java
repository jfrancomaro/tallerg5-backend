package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.AlumnoPrograma;

public interface IAlumnoProgramaDAO {

	List<AlumnoPrograma> getAllAlumnoProgramas();
	
	List<AlumnoPrograma> getAlumnoProgramasIdByNombresApellidos( String nombresApellidos);

	List<AlumnoPrograma> getAlumnoProgramasIdByCod(String cod);							//DEV

	List<AlumnoPrograma> getAlumnoProgramasIdByDNI(String dni);							//DEV

	List<AlumnoPrograma> getAlumnoProgramasIdByCodAlumIdProg(String codAlum, Integer idProg);	
	
	List<AlumnoPrograma> getAlumnoProgramasIdByNombresApellidosRestringido( String nombresApellidos);

	AlumnoPrograma getAlumnoProgramaById(String codAlumno);
	
	List<AlumnoPrograma> getAlumnoProgramaByDni(String codAlumno);

	void addAlumnoPrograma(AlumnoPrograma alumnoPrograma);

	void updateAlumnoPrograma(AlumnoPrograma alumnoPrograma);

	void deleteAlumnoPrograma(String codAlumno);

}