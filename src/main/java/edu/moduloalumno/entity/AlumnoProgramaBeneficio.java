package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;

public class AlumnoProgramaBeneficio implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String	codAlumno;
	private Integer idBeneficio;
	private String 	observacion;
	private Integer beneficioOtorgado;
	private Integer idBenefCondicion;
	private Date 	fecha;
	private String  autorizacion;
	private Integer idApb;
	private Integer criterio;
	private boolean toQuery;
	
	public String getCodAlumno() {
		return codAlumno;
	}
	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}
	public Integer getIdBeneficio() {
		return idBeneficio;
	}
	public void setIdBeneficio(Integer idBeneficio) {
		this.idBeneficio = idBeneficio;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public Integer getBeneficioOtorgado() {
		return beneficioOtorgado;
	}
	public void setBeneficioOtorgado(Integer beneficioOtorgado) {
		this.beneficioOtorgado = beneficioOtorgado;
	}
	public Integer getIdBenefCondicion() {
		return idBenefCondicion;
	}
	public void setIdBenefCondicion(Integer idBenefCondicion) {
		this.idBenefCondicion = idBenefCondicion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getAutorizacion() {
		return autorizacion;
	}
	public void setAutorizacion(String autorizacion) {
		this.autorizacion = autorizacion;
	}
	public Integer getIdApb() {
		return idApb;
	}
	public void setIdApb(Integer idApb) {
		this.idApb = idApb;
	}
	public Integer getCriterio() {
		return criterio;
	}
	public void setCriterio(Integer criterio) {
		this.criterio = criterio;
	}
	public boolean isToQuery() {
		return toQuery;
	}
	public void setToQuery(boolean toQuery) {
		this.toQuery = toQuery;
	}
	
}