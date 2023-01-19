package com.picadoexamen2p.examen2p.Repository;

import org.springframework.data.repository.CrudRepository;

import com.picadoexamen2p.examen2p.Model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String> {

    Cliente findByCedula(String cedula);
}
