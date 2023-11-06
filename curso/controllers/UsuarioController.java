package com.cursoArgentino.curso.controllers;

import com.cursoArgentino.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UsuarioController {
    @RequestMapping(value="usuario{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Manu");
        usuario.setApellido("Cendan");
        usuario.setEmail("manucen@gmail.com");
        usuario.setTelefono("236785149");
        return usuario;
    }

    @RequestMapping(value="usuarioGR")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Manu");
        usuario.setApellido("Cendan");
        usuario.setEmail("manucen@gmail.com");
        usuario.setTelefono("236785149");
        return usuario;
    }

    @RequestMapping(value="usuario22")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Manu");
        usuario.setApellido("Cendan");
        usuario.setEmail("manucen@gmail.com");
        usuario.setTelefono("236785149");
        return usuario;
    }

    @RequestMapping(value="usuario33")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Manu");
        usuario.setApellido("Cendan");
        usuario.setEmail("manucen@gmail.com");
        usuario.setTelefono("236785149");
        return usuario;
    }
}
