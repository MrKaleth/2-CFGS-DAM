package controladores;

import modelos.Usuario;
import services.UsuarioService;

public class Main {
	public static void main(String[] args) {
		Usuario u = new Usuario(null, "Pedro", "pedro@gmail.com", null);
		UsuarioService usuarioServivio = new UsuarioService();
		
		usuarioServivio.altaUsuario(u);
		
		System.out.println(usuarioServivio.getRepo().getListaUsuarios());
	}
}
