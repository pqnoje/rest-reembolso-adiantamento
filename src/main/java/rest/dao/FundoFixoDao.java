package rest.dao;

import java.util.List;

import rest.model.FundoFixo;

public interface FundoFixoDao {
	public FundoFixo findById(long id);
	public List<FundoFixo> findAll();
	public void save(FundoFixo fundoFixo);
	public void update(FundoFixo fundoFixo);
	public void delete(FundoFixo fundoFixo);
	public void shutdown();
}
