package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.AlumnoProgramaBeneficio;

public class AlumnoProgramaBeneficioRowMapper implements RowMapper<AlumnoProgramaBeneficio>{

	@Override //
	public AlumnoProgramaBeneficio mapRow(ResultSet rs, int rowNum) throws SQLException {
		AlumnoProgramaBeneficio apb = new AlumnoProgramaBeneficio();
		apb.setCodAlumno(rs.getString("cod_alumno"));
		apb.setIdBeneficio(rs.getInt("id_beneficio"));
		apb.setObservacion(rs.getString("observacion"));
		apb.setBeneficioOtorgado(rs.getInt("beneficio_otorgado"));
		apb.setIdBenefCondicion(rs.getInt("id_benef_condicion"));
		apb.setFecha(rs.getDate("fecha"));
		apb.setAutorizacion(rs.getString("autorizacion"));
		apb.setIdApb(rs.getInt("id_apb"));
		apb.setCriterio(rs.getInt("criterio"));
		return apb;
	}
	
}
