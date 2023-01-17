package com.picadoexamen2p.examen2p.Controller.Mapper;

import com.picadoexamen2p.examen2p.Controller.DTOs.Req.UserReq;
import com.picadoexamen2p.examen2p.Controller.DTOs.Res.UserRes;
import com.picadoexamen2p.examen2p.Model.User;

public class UserMapper {
    public static User toClient(UserReq userReq) {
        return User.builder().build();
    }

    public static UserRes toClientRS(User client) {
        return UserRes.builder().build();
    }
}
