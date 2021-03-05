package revisaodm2021m.dadostelas;

import java.util.List;

import javax.swing.JOptionPane;

import revisaodm2021m.dadosbean.Pessoa;
import revisaodm2021m.dadoscontrole.PessoaController;

/**
 *
 * @author User
 */
public class ManterPessoa {
    
    static int id;
    static String  nome;
    static String idade;
    static String genero;
    static String peso;
    static String altura;

    static PessoaController contP; 
    
    public ManterPessoa() {
		contP = PessoaController.getInstance();
	}
    

    public  void Cadastrar() {
        nome    =   JOptionPane.showInputDialog("NOME");
        idade   =   JOptionPane.showInputDialog("IDADE");
        genero  =   JOptionPane.showInputDialog("GENERO");
        peso    =   JOptionPane.showInputDialog("PESO");
        altura  =   JOptionPane.showInputDialog("ALTURA");
        Pessoa pEntrada = new Pessoa(nome,idade,genero,peso,altura);
        Pessoa pSaida = contP.inserir(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());
    }
    
    public void Listar() {
        nome    =   JOptionPane.showInputDialog("NOME");
        Pessoa pEntrada = new Pessoa(nome);
        List<Pessoa> pssSaida = contP.listar(pEntrada);
        JOptionPane.showMessageDialog(null, pssSaida.get(1).toString());
    }

    public void Alterar() {
        id      =   Integer.parseInt(JOptionPane.showInputDialog("ID"));
        nome    =   JOptionPane.showInputDialog("NOME");
        idade   =   JOptionPane.showInputDialog("IDADE");
        genero  =   JOptionPane.showInputDialog("GENERO");
        peso    =   JOptionPane.showInputDialog("PESO");
        altura  =   JOptionPane.showInputDialog("ALTURA");
        Pessoa pEntrada = new Pessoa(id,nome,idade,genero,peso,altura);
        Pessoa pSaida = contP.alterar(pEntrada);

        JOptionPane.showMessageDialog(null, pSaida.toString());
    }

    public void Buscar() {
        id      =   Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Pessoa pEntrada = new Pessoa(id);
        Pessoa pSaida = contP.buscar(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());
    }

    public void Excluir() {
        id      =   Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Pessoa pEntrada = new Pessoa(id);
        Pessoa pSaida = contP.excluir(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());
    }

}
