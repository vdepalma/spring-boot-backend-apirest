package com.vdepalma.springboot.backend.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.vdepalma.springboot.backend.backend.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
