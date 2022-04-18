package com.chams.gestionstock.Service.Impl;


import com.chams.gestionstock.Service.EntrepriseService;
import com.chams.gestionstock.dto.EntrepriseDto;
import com.chams.gestionstock.repository.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrespriseSericeImpl implements EntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;




    @Override
    public EntrepriseDto save(EntrepriseDto dto) {
        return null;
    }

    @Override
    public EntrepriseDto findById(Integer id) {
        return null;
    }

    @Override
    public List<EntrepriseDto> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
