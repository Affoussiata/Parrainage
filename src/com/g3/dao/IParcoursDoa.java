package com.g3.dao;

import java.util.List;

import com.g3.model.Parcours;
public interface IParcoursDoa {

 void saveParcours(Parcours parcours);

 void updateParcours(Parcours parcours);

 Parcours getParcoursById(int id);

 List<Parcours> getAllParcours();

 void deleteParcours(int id);

}
