package edu.moduloalumno.entity;

import java.io.Serializable;

public class Programa implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idPrograma;
    private String nomPrograma;
    private String siglaPrograma;
    private Integer idTipGrado;
    private boolean vigenciaPrograma;
    private Integer nPrioridad;
    
    public Integer getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(Integer idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNomPrograma() {
        return nomPrograma;
    }

    public void setNomPrograma(String nomPrograma) {
        this.nomPrograma = nomPrograma;
    }

    public String getSiglaPrograma() {
        return siglaPrograma;
    }

    public void setSiglaPrograma(String siglaPrograma) {
        this.siglaPrograma = siglaPrograma;
    }

    public boolean getVigenciaPrograma() {
        return vigenciaPrograma;
    }

    public void setVigenciaPrograma(boolean vigenciaPrograma) {
        this.vigenciaPrograma = vigenciaPrograma;
    }

    public Integer getIdTipGrado() {
        return idTipGrado;
    }

    public void setIdTipGrado(Integer idTipGrado) {
        this.idTipGrado = idTipGrado;
    }
    
    public Integer getNPrioridad() {
    	return nPrioridad;
    }
    
    public void setNPrioridad(Integer nPrioridad) {
    	this.nPrioridad = nPrioridad;
    }
    
}
