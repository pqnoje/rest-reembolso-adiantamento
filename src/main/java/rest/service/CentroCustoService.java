package rest.service;

import java.util.List;

import rest.model.CentroCusto;

public interface CentroCustoService {
  
	public CentroCusto findById(long id);
	public List<CentroCusto> findAll();
	public void save(CentroCusto centroCusto);
	public void update(CentroCusto centroCusto);
	public void delete(CentroCusto centroCusto);
	public void shutdown();
}