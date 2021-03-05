/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021m.dadoscontrole;

import java.util.List;
import revisaodm2021m.dadosbean.Pessoa;
import revisaodm2021m.dadosdao.PessoaDAO;


public class PessoaController {
    
	 PessoaDAO daoP;
   public PessoaController() {
	   daoP = new PessoaDAO();
   }
   
   
   	public static PessoaController getInstance() {
   		return new PessoaController();
   	}
    
    public Pessoa inserir(Pessoa p) {
        return daoP.inserir(p);
    }
    
    public Pessoa alterar(Pessoa p) {
        return daoP.alterar(p);
    }

    public List<Pessoa> listar(Pessoa p) {
        return daoP.listar();
    }

    public Pessoa buscar(Pessoa p) {
        return daoP.buscar(p);
    }

    public void excluir(Pessoa p) {
        daoP.excluir(p);
    }

    
}
