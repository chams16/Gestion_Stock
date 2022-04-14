package com.chams.gestionstock.Service;

import com.chams.gestionstock.dto.VentesDto;

import java.util.List;

public interface VenteService {

    VentesDto save(VentesDto dto);

    VentesDto findById(Integer id);

    VentesDto findByCode(String code);

    List<VentesDto> findAll();

    void delete(Integer id);
}
