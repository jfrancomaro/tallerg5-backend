package edu.moduloalumno.api;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.TipoTramite;
import edu.moduloalumno.service.ITipoTramiteService;

@RestController
@RequestMapping("/tipos-tramites")
public class TipoTramiteController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ITipoTramiteService service;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TipoTramite>> getAllTipoTramite() {
		logger.info("> getAllTipoTramite [TipoTramite]");

		List<TipoTramite> list = null;
		try {
			list = service.getAllTipoTramite();

			if (list == null) {
				list = new ArrayList<TipoTramite>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<TipoTramite>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAllTipoTramite [TipoTramite]");
		return new ResponseEntity<List<TipoTramite>>(list, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/leer/id-tipo-tramite/{idTipoTramite}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TipoTramite>> getTipoTramiteByIdTipoTramite(@PathVariable("idTipoTramite") Integer idTipoTramite) {
		logger.info("> getTipoTramiteByIdTipoTramite [TipoTramite]");

		List<TipoTramite> list = null;
		try {
			list = service.getTipoTramiteByIdTipoTramite(idTipoTramite);

			if (list == null) {
				list = new ArrayList<TipoTramite>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<TipoTramite>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getTipoTramiteByIdTipoTramite [TipoTramite]");
		return new ResponseEntity<List<TipoTramite>>(list, HttpStatus.OK);
	}
	
}
