package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IAlumnoProgramaBeneficioDAO;
import edu.moduloalumno.entity.AlumnoProgramaBeneficio;
import edu.moduloalumno.service.IAlumnoProgramaBeneficioService;

@Service	
public class AlumnoProgramaBeneficioServiceImpl implements IAlumnoProgramaBeneficioService {

	@Autowired
	private IAlumnoProgramaBeneficioDAO alumnoProgramaBeneficioDAO;

	@Override
	public List<AlumnoProgramaBeneficio> getAllAlumnoProgramaBeneficio() {
		return alumnoProgramaBeneficioDAO.getAllAlumnoProgramaBeneficio();
	}

	@Override
	public List<AlumnoProgramaBeneficio> getAlumnoProgramaBeneficioIdByCodAlumno(String codAlumno) {
		return alumnoProgramaBeneficioDAO.getAlumnoProgramaBeneficioIdByCodAlumno(codAlumno);
	}

	@Override
	public void addAlumnoProgramaBeneficio(AlumnoProgramaBeneficio alumnoProgramaBeneficio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAlumnoProgramaBeneficio(AlumnoProgramaBeneficio alumnoProgramaBeneficio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAlumnoProgramaBeneficio(String codAlumno) {
		// TODO Auto-generated method stub
		
	}
	
}
