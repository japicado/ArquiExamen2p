package com.picadoexamen2p.examen2p.Repository;

import org.springframework.data.repository.CrudRepository;

import com.picadoexamen2p.examen2p.Model.Ejecutivo;

public interface EjecutivoRepository extends CrudRepository<Ejecutivo, String> {
    Ejecutivo findByCodUsuario(String codEjecutivo);
}
