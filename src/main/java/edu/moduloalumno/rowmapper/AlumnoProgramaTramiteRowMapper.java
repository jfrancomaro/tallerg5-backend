package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.AlumnoProgramaTramite;


public class AlumnoProgramaTramiteRowMapper implements RowMapper<AlumnoProgramaTramite> {

	@Override //
	public AlumnoProgramaTramite mapRow(ResultSet rs, int rowNum) throws SQLException {
		AlumnoProgramaTramite apt = new AlumnoProgramaTramite();
		apt.setIdApt(rs.getInt("id_apt"));
		apt.setCodAlumno(rs.getString("cod_alumno"));
		apt.setIdPrograma(rs.getInt("id_programa"));
		apt.setIdTipoTramite(rs.getInt("id_tipotramite"));
		apt.setIdApb(rs.getInt("id_apb"));
		apt.setnExpediente(rs.getString("n_expediente"));
		apt.setAnioExpediente(rs.getString("anio_expediente"));
		apt.setFechaExpediente(rs.getDate("fecha_expediente"));
		apt.setnTramite(rs.getString("n_tramite"));
		apt.setAnioTramite(rs.getString("anio_tramite"));
		apt.setFechaEmision(rs.getDate("fecha_emision"));
		apt.setUsuarioEmision(rs.getString("usuario_emision"));
		apt.setnOficio(rs.getString("n_oficio"));
		apt.setAnioOficio(rs.getString("anio_oficio"));
		apt.setFechaOficio(rs.getDate("fecha_oficio"));
		apt.setImporteOficio(rs.getDouble("importe_oficio"));
		apt.setImporteMatricula(rs.getDouble("importe_matricula"));
		apt.setImporteMatriculaAd(rs.getDouble("importe_matricula_ad"));
		apt.setImporteMatriculaEpg(rs.getDouble("importe_matricula_epg"));
		apt.setImporteEnsenanza(rs.getDouble("importe_ensenanza"));
		apt.setImporteRepitencia(rs.getDouble("importe_repitencia"));
		apt.setImporteOtros(rs.getDouble("importe_otros"));
		apt.setImporteTotal(rs.getDouble("importe_total"));
		return apt;
	}
}
