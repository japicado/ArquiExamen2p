package com.picadoexamen2p.examen2p.Service;

import org.springframework.stereotype.Service;

import com.picadoexamen2p.examen2p.Model.Cliente;
import com.picadoexamen2p.examen2p.Repository.ClienteRepository;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente obtenerInformacionCliente(String cedula) {
        return clienteRepository.findByCedula(cedula);
    }
}
