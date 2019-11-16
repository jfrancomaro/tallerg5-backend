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

import edu.moduloalumno.entity.AlumnoProgramaBeneficio;
import edu.moduloalumno.service.IAlumnoProgramaBeneficioService;

@RestController
@RequestMapping("/alumnos-programas-beneficios")
public class AlumnoProgramaBeneficioController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IAlumnoProgramaBeneficioService service;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoProgramaBeneficio>> getAllAlumnoProgramaBeneficio() {
		logger.info("> getAllAlumnoProgramaBeneficio [AlumnoProgramaBeneficio]");

		List<AlumnoProgramaBeneficio> list = null;
		try {
			list = service.getAllAlumnoProgramaBeneficio();

			if (list == null) {
				list = new ArrayList<AlumnoProgramaBeneficio>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoProgramaBeneficio>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAllAumnoProgramaTramite [AlumnoProgramaTramite]");
		return new ResponseEntity<List<AlumnoProgramaBeneficio>>(list, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/leer/codigo-alumno/{codAlumno}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoProgramaBeneficio>> getAlumnoProgramaBeneficioByCodAlumno(@PathVariable("codAlumno") String codAlumno) {
		logger.info("> getAlumnoProgramaBeneficioByCodAlumno [AlumnoProgramaBeneficio]");

		List<AlumnoProgramaBeneficio> list = null;
		try {
			list = service.getAlumnoProgramaBeneficioIdByCodAlumno(codAlumno);

			if (list == null) {
				list = new ArrayList<AlumnoProgramaBeneficio>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoProgramaBeneficio>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoProgramaBeneficioByCodAlumno [AlumnoProgramaBeneficio]");
		return new ResponseEntity<List<AlumnoProgramaBeneficio>>(list, HttpStatus.OK);
	}
	
	
	
}
