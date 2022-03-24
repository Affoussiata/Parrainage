package com.g3.dao;

import java.util.List;

import com.g3.model.Etudiants;


public interface IEtudiantsDoa {

 void saveEtudiants(Etudiants etudiants);

 void updateEtudiants(Etudiants etudiants);

 Etudiants getEtudiantsById(int id);

 List<Etudiants> getAllEtudiants();

 void deleteEtudiants(int id);

}
