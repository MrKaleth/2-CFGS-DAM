package modelos;

import java.time.Duration;
import java.time.LocalDateTime;

public class Retransmision {
	private String idRetransmision;
	private String titulo;
	private LocalDateTime fechaInicioRetransmision;
	private Duration duracion;
	private Canal canal;

	public Retransmision(String idRetransmision, String titulo, LocalDateTime fechaInicioRetransmision,
			Duration duracion, Canal canal) {
		super();
		this.idRetransmision = idRetransmision;
		this.titulo = titulo;
		this.fechaInicioRetransmision = fechaInicioRetransmision;
		this.duracion = duracion;
		this.canal = canal;
	}

	public String getIdRetransmision() {
		return idRetransmision;
	}

	public void setIdRetransmision(String idRetransmision) {
		this.idRetransmision = idRetransmision;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDateTime getFechaInicioRetransmision() {
		return fechaInicioRetransmision;
	}

	public void setFechaInicioRetransmision(LocalDateTime fechaInicioRetransmision) {
		this.fechaInicioRetransmision = fechaInicioRetransmision;
	}

	public Duration getDuracion() {
		return duracion;
	}

	public void setDuracion(Duration duracion) {
		this.duracion = duracion;
	}

	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal canal) {
		this.canal = canal;
	}

	@Override
	public String toString() {
		return "Retransmision [idRetransmision=" + idRetransmision + ", titulo=" + titulo
				+ ", fechaInicioRetransmision=" + fechaInicioRetransmision + ", duracion=" + duracion + ", canal="
				+ canal + "]";
	}

}
