package com.picadoexamen2p.examen2p.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.picadoexamen2p.examen2p.Model.Turno;
import com.picadoexamen2p.examen2p.Service.TurnoService;

public class TurnoController {
    private final TurnoService turnoService;

    public TurnoController(TurnoService turnoService) {
        this.turnoService = turnoService;
    }

    @GetMapping("/{numTurno}")
    public Turno obtenerTurno(@PathVariable String numTurno) {
        return turnoService.obtenerTurno(numTurno);
    }

    @GetMapping("/cliente/{cedulaCliente}")
    public List<Turno> obtenerTurnosPorCliente(@PathVariable String cedulaCliente) {
        return turnoService.obtenerTurnosPorCliente(cedulaCliente);
    }

    @GetMapping("/calificacion/{calificacion}")
    public List<Turno> obtenerTurnosPorCalificacion(@PathVariable int calificacion) {
        return turnoService.obtenerTurnosPorCalificacion(calificacion);
    }

}
