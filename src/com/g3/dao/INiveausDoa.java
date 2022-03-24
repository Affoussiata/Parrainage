package com.g3.dao;

import java.util.List;

import com.g3.model.Niveaus;
public interface INiveausDoa {

 void saveNiveaus(Niveaus niveaus);

 void updateNiveaus(Niveaus niveaus);

 Niveaus getNiveausById(int id);

 List<Niveaus> getAllNiveaus();

 void deleteNiveaus(int id);

}
