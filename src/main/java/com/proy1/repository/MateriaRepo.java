package com.proy1.repository;

import com.proy1.entity.MteriaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepo extends JpaRepository<MteriaModel, Integer> {

}