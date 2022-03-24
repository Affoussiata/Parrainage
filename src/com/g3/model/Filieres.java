package com.g3.model;
// Generated 22 mars 2022, 21:03:36 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Filieres generated by hbm2java
 */
@Entity
@Table(name = "filieres", catalog = "parrainage")
public class Filieres implements java.io.Serializable {

	private int idF;
	private String nomF;
	private String sigle;
	private Set niveauses = new HashSet(0);

	public Filieres() {
	}

	public Filieres(int idF) {
		this.idF = idF;
	}

	public Filieres(int idF, String nomF, String sigle, Set niveauses) {
		this.idF = idF;
		this.nomF = nomF;
		this.sigle = sigle;
		this.niveauses = niveauses;
	}

	@Id

	@Column(name = "ID_F", unique = true, nullable = false)
	public int getIdF() {
		return this.idF;
	}

	public void setIdF(int idF) {
		this.idF = idF;
	}

	@Column(name = "NOM_F")
	public String getNomF() {
		return this.nomF;
	}

	public void setNomF(String nomF) {
		this.nomF = nomF;
	}

	@Column(name = "SIGLE")
	public String getSigle() {
		return this.sigle;
	}

	public void setSigle(String sigle) {
		this.sigle = sigle;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "filieres")
	public Set getNiveauses() {
		return this.niveauses;
	}

	public void setNiveauses(Set niveauses) {
		this.niveauses = niveauses;
	}

}
