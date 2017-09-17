package br.com.softblue.bluekeeper.dao;

import java.util.List;

import br.com.softblue.bluekeeper.model.SenhaServico;

public interface SenhaServicoDAO {

	public List<SenhaServico> load();

	public void store(List<SenhaServico> senhasServico);
	
	public List<SenhaServico> filter(String text);
	
	public int generateId();
}
