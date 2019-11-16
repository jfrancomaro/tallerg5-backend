package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.ITipoTramiteDAO;
import edu.moduloalumno.entity.TipoTramite;
import edu.moduloalumno.rowmapper.TipoTramiteRowMapper;

@Transactional
@Repository
public class TipoTramiteDAOImpl implements ITipoTramiteDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<TipoTramite> getAllTipoTramite() {
		String sql = "SELECT tt.id_tipotramite"
				+ "        , tt.desc_tipotramite"
				+ "		   , tt.sigla_tipotramite"
				+ "		   , tt.id_concepto"
				+ " FROM tipo_tramite tt";
		RowMapper<TipoTramite> rowMapper =  new TipoTramiteRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public List<TipoTramite> getTipoTramiteByIdTipoTramite(Integer idTipoTramite) {
		String sql = "SELECT tt.id_tipotramite"
				+ "        , tt.desc_tipotramite"
				+ "		   , tt.sigla_tipotramite"
				+ "		   , tt.id_concepto"
				+ " FROM tipo_tramite tt WHERE tt.id_tipotramite = ?";
		RowMapper<TipoTramite> rowMapper =  new TipoTramiteRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, idTipoTramite);
	}

	@Override
	public void addTipoTramite(TipoTramite tipoTramite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTipoTramite(TipoTramite tipoTramite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTipoTramite(Integer idTipoTramite) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
