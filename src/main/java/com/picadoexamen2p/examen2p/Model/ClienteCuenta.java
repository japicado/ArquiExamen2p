package com.picadoexamen2p.examen2p.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClienteCuenta {
    private String numCuenta;
    private String tipoCuenta;
    private String saldoProm;
}
