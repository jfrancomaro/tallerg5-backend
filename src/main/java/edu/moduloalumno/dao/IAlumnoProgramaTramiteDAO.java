package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.AlumnoProgramaTramite;

public interface IAlumnoProgramaTramiteDAO {

	public List<AlumnoProgramaTramite> getAllAlumnoProgramaTramite();
	
	public List<AlumnoProgramaTramite> getAlumnoProgramaTramiteIdByIdApt(Integer idApt);

	public List<AlumnoProgramaTramite> getAlumnoProgramaTramiteIdByCodAlumno(String codAlumno);

	public void addAlumnoProgramaTramite(AlumnoProgramaTramite alumnoProgramaTramite);

	public void updateAlumnoProgramaTramite(AlumnoProgramaTramite alumnoProgramaTramite);

	public void deleteAlumnoProgramaTramite(String codAlumno);

}