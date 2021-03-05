package revisaodm2021m.dadoscontrole;

import java.util.List;

import revisaodm2021m.dadosbean.Departamento;
import revisaodm2021m.dadosdao.DepartamentoDAO;

public class DepartamentoController {

	DepartamentoDAO daoP;

	public DepartamentoController() {
		daoP = new DepartamentoDAO();
	}

	public static DepartamentoController getInstance() {
		return new DepartamentoController();
	}

	public Departamento inserir(Departamento p) {
		return daoP.inserir(p);
	}

	public Departamento alterar(Departamento p) {
		return daoP.alterar(p);
	}

	public List<Departamento> listar(Departamento p) {
		return daoP.listar(p);
	}

	public Departamento buscar(Departamento p) {
		return daoP.buscar(p);
	}

	public Departamento excluir(Departamento p) {
		return daoP.excluir(p);
	}
}
