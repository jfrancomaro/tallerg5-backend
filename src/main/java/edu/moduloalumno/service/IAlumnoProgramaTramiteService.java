package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.AlumnoProgramaTramite;

public interface IAlumnoProgramaTramiteService {

	public List<AlumnoProgramaTramite> getAllAlumnoProgramaTramite();
	
	public List<AlumnoProgramaTramite> getAlumnoProgramaTramiteIdByIdApt(Integer idApt);

	public List<AlumnoProgramaTramite> getAlumnoProgramaTramiteIdByCodAlumno(String codAlumno);

	//AlumnoPrograma getAlumnoProgramaById(String codAlumno);
	
	//List<AlumnoPrograma> getAlumnoProgramaByDni(String codAlumno);

	//public void addAlumnoProgramaTramite(AlumnoPrograma alumnoPrograma);

	//public void updateAlumnoProgramaTramite(AlumnoPrograma alumnoPrograma);

	//public void deleteAlumnoProgramaTramite(String codAlumno);
	
}
