package com.proy1.repository;

import com.proy1.entity.PersonalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepo extends JpaRepository<PersonalModel, Integer> {

}
