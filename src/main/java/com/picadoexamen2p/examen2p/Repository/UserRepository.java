package com.picadoexamen2p.examen2p.Repository;

import org.springframework.data.repository.CrudRepository;

import com.picadoexamen2p.examen2p.Model.User;

public interface UserRepository extends CrudRepository<User, String> {

}
