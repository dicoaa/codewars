package com.basic.controllers;

import com.basic.models.UsuarioModel;
import com.basic.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerPorId(@PathVariable("id") Long id){            //PathVariable indica que se debe indicar el id
        return this.usuarioService.obtenerPorId(id);
    }

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<?> actualizarProducto(@RequestBody UsuarioModel usuarioModel, @PathVariable Long id){
        try{
            UsuarioModel usuarioModelTemporal = usuarioService.obtenerPorIdMetodoLargo(id);

            usuarioModelTemporal.setNombre(usuarioModel.getNombre());
            usuarioModelTemporal.setEmail(usuarioModel.getEmail());

            usuarioService.guardarUsuario(usuarioModelTemporal);

            return new ResponseEntity<UsuarioModel>(HttpStatus.OK);
        } catch(Exception exception){
            return new ResponseEntity<UsuarioModel>(HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok){
            return "Se eliminó el usuario " + id;
        }else{
            return "Usuario no encontrado " + id;
        }
    }

}
