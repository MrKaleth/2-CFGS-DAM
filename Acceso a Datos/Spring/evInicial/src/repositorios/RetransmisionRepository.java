package repositorios;

import java.util.ArrayList;
import java.util.List;

import modelos.Retransmision;

public class RetransmisionRepository {
	List<Retransmision> listaRetransmisiones;

	public RetransmisionRepository() {
		super();
		this.listaRetransmisiones = new ArrayList<Retransmision>();
	}

	public void añadirRetransmision(Retransmision r) {
		listaRetransmisiones.add(r);
	}

	public void eliminarRetransmision(Retransmision r) {
		listaRetransmisiones.remove(r);
	}

	public List<Retransmision> getListaRetransmisiones() {
		return listaRetransmisiones;
	}

	public void setListaRetransmisiones(List<Retransmision> listaRetransmisiones) {
		this.listaRetransmisiones = listaRetransmisiones;
	}

}
