package edu.moduloalumno.entity;

import java.io.Serializable;

public class TipoTramite implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idTipoTramite;
	private String  descTipoTramite;
	private String  siglaTipoTramite;
	private Integer idConcepto;
	public Integer getIdTipoTramite() {
		return idTipoTramite;
	}
	public void setIdTipoTramite(Integer idTipoTramite) {
		this.idTipoTramite = idTipoTramite;
	}
	public String getDescTipoTramite() {
		return descTipoTramite;
	}
	public void setDescTipoTramite(String descTipoTramite) {
		this.descTipoTramite = descTipoTramite;
	}
	public String getSiglaTipoTramite() {
		return siglaTipoTramite;	
	}
	public void setSiglaTipoTramite(String siglaTipoTramite) {
		this.siglaTipoTramite = siglaTipoTramite;
	}
	public Integer getIdConcepto() {
		return idConcepto;
	}
	public void setIdConcepto(Integer idConcepto) {
		this.idConcepto = idConcepto;
	}

}
