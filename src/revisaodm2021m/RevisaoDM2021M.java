/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021m;

import revisaodm2021m.dadosbean.Pessoa;
import revisaodm2021m.dadoscontrole.PessoaController;
import revisaodm2021m.dadostelas.ManterPessoa;

/**
 *
 * @author User
 */
public class RevisaoDM2021M {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		ManterPessoa manterPessoa = new ManterPessoa();
		manterPessoa.Cadastrar();
	}

}
