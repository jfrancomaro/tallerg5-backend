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

import edu.moduloalumno.entity.AlumnoProgramaTramite;
import edu.moduloalumno.service.IAlumnoProgramaTramiteService;

@RestController
@RequestMapping("/alumnos-programas-tramites")
public class AlumnoProgramaTramiteController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IAlumnoProgramaTramiteService service;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoProgramaTramite>> getAllAlumnoProgramaTramite() {
		logger.info("> getAllAlumnoProgramaTramite [AlumnoProgramaTramite]");

		List<AlumnoProgramaTramite> list = null;
		try {
			list = service.getAllAlumnoProgramaTramite();

			if (list == null) {
				list = new ArrayList<AlumnoProgramaTramite>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoProgramaTramite>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAllAumnoProgramaTramite [AlumnoProgramaTramite]");
		return new ResponseEntity<List<AlumnoProgramaTramite>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/leer/id-apt/{idApt}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoProgramaTramite>> getAlumnoProgramaTramiteByIdApt (@PathVariable("idApt") Integer idApt) {
		logger.info("> getAlumnoProgramaTramiteByIdApt [AlumnoProgramaTramite]");

		List<AlumnoProgramaTramite> list = null;
		try {
			list = service.getAlumnoProgramaTramiteIdByIdApt(idApt);

			if (list == null) {
				list = new ArrayList<AlumnoProgramaTramite>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoProgramaTramite>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoProgramaTramiteByIdApt [AlumnoProgramaTramite]");
		return new ResponseEntity<List<AlumnoProgramaTramite>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/leer/codigo-alumno/{codAlumno}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoProgramaTramite>> getAlumnoProgramaTramiteByCodAlumno(@PathVariable("codAlumno") String codAlumno) {
		logger.info("> getAlumnoProgramaTramiteByCodAlumno [AlumnoProgramaTramite]");

		List<AlumnoProgramaTramite> list = null;
		try {
			list = service.getAlumnoProgramaTramiteIdByCodAlumno(codAlumno);

			if (list == null) {
				list = new ArrayList<AlumnoProgramaTramite>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoProgramaTramite>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoProgramaTramiteByCodAlumno [AlumnoProgramaTramite]");
		return new ResponseEntity<List<AlumnoProgramaTramite>>(list, HttpStatus.OK);
	}
	
}
