package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IAlumnoProgramaTramiteDAO;
import edu.moduloalumno.entity.AlumnoProgramaTramite;
import edu.moduloalumno.rowmapper.AlumnoProgramaTramiteRowMapper;

@Transactional
@Repository
public class AlumnoProgramaTramiteDAOImpl implements IAlumnoProgramaTramiteDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<AlumnoProgramaTramite> getAllAlumnoProgramaTramite() {
		String sql = "SELECT apt.id_apt"
				+ "        , apt.cod_alumno"
				+ "        , apt.id_programa"
				+ "		   , p.nom_programa"
				+ "		   , apt.id_tipotramite"
				+ "		   , apt.id_apb"
				+ "        , apt.n_expediente"
				+ "		   , apt.anio_expediente"
				+ "		   , apt.fecha_expediente"
				+ "        , apt.n_tramite"
				+ "		   , apt.anio_tramite"
				+ "		   , apt.fecha_emision"
				+ "        , apt.usuario_emision"
				+ "		   , apt.n_oficio"
				+ "		   , apt.anio_oficio"
				+ "        , apt.fecha_oficio"
				+ "		   , apt.importe_oficio"
				+ "		   , apt.importe_matricula"
				+ "        , apt.importe_matricula_ad"
				+ "		   , apt.importe_matricula_epg"
				+ "		   , apt.importe_ensenanza"
				+ "        , apt.importe_repitencia"
				+ "		   , apt.importe_otros"
				+ "        , apt.importe_total"
				+ " FROM alumno_programa_tramite apt"
				+ " inner join programa p on p.id_programa = apt.id_programa";
		RowMapper<AlumnoProgramaTramite> rowMapper =  new AlumnoProgramaTramiteRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public List<AlumnoProgramaTramite> getAlumnoProgramaTramiteIdByIdApt(Integer idApt) {
		String sql = "SELECT apt.id_apt"
				+ "        , apt.cod_alumno"
				+ "        , apt.id_programa"
				+ "		   , p.nom_programa"
				+ "		   , apt.id_tipotramite"
				+ "		   , apt.id_apb"
				+ "        , apt.n_expediente"
				+ "		   , apt.anio_expediente"
				+ "		   , apt.fecha_expediente"
				+ "        , apt.n_tramite"
				+ "		   , apt.anio_tramite"
				+ "		   , apt.fecha_emision"
				+ "        , apt.usuario_emision"
				+ "		   , apt.n_oficio"
				+ "		   , apt.anio_oficio"
				+ "        , apt.fecha_oficio"
				+ "		   , apt.importe_oficio"
				+ "		   , apt.importe_matricula"
				+ "        , apt.importe_matricula_ad"
				+ "		   , apt.importe_matricula_epg"
				+ "		   , apt.importe_ensenanza"
				+ "        , apt.importe_repitencia"
				+ "		   , apt.importe_otros"
				+ "        , apt.importe_total"
				+ " FROM alumno_programa_tramite apt "
				+ " inner join programa p on p.id_programa = apt.id_programa "
				+ " WHERE apt.id_apt = ?";
		RowMapper<AlumnoProgramaTramite> rowMapper =  new AlumnoProgramaTramiteRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, idApt);
	}

	@Override
	public List<AlumnoProgramaTramite> getAlumnoProgramaTramiteIdByCodAlumno(String codAlumno) {
		String sql = "SELECT apt.id_apt"
				+ "        , apt.cod_alumno"
				+ "        , apt.id_programa"
				+ "		   , p.nom_programa"
				+ "		   , apt.id_tipotramite"
				+ "		   , apt.id_apb"
				+ "        , apt.n_expediente"
				+ "		   , apt.anio_expediente"
				+ "		   , apt.fecha_expediente"
				+ "        , apt.n_tramite"
				+ "		   , apt.anio_tramite"
				+ "		   , apt.fecha_emision"
				+ "        , apt.usuario_emision"
				+ "		   , apt.n_oficio"
				+ "		   , apt.anio_oficio"
				+ "        , apt.fecha_oficio"
				+ "		   , apt.importe_oficio"
				+ "		   , apt.importe_matricula"
				+ "        , apt.importe_matricula_ad"
				+ "		   , apt.importe_matricula_epg"
				+ "		   , apt.importe_ensenanza"
				+ "        , apt.importe_repitencia"
				+ "		   , apt.importe_otros"
				+ "        , apt.importe_total"
				+ " FROM alumno_programa_tramite apt "
				+ " inner join programa p on p.id_programa = apt.id_programa "
				+ " WHERE apt.cod_alumno = ?";
		RowMapper<AlumnoProgramaTramite> rowMapper =  new AlumnoProgramaTramiteRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, codAlumno);
	}

	/*@Override
	public AlumnoProgramaTramite addAlumnoProgramaTramite(AlumnoProgramaTramite alumnoProgramaTramite) {

		// Add alumnoProgramaTramite
		String sql = "INSERT INTO alumno_programa_tramite("+
				"id_apt, cod_alumno, id_programa, id_tipotramite, id_apb, n_expediente, anio_expediente, fecha_expediente, n_tramite, anio_tramite, fecha_emision, usuario_emision, n_oficio, anio_oficio, fecha_oficio, importe_oficio, importe_matricula, importe_matricula_ad, importe_matricula_epg, importe_ensenanza, importe_repitencia, importe_otros, importe_total)"
				+" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
		jdbcTemplate.update(sql, alumnoProgramaTramite.getIdApt(),alumnoProgramaTramite.getCodAlumno(),alumnoProgramaTramite.getIdPrograma(),alumnoProgramaTramite.getIdTipoTramite(),alumnoProgramaTramite.getIdApb(),alumnoProgramaTramite.getnExpediente()
				,alumnoProgramaTramite.getAnioExpediente(),alumnoProgramaTramite.getFechaExpediente(),alumnoProgramaTramite.getnTramite(),alumnoProgramaTramite.getAnioTramite(),alumnoProgramaTramite.getFechaEmision()
				,alumnoProgramaTramite.getUsuarioEmision(),alumnoProgramaTramite.getnOficio(),alumnoProgramaTramite.getAnioOficio(),alumnoProgramaTramite.getFechaOficio(),alumnoProgramaTramite.getImporteOficio(),alumnoProgramaTramite.getImporteMatricula(), alumnoProgramaTramite.getImporteMatriculaAd()
				,alumnoProgramaTramite.getImporteMatriculaEpg(),alumnoProgramaTramite.getImporteEnsenanza(), alumnoProgramaTramite.getImporteRepitencia(),alumnoProgramaTramite.getImporteOtros(),alumnoProgramaTramite.getImporteTotal());

		// Fetch alumnoProgramaTramite
		sql = "SELECT apt.id_apt"
				+ "        , apt.cod_alumno"
				+ "        , apt.id_programa"
				+ "		   , apt.id_tipotramite"
				+ "		   , apt.id_apb"
				+ "        , apt.n_expediente"
				+ "		   , apt.anio_expediente"
				+ "		   , apt.fecha_expediente"
				+ "        , apt.n_tramite"
				+ "		   , apt.anio_tramite"
				+ "		   , apt.fecha_emision"
				+ "        , apt.usuario_emision"
				+ "		   , apt.n_oficio"
				+ "		   , apt.anio_oficio"
				+ "        , apt.fecha_oficio"
				+ "		   , apt.importe_oficio"
				+ "		   , apt.importe_matricula"
				+ "        , apt.importe_matricula_ad"
				+ "		   , apt.importe_matricula_epg"
				+ "		   , apt.importe_ensenanza"
				+ "        , apt.importe_repitencia"
				+ "		   , apt.importe_otros"
				+ "        , apt.importe_total"
				+ " FROM alumno_programa_tramite apt WHERE apt.id_apt = ?";
		RowMapper<AlumnoProgramaTramite> rowMapper = new BeanPropertyRowMapper<AlumnoProgramaTramite>(
				AlumnoProgramaTramite.class);
		AlumnoProgramaTramite alumnoProgramaTramiteNew = jdbcTemplate.queryForObject(sql, rowMapper,
				alumnoProgramaTramite.getIdApt());
		
		System.out.println("alumnoProgramaTramiteNew" + alumnoProgramaTramiteNew);

		// get alumnoAlumnoPrograma
		return alumnoProgramaTramiteNew;
		
	}*/

	@Override
	public void addAlumnoProgramaTramite(AlumnoProgramaTramite alumnoProgramaTramite) {

		// Add alumnoProgramaTramite
		String sql = "INSERT INTO alumno_programa_tramite("+
				" cod_alumno, id_programa, id_tipotramite, id_apb, n_expediente, anio_expediente, fecha_expediente, n_tramite, anio_tramite, fecha_emision, usuario_emision, n_oficio, anio_oficio, fecha_oficio, importe_oficio, importe_matricula, importe_matricula_ad, importe_matricula_epg, importe_ensenanza, importe_repitencia, importe_otros, importe_total)"
				+" VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
		jdbcTemplate.update(sql,alumnoProgramaTramite.getCodAlumno(),alumnoProgramaTramite.getIdPrograma(),alumnoProgramaTramite.getIdTipoTramite(),alumnoProgramaTramite.getIdApb(),alumnoProgramaTramite.getnExpediente()
				,alumnoProgramaTramite.getAnioExpediente(),alumnoProgramaTramite.getFechaExpediente(),alumnoProgramaTramite.getnTramite(),alumnoProgramaTramite.getAnioTramite(),alumnoProgramaTramite.getFechaEmision()
				,alumnoProgramaTramite.getUsuarioEmision(),alumnoProgramaTramite.getnOficio(),alumnoProgramaTramite.getAnioOficio(),alumnoProgramaTramite.getFechaOficio(),alumnoProgramaTramite.getImporteOficio(),alumnoProgramaTramite.getImporteMatricula(), alumnoProgramaTramite.getImporteMatriculaAd()
				,alumnoProgramaTramite.getImporteMatriculaEpg(),alumnoProgramaTramite.getImporteEnsenanza(), alumnoProgramaTramite.getImporteRepitencia(),alumnoProgramaTramite.getImporteOtros(),alumnoProgramaTramite.getImporteTotal());

		// Fetch alumnoProgramaTramite
		/*sql = "SELECT apt.id_apt FROM alumno_programa_tramite apt WHERE apt.id_apt = ?";
		Integer idApt = jdbcTemplate.queryForObject(sql, Integer.class, alumnoProgramaTramite.getIdApt());
		
		alumnoProgramaTramite.setIdApt(idApt);*/
		
	}
	
	@Override
	public void updateAlumnoProgramaTramite(AlumnoProgramaTramite alumnoProgramaTramite) {
		
		String sql = "UPDATE alumno_programa_tramite "
				+ "   SET    cod_alumno = ?"
				+ "        , id_programa = ?"
				+ "		   , id_tipotramite = ?"
				+ "		   , id_apb = ?"
				+ "        , n_expediente = ?"
				+ "		   , anio_expediente = ?"
				+ "		   , fecha_expediente = ?"
				+ "        , n_tramite = ?"
				+ "		   , anio_tramite = ?"
				+ "		   , fecha_emision = ?"
				+ "        , usuario_emision = ?"
				+ "		   , n_oficio = ?"
				+ "		   , anio_oficio = ?"
				+ "        , fecha_oficio = ?"
				+ "		   , importe_oficio = ?"
				+ "		   , importe_matricula = ?"
				+ "        , importe_matricula_ad = ?"
				+ "		   , importe_matricula_epg = ?"
				+ "		   , importe_ensenanza = ?"
				+ "        , importe_repitencia = ?"
				+ "		   , importe_otros = ?"
				+ "        , importe_total = ?"
				+ " WHERE id_apt = ?";
		jdbcTemplate.update(sql,alumnoProgramaTramite.getCodAlumno(),alumnoProgramaTramite.getIdPrograma(),alumnoProgramaTramite.getIdTipoTramite(),alumnoProgramaTramite.getIdApb(),alumnoProgramaTramite.getnExpediente()
				,alumnoProgramaTramite.getAnioExpediente(),alumnoProgramaTramite.getFechaExpediente(),alumnoProgramaTramite.getnTramite(),alumnoProgramaTramite.getAnioTramite(),alumnoProgramaTramite.getFechaEmision()
				,alumnoProgramaTramite.getUsuarioEmision(),alumnoProgramaTramite.getnOficio(),alumnoProgramaTramite.getAnioOficio(),alumnoProgramaTramite.getFechaOficio(),alumnoProgramaTramite.getImporteOficio(),alumnoProgramaTramite.getImporteMatricula(), alumnoProgramaTramite.getImporteMatriculaAd()
				,alumnoProgramaTramite.getImporteMatriculaEpg(),alumnoProgramaTramite.getImporteEnsenanza(), alumnoProgramaTramite.getImporteRepitencia(),alumnoProgramaTramite.getImporteOtros(),alumnoProgramaTramite.getImporteTotal(), alumnoProgramaTramite.getIdApt());

	}

	@Override
	public void deleteAlumnoProgramaTramite(Integer idApt) {
		String sql = "DELETE FROM alumno_programa_tramite WHERE id_apt = ?";
		jdbcTemplate.update(sql, idApt);
		
	}


}
