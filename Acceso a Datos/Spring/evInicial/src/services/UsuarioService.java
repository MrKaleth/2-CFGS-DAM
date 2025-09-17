package services;

import modelos.Usuario;
import repositorios.UsuarioRepository;

public class UsuarioService {
	private UsuarioRepository repo;

	public UsuarioService() {
		super();
		repo = new UsuarioRepository();
	}
	
	public void altaUsuario(Usuario u) {
		repo.añadirUsuario(u);
	}

	public UsuarioRepository getRepo() {
		return repo;
	}

	public void setRepo(UsuarioRepository repo) {
		this.repo = repo;
	}
	
}
