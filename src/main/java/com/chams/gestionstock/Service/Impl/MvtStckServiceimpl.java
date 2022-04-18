package com.chams.gestionstock.Service.Impl;


import com.chams.gestionstock.Service.MvtStckService;
import com.chams.gestionstock.dto.MvtStckDto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class MvtStckServiceimpl implements MvtStckService {
    @Override
    public BigDecimal stockReelArticle(Integer idArticle) {
        return null;
    }

    @Override
    public List<MvtStckDto> mvtStkArticle(Integer idArticle) {
        return null;
    }

    @Override
    public MvtStckDto entreeStock(MvtStckDto dto) {
        return null;
    }

    @Override
    public MvtStckDto sortieStock(MvtStckDto dto) {
        return null;
    }

    @Override
    public MvtStckDto correctionStockPos(MvtStckDto dto) {
        return null;
    }

    @Override
    public MvtStckDto correctionStockNeg(MvtStckDto dto) {
        return null;
    }
}
