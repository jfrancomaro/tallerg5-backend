package edu.moduloalumno.entity;

import java.io.Serializable;
import java.sql.Date;

public class AlumnoProgramaTramite implements Serializable{
	
    private static final long serialVersionUID = 1L;
    private Integer idApt;
	private String 	codAlumno;
	private Integer idPrograma;
	private String  nomPrograma;
	private String  siglaPrograma;
    private Integer idTipoTramite;
    private String  descTipoTramite;
    private String  siglaTipoTramite;
    private Integer idApb;
    private String  tipo;
    private String  beneficioMax;
    private String 	nExpediente;
    private String 	anioExpediente;
    private Date 	fechaExpediente;
    private String 	nTramite;
    private String 	anioTramite;
    private Date  	fechaEmision;
    private String 	usuarioEmision;
    private String 	nOficio;
    private String 	anioOficio;
    private Date  	fechaOficio;
    private Double 	importeOficio;
    private Double 	importeMatricula;
	private Double 	importeMatriculaAd;
    private Double 	importeMatriculaEpg;
    private Double 	importeEnsenanza;
    private Double 	importeRepitencia;
    private Double 	importeOtros;
    private Double 	importeTotal;

    public Integer getIdApt() {
        return idApt;
    }

    public void setIdApt(Integer idApt) {
        this.idApt = idApt;
    }

    public String getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(String codAlumno) {
        this.codAlumno = codAlumno;
    }

    public Integer getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(Integer idPrograma) {
        this.idPrograma = idPrograma;
    }

    public Integer getIdTipoTramite() {
        return idTipoTramite;
    }

    public void setIdTipoTramite(Integer idTipoTramite) {
        this.idTipoTramite = idTipoTramite;
    }

    public int getIdApb() {
        return idApb;
    }

    public void setIdApb(int idApb) {
        this.idApb = idApb;
    }

    public String getnExpediente() {
        return nExpediente;
    }

    public void setnExpediente(String nExpediente) {
        this.nExpediente = nExpediente;
    }

    public String getAnioExpediente() {
        return anioExpediente;
    }

    public void setAnioExpediente(String anioExpediente) {
        this.anioExpediente = anioExpediente;
    }

    public Date getFechaExpediente() {
        return fechaExpediente;
    }

    public void setFechaExpediente(Date date) {
        this.fechaExpediente = date;
    }

    public String getnTramite() {
        return nTramite;
    }

    public void setnTramite(String nTramite) {
        this.nTramite = nTramite;
    }

    public String getAnioTramite() {
        return anioTramite;
    }

    public void setAnioTramite(String anioTramite) {
        this.anioTramite = anioTramite;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaOficio() {
        return fechaOficio;
    }

    public void setFechaOficio(Date fechaOficio) {
        this.fechaOficio = fechaOficio;
    }

    public Double getImporteOficio() {
        return importeOficio;
    }

    public void setImporteOficio(Double importeOficio) {
        this.importeOficio = importeOficio;
    }

    public Double getImporteMatricula() {
        return importeMatricula;
    }

    public void setImporteMatricula(Double importeMatricula) {
        this.importeMatricula = importeMatricula;
    }

    public Double getImporteMatriculaAd() {
        return importeMatriculaAd;
    }

    public void setImporteMatriculaAd(Double importeMatriculaAd) {
        this.importeMatriculaAd = importeMatriculaAd;
    }

    public Double getImporteMatriculaEpg() {
        return importeMatriculaEpg;
    }

    public void setImporteMatriculaEpg(Double importeMatriculaEpg) {
        this.importeMatriculaEpg = importeMatriculaEpg;
    }

    public Double getImporteEnsenanza() {
        return importeEnsenanza;
    }

    public void setImporteEnsenanza(Double importeEnsenanza) {
        this.importeEnsenanza = importeEnsenanza;
    }

    public Double getImporteRepitencia() {
        return importeRepitencia;
    }

    public void setImporteRepitencia(Double importeRepitencia) {
        this.importeRepitencia = importeRepitencia;
    }

    public Double getImporteOtros() {
        return importeOtros;
    }

    public void setImporteOtros(Double importeOtros) {
        this.importeOtros = importeOtros;
    }

    public Double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(Double importeTotal) {
        this.importeTotal = importeTotal;
    }

	public String getUsuarioEmision() {
		return usuarioEmision;
	}

	public void setUsuarioEmision(String usuarioEmision) {
		this.usuarioEmision = usuarioEmision;
	}

	public String getnOficio() {
		return nOficio;
	}

	public void setnOficio(String nOficio) {
		this.nOficio = nOficio;
	}

	public String getAnioOficio() {
		return anioOficio;
	}

	public void setAnioOficio(String anioOficio) {
		this.anioOficio = anioOficio;
	}

	public String getNomPrograma() {
		return nomPrograma;
	}

	public void setNomPrograma(String nomPrograma) {
		this.nomPrograma = nomPrograma;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getBeneficioMax() {
		return beneficioMax;
	}

	public void setBeneficioMax(String beneficioMax) {
		this.beneficioMax = beneficioMax;
	}

	public String getSiglaPrograma() {
		return siglaPrograma;
	}

	public void setSiglaPrograma(String siglaPrograma) {
		this.siglaPrograma = siglaPrograma;
	}

    /*@Override
    public String toString() {
        return "AlumnoProgramaTramiteDAOImpl{" + "idAlumno=" + idApt + ", codAlumno=" + codAlumno + ", idPrograma=" + idPrograma + ", idTipoTramite=" + idTipoTramite + ", idApb=" + idApb + ", nExpediente=" + nExpediente + ", anioExpediente=" + anioExpediente + ", fechaExpediente=" + fechaExpediente + ", nTramite=" + nTramite + ", anioTramite=" + anioTramite + ", fechaEmision=" + fechaEmision + ", fechaOficio=" + fechaOficio + ", importeOficio=" + importeOficio + ", importeMatricula=" + importeMatricula + ", importeMatriculaAd=" + importeMatriculaAd + ", importeMatriculaEpg=" + importeMatriculaEpg + ", importeEnsenanza=" + importeEnsenanza + ", importeRepitencia=" + importeRepitencia + ", importeOtros=" + importeOtros + ", importeTotal=" + importeTotal + '}';
    }*/

	}