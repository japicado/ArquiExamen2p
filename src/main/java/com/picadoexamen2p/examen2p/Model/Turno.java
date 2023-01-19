package com.picadoexamen2p.examen2p.Model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "Turno")
public class Turno {

    @Id
    private String id;
    private String numTurno;
    private String cedCliente;
    private String nombreCliente;
    private String codEjecutivo;
    private String nombreEjecutivo;
    private Date fechaGeneracion;
    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    private int calificacion;

}
