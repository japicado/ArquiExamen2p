package com.picadoexamen2p.examen2p.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.picadoexamen2p.examen2p.Model.Cliente;
import com.picadoexamen2p.examen2p.Service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/{cedula}")
    public Cliente obtenerInformacionCliente(@PathVariable String cedula) {
        return clienteService.obtenerInformacionCliente(cedula);
    }
}