package com.picadoexamen2p.examen2p.Controller.DTOs.Req;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserReq implements Serializable {

    private String lastname;

    private String firstname;
}
