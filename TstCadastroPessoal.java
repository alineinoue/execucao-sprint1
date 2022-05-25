
public class TstCadastroPessoal{
	
	public static void main(String arg[]){
	
		Leitura leitura = new Leitura();

		CadastroPessoal cadP = new CadastroPessoal();
	
		System.out.println("\n----CADASTRO----");
		cadP.setCpf(1298003);
		cadP.setNome("Andre");
		cadP.setData_nasc("02/03/1990");
		cadP.setSexo("Masculino");
		cadP.setRg(129803);
		cadP.setEmail("andre@hotmail.com");
		cadP.setCelular(9801392);
		cadP.setData_cadastro("25/05/2022");
		cadP.setCidade("Cornelio Procopio");
		cadP.setEndereco("Minas Gerais");
		cadP.setNumero_end(90);
		cadP.setUf("PR");
		cadP.setCep(86300000);

		System.out.println("\n----INFORMACOES DO CADASTRO PESSOAL----");
		System.out.println("Nome: " +cadP.getNome());
		System.out.println("CPF: " +cadP.getCpf());
		System.out.println("RG: " +cadP.getRg());
		System.out.println("Data de nascimento: " +cadP.getData_nasc());
		System.out.println("Sexo: " +cadP.getSexo());
		System.out.println("Email: " +cadP.getEmail());
		System.out.println("Numero do celular: " +cadP.getCelular());
		System.out.println("Cidade: " +cadP.getCidade());
		System.out.println("Endereco: " +cadP.getEndereco());
		System.out.println("Numero: " +cadP.getNumero_end());
		System.out.println("UF: " +cadP.getUf());
		System.out.println("CEP: " +cadP.getCep());
		System.out.println("Data do cadastro: " +cadP.getData_cadastro());

//---------------------------------------------------------------------------------------------

		Ticket ticket = new Ticket();
		
		System.out.println("\n----INFORMACOES TICKET----");
		ticket.setDate("24/05");
		ticket.setTime("20:00");
		ticket.setSeat(10);
		ticket.setGate(4);
		ticket.setScanner("#32904");
		ticket.setNome("Andre");
		ticket.setOrigem("Cornelio Procopio");
		ticket.setDestino("Sao Paulo");
		System.out.println("Nome: " +ticket.getNome());
		System.out.println("Data: " +ticket.getDate());
		System.out.println("Horário: " +ticket.getTime());
		System.out.println("Assento: " +ticket.getSeat());
		System.out.println("Portao: " +ticket.getGate());
		System.out.println("Scanner: " +ticket.getScanner());
		System.out.println("Origem: " +ticket.getOrigem());
		System.out.println("Destino: " +ticket.getDestino());
//------------------------------------------------------------------------------------------

		Bagagem bag = new Bagagem();
		System.out.println("\n----INFORMACOES BAGAGEM----");
		bag.setQuantidade(2);
		bag.setDetalhe("Itens Frágeis - CUIDADO !");

		System.out.println("Quantidade de bagagens: " +bag.getQuantidade());
		System.out.println("Detalhe da bagagem: " +bag.getDetalhe());
	}
}