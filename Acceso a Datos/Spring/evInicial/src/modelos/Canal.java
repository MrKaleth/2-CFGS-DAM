package modelos;

import java.time.LocalDate;

public class Canal {
	private String idCanal;
	private String titulo;
	private LocalDate fechaCreacion;
	private Usuario usuario;

	public Canal(String idCanal, String titulo, LocalDate fechaCreacion, Usuario usuario) {
		super();
		this.idCanal = idCanal;
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.usuario = usuario;
	}

	public String getIdCanal() {
		return idCanal;
	}

	public void setIdCanal(String idCanal) {
		this.idCanal = idCanal;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Canal [idCanal=" + idCanal + ", titulo=" + titulo + ", fechaCreacion=" + fechaCreacion + ", usuario="
				+ usuario + "]";
	}

}
