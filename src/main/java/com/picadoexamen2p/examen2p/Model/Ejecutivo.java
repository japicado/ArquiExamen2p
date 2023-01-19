package com.picadoexamen2p.examen2p.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "Ejecutivo")
public class Ejecutivo {
    @Id
    private String id;
    private String codUsuario;
    private String nombreCompleto;
    private String numEscritorio;
}
