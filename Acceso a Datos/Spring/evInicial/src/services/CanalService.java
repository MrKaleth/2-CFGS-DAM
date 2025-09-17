package services;

import modelos.Canal;
import repositorios.CanalRepository;

public class CanalService {
	private CanalRepository repo;

	public CanalService() {
		super();
		repo = new CanalRepository();
	}

	public void altaCanal(Canal c) {
		repo.añadirCanal(c);
	}

	public CanalRepository getRepo() {
		return repo;
	}

	public void setRepo(CanalRepository repo) {
		this.repo = repo;
	}
}
