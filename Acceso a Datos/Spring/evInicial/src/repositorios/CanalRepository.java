package repositorios;

import java.util.ArrayList;
import java.util.List;

import modelos.Canal;

public class CanalRepository {
	List<Canal> listaCanales;

	public CanalRepository() {
		super();
		this.listaCanales = new ArrayList<Canal>();
	}

	public void añadirCanal(Canal c) {
		listaCanales.add(c);
	}

	public void eliminarCanal(Canal c) {
		listaCanales.remove(c);
	}

	public List<Canal> getListaCanales() {
		return listaCanales;
	}

	public void setListaCanales(List<Canal> listaCanales) {
		this.listaCanales = listaCanales;
	}

}
