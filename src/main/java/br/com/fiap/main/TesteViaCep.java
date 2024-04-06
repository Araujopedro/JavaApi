package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.modelo.Endereco;
import br.com.fiap.service.ViaCepService;

public class TesteViaCep {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		
		ViaCepService viacep = new ViaCepService();
		
		String cep = JOptionPane.showInputDialog("Informe o cep para pesquisa");
		
		Endereco endereco = viacep.getemdereco(cep);
		
		System.out.println(endereco);
		
		
		
		
		

	}

	
	}


