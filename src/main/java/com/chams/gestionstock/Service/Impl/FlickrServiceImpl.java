package com.chams.gestionstock.Service.Impl;

import com.chams.gestionstock.Service.FlickrService;
import org.springframework.stereotype.Service;

import java.io.InputStream;


@Service
public class FlickrServiceImpl implements FlickrService {
    @Override
    public String savePhoto(InputStream photo, String title) {
        return null;
    }
}
