package com.g3.model;
// Generated 22 mars 2022, 21:03:36 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Niveaus generated by hbm2java
 */
@Entity
@Table(name = "niveaus", catalog = "parrainage")
public class Niveaus implements java.io.Serializable {

	private int idN;
	private Cycles cycles;
	private Filieres filieres;
	private Set parcourses = new HashSet(0);

	public Niveaus() {
	}

	public Niveaus(int idN, Cycles cycles, Filieres filieres) {
		this.idN = idN;
		this.cycles = cycles;
		this.filieres = filieres;
	}

	public Niveaus(int idN, Cycles cycles, Filieres filieres, Set parcourses) {
		this.idN = idN;
		this.cycles = cycles;
		this.filieres = filieres;
		this.parcourses = parcourses;
	}

	@Id

	@Column(name = "ID_N", unique = true, nullable = false)
	public int getIdN() {
		return this.idN;
	}

	public void setIdN(int idN) {
		this.idN = idN;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CYCLES", nullable = false)
	public Cycles getCycles() {
		return this.cycles;
	}

	public void setCycles(Cycles cycles) {
		this.cycles = cycles;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_F", nullable = false)
	public Filieres getFilieres() {
		return this.filieres;
	}

	public void setFilieres(Filieres filieres) {
		this.filieres = filieres;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "niveaus")
	public Set getParcourses() {
		return this.parcourses;
	}

	public void setParcourses(Set parcourses) {
		this.parcourses = parcourses;
	}

}
