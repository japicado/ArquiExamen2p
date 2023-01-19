package com.picadoexamen2p.examen2p.Service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.picadoexamen2p.examen2p.Model.Cliente;
import com.picadoexamen2p.examen2p.Model.Ejecutivo;
import com.picadoexamen2p.examen2p.Model.Turno;
import com.picadoexamen2p.examen2p.Repository.ClienteRepository;
import com.picadoexamen2p.examen2p.Repository.EjecutivoRepository;
import com.picadoexamen2p.examen2p.Repository.TurnoRepository;

@Service
public class TurnoService {
    private final TurnoRepository turnoRepository;
    private final ClienteRepository clienteRepository;
    private final EjecutivoRepository ejecutivoRepository;

    public TurnoService(TurnoRepository turnoRepository, ClienteRepository clienteRepository,
            EjecutivoRepository ejecutivoRepository) {
        this.turnoRepository = turnoRepository;
        this.clienteRepository = clienteRepository;
        this.ejecutivoRepository = ejecutivoRepository;
    }

    private int contador = 0;

    private String generarNumeroTurnoSiguiente() {
        contador++;
        return String.format("T%05d", contador);
    }

    public Turno generarTurno(String cedulaCliente, String nombreCliente) {
        Turno turno = Turno.builder()
                .numTurno(generarNumeroTurnoSiguiente())
                .cedCliente(cedulaCliente)
                .nombreCliente(nombreCliente)
                .fechaGeneracion(new Date())
                .build();

        return turnoRepository.save(turno);
    }

    public void registrarFinAtencion(String numTurno) {
        Turno turno = turnoRepository.findByNumTurno(numTurno);
        if (turno != null) {
            turno.setFechaHoraFin(new Date());
            turnoRepository.save(turno);
        } else {
            throw new IllegalArgumentException("Turno no encontrado");
        }
    }

    public void registrarInicioAtencion(String numTurno, String codEjecutivo) {
        Turno turno = turnoRepository.findByNumTurno(numTurno);
        if (turno != null) {
            Ejecutivo ejecutivo = ejecutivoRepository.findByCodUsuario(codEjecutivo);
            if (ejecutivo != null) {
                turno.setCodEjecutivo(ejecutivo.getCodUsuario());
                turno.setNombreEjecutivo(ejecutivo.getNombreCompleto());
                turno.setFechaHoraInicio(new Date());
                turnoRepository.save(turno);
            } else {
                throw new IllegalArgumentException("Ejecutivo no encontrado");
            }
        } else {
            throw new IllegalArgumentException("Turno no encontrado");
        }
    }

    public void registrarCalificacion(String cedulaCliente, String numTurno, int calificacion) {
        Cliente cliente = clienteRepository.findByCedula(cedulaCliente);
        if (cliente != null) {
            Turno turno = turnoRepository.findByNumTurnoAndCedCliente(numTurno, cedulaCliente);
            if (turno != null) {
                turno.setCalificacion(calificacion);
                turnoRepository.save(turno);
            } else {
                throw new IllegalArgumentException("Turno no encontrado para el cliente especificado");
            }
        } else {
            throw new IllegalArgumentException("Cliente no encontrado");
        }
    }

    public Turno obtenerTurno(String numTurno) {
        return turnoRepository.findByNumTurno(numTurno);
    }

    public List<Turno> obtenerTurnosPorCliente(String cedulaCliente) {
        return turnoRepository.findByCedCliente(cedulaCliente);
    }

    public List<Turno> obtenerTurnosPorCalificacion(int calificacion) {
        return turnoRepository.findByCalificacion(calificacion);
    }

}
