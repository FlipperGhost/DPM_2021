package revisaodm2021m.dadoscontrole;

import java.util.List;

import revisaodm2021m.dadosbean.Pessoa;
import revisaodm2021m.dadosdao.PessoaDAO;

public class PessoaFisicaController {

	 PessoaDAO pessoaDAO;
	   public PessoaFisicaController() {
		   pessoaDAO = new PessoaDAO();
	   }
	   
	   
	   	public static PessoaController getInstance() {
	   		return new PessoaController();
	   	}
	    
	    public Pessoa inserir(Pessoa p) {
	        return pessoaDAO.inserir(p);
	    }
	    
	    public Pessoa alterar(Pessoa p) {
	        return pessoaDAO.alterar(p);
	    }

	    public List<Pessoa> listar(Pessoa p) {
	        return pessoaDAO.listar();
	    }

	    public Pessoa buscar(Pessoa p) {
	        return pessoaDAO.buscar(p);
	    }

	    public void excluir(Pessoa p) {
	    	pessoaDAO.excluir(p);
	    }
	
}
