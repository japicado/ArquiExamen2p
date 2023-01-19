package com.picadoexamen2p.examen2p.Service;

import org.springframework.stereotype.Service;

import com.picadoexamen2p.examen2p.Repository.EjecutivoRepository;

@Service
public class EjecutivoService {
    private final EjecutivoRepository ejecutivoRepository;

    public EjecutivoService(EjecutivoRepository ejecutivoRepository) {
        this.ejecutivoRepository = ejecutivoRepository;
    }

}
