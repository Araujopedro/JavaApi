package br.com.fiap.modelo;

public class Endereco {
	
	/*{
    "cep": "01001-000",
    "logradouro": "Praça da Sé",
    "complemento": "lado ímpar",
    "bairro": "Sé",
    "localidade": "São Paulo",
    "uf": "SP",*/
	
	
	private String cep;
	private String Longradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;

	
	public Endereco() {
		super();
	}
	
	
	
	
	public Endereco(String cep, String longradouro, String complemento, String bairro, String localidade, String uf) {
		super();
		this.cep = cep;
		Longradouro = longradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLongradouro() {
		return Longradouro;
	}
	public void setLongradouro(String longradouro) {
		Longradouro = longradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}

	
	
	@Override
	public String toString() {
		return "TesteViaCep [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";

}
}
