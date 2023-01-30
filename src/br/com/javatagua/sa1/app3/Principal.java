package br.com.javatagua.sa1.app3;
import br.com.javatagua.sa1.bo.*;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {// Método principal
		// TODO Auto-generated method stub
		
		// Pega a resposta em String
		String resp = JOptionPane.showInputDialog("Digite a quantidade de aviões:");
		
		//Converte a resposta para inteiro
		int qtdeAvioes = Integer.parseInt(resp);
		
		// Instanciando objetos
		AssentoBO abo = new AssentoBO();
		
		JOptionPane.showMessageDialog(null,"Qtde geral de assentos: git" + abo.calcularAssento(qtdeAvioes));
	}

}
