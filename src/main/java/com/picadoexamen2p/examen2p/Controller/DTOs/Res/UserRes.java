package com.picadoexamen2p.examen2p.Controller.DTOs.Res;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRes implements Serializable {
    private String lastname;

    private String firstname;
}
