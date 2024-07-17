package com.proy1.controller;

import com.proy1.entity.DocenteModel;
import com.proy1.entity.MteriaModel;
import com.proy1.entity.PersonalModel;
import com.proy1.repository.DocenteRepo;
import com.proy1.repository.MateriaRepo;
import com.proy1.repository.PersonalRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonalController {
    //
    private final PersonalRepo personalRepo;
    @GetMapping("PersonalBD")
    public List<PersonalModel> getPersonal() {
        return personalRepo.findAll();
    }
    //
    private final MateriaRepo MR;
    @GetMapping("MateriaDataBase")
    public List<MteriaModel> getMateriaDataBase() {return MR.findAll();}
    //
    private final DocenteRepo DR;
    @GetMapping("DocentBD")// nombre en puerto
    public List<DocenteModel> getDocentBD() {return DR.findAll();}

}
