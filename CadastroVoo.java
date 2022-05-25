import java.io.*;

public class CadastroVoo extends Ticket{

	private int cpf;

	public CadastroVoo(int date, int time, double seat, double gate, String scanner, String nome, String origem, String destino, int cpf){
		super(date, time, seat, gate, scanner, nome, origem, destino);
		this.cpf = cpf;
	}

	public int getCpf(){
		return cpf;
	}

	public void setCpf(int cpf){
		this.cpf = cpf;
	}

}
