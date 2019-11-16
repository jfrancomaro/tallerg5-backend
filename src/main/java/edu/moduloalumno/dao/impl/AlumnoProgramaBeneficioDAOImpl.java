package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IAlumnoProgramaBeneficioDAO;
import edu.moduloalumno.entity.AlumnoProgramaBeneficio;
import edu.moduloalumno.rowmapper.AlumnoProgramaBeneficioRowMapper;

@Transactional
@Repository
public class AlumnoProgramaBeneficioDAOImpl implements IAlumnoProgramaBeneficioDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<AlumnoProgramaBeneficio> getAllAlumnoProgramaBeneficio() {
		String sql = "SELECT apb.cod_alumno"
				+ "        , apb.id_beneficio"
				+ "		   , apb.observacion"
				+ "		   , apb.beneficio_otorgado"
				+ "        , apb.id_benef_condicion"
				+ "		   , apb.fecha"
				+ "		   , apb.autorizacion"
				+ "        , apb.id_apb"
				+ "		   , apb.criterio"
				+ " FROM alumno_programa_beneficio apb";
		RowMapper<AlumnoProgramaBeneficio> rowMapper =  new AlumnoProgramaBeneficioRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public List<AlumnoProgramaBeneficio> getAlumnoProgramaBeneficioIdByCodAlumno(String codAlumno) {
		String sql = "SELECT apb.cod_alumno"
				+ "        , apb.id_beneficio"
				+ "		   , apb.observacion"
				+ "		   , apb.beneficio_otorgado"
				+ "        , apb.id_benef_condicion"
				+ "		   , apb.fecha"
				+ "		   , apb.autorizacion"
				+ "        , apb.id_apb"
				+ "		   , apb.criterio"
				+ " FROM alumno_programa_beneficio apb WHERE apb.cod_alumno = ?";
		RowMapper<AlumnoProgramaBeneficio> rowMapper =  new AlumnoProgramaBeneficioRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, codAlumno);
	}

	@Override
	public void addAlumnoProgramaBeneficio(AlumnoProgramaBeneficio alumnoPrograma) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAlumnoProgramaBeneficio(AlumnoProgramaBeneficio alumnoPrograma) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAlumnoProgramaBeneficio(String codAlumno) {
		// TODO Auto-generated method stub
		
	}

	
	
}
