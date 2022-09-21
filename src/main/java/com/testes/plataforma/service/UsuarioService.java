package com.testes.plataforma.service;

import com.testes.plataforma.model.UsuarioModel;
import com.testes.plataforma.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;


    public List<UsuarioModel> todosUsuarios(){
        return usuarioRepository.findAll();
    }

    public UsuarioModel cadastrar(UsuarioModel usuarioModel) {
            usuarioRepository.save(usuarioModel);
            return usuarioModel;
    }
}
