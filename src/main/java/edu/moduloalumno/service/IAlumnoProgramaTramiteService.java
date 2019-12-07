package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.AlumnoProgramaTramite;

public interface IAlumnoProgramaTramiteService {

	public List<AlumnoProgramaTramite> getAllAlumnoProgramaTramite();
	
	public List<AlumnoProgramaTramite> getAlumnoProgramaTramiteIdByIdApt(Integer idApt);

	public List<AlumnoProgramaTramite> getAlumnoProgramaTramiteIdByCodAlumno(String codAlumno);

	//AlumnoPrograma getAlumnoProgramaById(String codAlumno);
	
	//List<AlumnoPrograma> getAlumnoProgramaByDni(String codAlumno);

	public void addAlumnoProgramaTramite(AlumnoProgramaTramite alumnoProgramaTramite);

	public void updateAlumnoProgramaTramite(AlumnoProgramaTramite alumnoProgramaTramite);

	public void deleteAlumnoProgramaTramite(Integer idApt);
	
}
