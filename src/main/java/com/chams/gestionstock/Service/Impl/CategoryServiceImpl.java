package com.chams.gestionstock.Service.Impl;

import com.chams.gestionstock.Service.CategoryService;
import com.chams.gestionstock.dto.CategoryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Override
    public CategoryDto save(CategoryDto dto) {
        return null;
    }

    @Override
    public CategoryDto findById(Integer id) {
        return null;
    }

    @Override
    public CategoryDto findByCode(String code) {
        return null;
    }

    @Override
    public List<CategoryDto> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
