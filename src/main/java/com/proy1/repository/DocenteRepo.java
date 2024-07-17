package com.proy1.repository;

import com.proy1.entity.DocenteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepo extends JpaRepository<DocenteModel, Integer> {
}
