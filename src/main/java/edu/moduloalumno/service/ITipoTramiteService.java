package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.TipoTramite;

public interface ITipoTramiteService {

	public List<TipoTramite> getAllTipoTramite();

	public List<TipoTramite> getTipoTramiteByIdTipoTramite(Integer idTipoTramite);

	public void addTipoTramite(TipoTramite tipoTramite);

	public void updateTipoTramite(TipoTramite tipoTramite);

	public void deleteTipoTramite(Integer idTipoTramite);
	
}
