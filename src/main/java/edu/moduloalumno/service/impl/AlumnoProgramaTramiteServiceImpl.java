package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IAlumnoProgramaTramiteDAO;
import edu.moduloalumno.entity.AlumnoProgramaTramite;
import edu.moduloalumno.service.IAlumnoProgramaTramiteService;

@Service
public class AlumnoProgramaTramiteServiceImpl implements IAlumnoProgramaTramiteService {

	@Autowired
	private IAlumnoProgramaTramiteDAO alumnoProgramaTramiteDAO;

	@Override
	public List<AlumnoProgramaTramite> getAllAlumnoProgramaTramite() {
		return alumnoProgramaTramiteDAO.getAllAlumnoProgramaTramite();
	}

	@Override
	public List<AlumnoProgramaTramite> getAlumnoProgramaTramiteIdByIdApt(Integer idApt) {
		return alumnoProgramaTramiteDAO.getAlumnoProgramaTramiteIdByIdApt(idApt);
	}

	@Override
	public List<AlumnoProgramaTramite> getAlumnoProgramaTramiteIdByCodAlumno(String codAlumno) {
		return alumnoProgramaTramiteDAO.getAlumnoProgramaTramiteIdByCodAlumno(codAlumno);
	}

	/*@Override
	public void addAlumnoProgramaTramite(AlumnoPrograma alumnoPrograma) {
		// TODO Auto-generated method stub
		
	}*/
	
	
}
