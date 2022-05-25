import java.io.*;
import java.util.Date;


public class CadastroPessoal {

	private int cpf;
	private String nome;
	private String data_nasc;
	private String sexo;
	private int rg;
	private String email;
	private int celular;
	private String data_cadastro;
	private String cidade;
	private String endereco;
	private int numero_end;
	private String uf;
	private int cep;

	public int getCpf(){
		return cpf;
	}

	public void setCpf(int cpf){
		this.cpf = cpf;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getData_nasc(){
		return data_nasc;
	}

	public void setData_nasc(String data_nasc){
		this.data_nasc = data_nasc;
	}
		
	public String getSexo(){
		return sexo;
	}

	public void setSexo(String sexo){
		this.sexo = sexo;
	}

	public int getRg(){
		return rg;
	}

	public void setRg(int rg){
		this.rg = rg;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public int getCelular(){
		return celular;
	}

	public void setCelular(int celular){
		this.celular = celular;
	}

	public String getData_cadastro(){
		return data_cadastro = data_cadastro;
	}

	public void setData_cadastro(String data_cadastro){
		this.data_cadastro = data_cadastro;
	}

	public String getCidade(){
		return cidade;
	}

	public void setCidade(String cidade){
		this.cidade = cidade;
	}

	public String getEndereco(){
		return endereco;
	}

	public void setEndereco(String endereco){
		this.endereco = endereco;
	}

	public int getNumero_end(){
		return numero_end;
	}

	public void setNumero_end(int numero_end){
		this.numero_end = numero_end;
	}

	public String getUf(){
		return uf;
	}

	public void setUf(String uf){
		this.uf = uf;
	}

	public int getCep(){
		return cep;
	}

	public void setCep(int cep){
		this.cep = cep;
	}


}
