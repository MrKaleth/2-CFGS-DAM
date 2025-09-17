package repositorios;

import java.util.ArrayList;
import java.util.List;

import modelos.Usuario;

public class UsuarioRepository {
	List<Usuario> listaUsuarios;

	public UsuarioRepository() {
		super();
		this.listaUsuarios = new ArrayList<Usuario>();
	}

	public void añadirUsuario(Usuario u) {
		listaUsuarios.add(u);
	}

	public void eliminarUsuario(Usuario u) {
		listaUsuarios.remove(u);
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

}
