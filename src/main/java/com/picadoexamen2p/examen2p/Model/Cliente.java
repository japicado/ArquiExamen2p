package com.picadoexamen2p.examen2p.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "Cliente")
public class Cliente {
    @Id
    private String id;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String direccionPrincipal;
    private String telefono;
    private String email;
    private List<ClienteCuenta> cuentas;

}
