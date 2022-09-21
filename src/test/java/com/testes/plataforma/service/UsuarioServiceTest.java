package com.testes.plataforma.service;

import com.testes.plataforma.model.UsuarioModel;
import com.testes.plataforma.repository.UsuarioRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

public class UsuarioServiceTest {


    @Autowired
    private UsuarioService usuarioService;

    @MockBean
    private UsuarioRepository usuarioRepository;

    private UsuarioModel usuario;

    @BeforeEach
    private void usuario(){
        usuario = new UsuarioModel(1L, "Joyce", "1234");
    }

    @Test
    public void testarOCadastro(){
        Mockito.when(usuarioRepository.findById(Mockito.anyLong()));
        usuarioRepository.save(usuario);
        Mockito.verify(usuarioRepository, Mockito.times(1)).save(usuario);
    }

    @Test
    void exibirUsuariosTest(){
        UsuarioService mockUsuario = Mockito.mock(UsuarioService.class);
        List<UsuarioModel> todosOsUsuarios = mockUsuario.todosUsuarios();
        Assertions.assertTrue(todosOsUsuarios.isEmpty());
    }
}
