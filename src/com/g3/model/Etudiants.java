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
 * Etudiants generated by hbm2java
 */
@Entity
@Table(name = "etudiants", catalog = "parrainage")
public class Etudiants implements java.io.Serializable {

	private int idEtud;
	private Etudiants etudiants;
	private String matricule;
	private String noms;
	private String prenoms;
	private String sexe;
	private Set parcourses = new HashSet(0);
	private Set etudiantses = new HashSet(0);

	public Etudiants() {
	}

	public Etudiants(int idEtud) {
		this.idEtud = idEtud;
	}

	public Etudiants(int idEtud, Etudiants etudiants, String matricule, String noms, String prenoms, String sexe,
			Set parcourses, Set etudiantses) {
		this.idEtud = idEtud;
		this.etudiants = etudiants;
		this.matricule = matricule;
		this.noms = noms;
		this.prenoms = prenoms;
		this.sexe = sexe;
		this.parcourses = parcourses;
		this.etudiantses = etudiantses;
	}

	@Id

	@Column(name = "ID_ETUD", unique = true, nullable = false)
	public int getIdEtud() {
		return this.idEtud;
	}

	public void setIdEtud(int idEtud) {
		this.idEtud = idEtud;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ETU_ID_ETUD")
	public Etudiants getEtudiants() {
		return this.etudiants;
	}

	public void setEtudiants(Etudiants etudiants) {
		this.etudiants = etudiants;
	}

	@Column(name = "MATRICULE")
	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	@Column(name = "NOMS")
	public String getNoms() {
		return this.noms;
	}

	public void setNoms(String noms) {
		this.noms = noms;
	}

	@Column(name = "PRENOMS")
	public String getPrenoms() {
		return this.prenoms;
	}

	public void setPrenoms(String prenoms) {
		this.prenoms = prenoms;
	}

	@Column(name = "SEXE")
	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "etudiants")
	public Set getParcourses() {
		return this.parcourses;
	}

	public void setParcourses(Set parcourses) {
		this.parcourses = parcourses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "etudiants")
	public Set getEtudiantses() {
		return this.etudiantses;
	}

	public void setEtudiantses(Set etudiantses) {
		this.etudiantses = etudiantses;
	}

}