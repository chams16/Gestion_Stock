package com.chams.gestionstock.Service;

import com.chams.gestionstock.dto.MvtStckDto;

import java.math.BigDecimal;
import java.util.List;

public interface MvtStckService {

    BigDecimal stockReelArticle(Integer idArticle);

    List<MvtStckDto> mvtStkArticle(Integer idArticle);

    MvtStckDto entreeStock(MvtStckDto dto);

    MvtStckDto sortieStock(MvtStckDto dto);

    MvtStckDto correctionStockPos(MvtStckDto dto);

    MvtStckDto correctionStockNeg(MvtStckDto dto);
}
