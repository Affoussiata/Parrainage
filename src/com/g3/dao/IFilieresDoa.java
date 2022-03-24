package com.g3.dao;

import java.util.List;

import com.g3.model.Filieres;
public interface IFilieresDoa {

 void saveFilieres(Filieres filieres);

 void updateFilieres(Filieres filieres);

 Filieres getFilieresById(int id);

 List<Filieres> getAllFilieres();

 void deleteFilieres(int id);

}
