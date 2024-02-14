package com.basic.services;

import com.basic.models.UsuarioModel;
import com.basic.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> obtenerPorId(Long id){                    // Metodo de tipo Optional por si no hay información para mostrar
        return usuarioRepository.findById(id);
    }

    public UsuarioModel obtenerPorIdMetodoLargo(Long id){
        return usuarioRepository.findById(id).get();
    }

    public boolean eliminarUsuario(Long id){
        try{
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception err){
            return false;
        }
    }

}
