package com.picadoexamen2p.examen2p.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.picadoexamen2p.examen2p.Model.Turno;

public interface TurnoRepository extends CrudRepository<Turno, String> {
    Turno findByNumTurno(String numTurno);

    Turno findByNumTurnoAndCedCliente(String numTurno, String cedCliente);

    List<Turno> findByCedCliente(String cedulaCliente);

    List<Turno> findByCalificacion(int calificacion);
}
