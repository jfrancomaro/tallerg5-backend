package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.ITipoTramiteDAO;
import edu.moduloalumno.entity.TipoTramite;
import edu.moduloalumno.service.ITipoTramiteService;

@Service
public class TipoTramiteServiceImpl implements ITipoTramiteService{

	@Autowired
	private ITipoTramiteDAO tipoTramiteDAO;

	@Override
	public List<TipoTramite> getAllTipoTramite() {
		return tipoTramiteDAO.getAllTipoTramite();
	}

	@Override
	public List<TipoTramite> getTipoTramiteByIdTipoTramite(Integer idTipoTramite) {
		return tipoTramiteDAO.getTipoTramiteByIdTipoTramite(idTipoTramite);
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
