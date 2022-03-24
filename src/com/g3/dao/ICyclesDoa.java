package com.g3.dao;

import java.util.List;

import com.g3.model.Cycles;

public interface ICyclesDoa {

 void saveCycles(Cycles cycles);

 void updateCycles(Cycles cycles);

 Cycles getCyclesById(int id);

 List<Cycles> getAllCycles();

 void deleteCycles(int id);





}
