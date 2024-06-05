package com.example.projeto.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto.entitys.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
    
}
