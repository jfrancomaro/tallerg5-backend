package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.TipoTramite;

public class TipoTramiteRowMapper implements RowMapper<TipoTramite> {

	@Override
	public TipoTramite mapRow(ResultSet rs, int rowNum) throws SQLException {
		TipoTramite tt = new TipoTramite();
		tt.setIdTipoTramite(rs.getInt("id_tipotramite"));
		tt.setDescTipoTramite(rs.getString("desc_tipotramite"));
		tt.setSiglaTipoTramite(rs.getString("sigla_tipotramite"));
		tt.setIdConcepto(rs.getInt("id_concepto"));
		return tt;
	}
	
	
}
