package com.bsavi.minhasfinancas.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.bsavi.minhasfinancas.exception.RegraNegocioException;
import com.bsavi.minhasfinancas.model.entity.Usuario;
import com.bsavi.minhasfinancas.model.repository.UsuarioRepository;

@Service
public class UsuarioServicesImpl implements UsuarioService {
	
	private UsuarioRepository repository;
	
	@Autowired
	public UsuarioServicesImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String nome, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ValidarEmail(String email) {
		// se existir o email no banco de dados vai retornar true.
		boolean existe = repository.existsByEmail(email);
		if(existe) {
			throw new RegraNegocioException("Já existe um usuário com este email.");
		}
		
	}
	
}
