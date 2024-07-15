package com.proy1.controller;

import com.proy1.entity.PersonalModel;
import com.proy1.repository.PersonalRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonalController {
    private final PersonalRepo personalRepo;
    @GetMapping("PersonalBD")
    public List<PersonalModel> getPersonal() {
        return personalRepo.findAll();
    }

}
