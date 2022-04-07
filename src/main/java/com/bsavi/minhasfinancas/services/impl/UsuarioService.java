package com.bsavi.minhasfinancas.services.impl;

import com.bsavi.minhasfinancas.model.entity.Usuario;

public interface UsuarioService {
	
	Usuario autenticar(String nome, String senha);
	
	Usuario salvarUsuario(Usuario usuario);
	
	void ValidarEmail(String email);
}
