//LUCAS DOMINGOS LEAO GOMES

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class main {
	private static String nome;
	private static String enderecoCompleto;
	private static String cidade;
	private static String estado;
	private static String cep;
	private static int valor;
	private static int premio;
	private static int numApolice;
	private static int deducaoAutomovel;
	
	
	//ok - inserir o cadastro de um novo tipo de seguro -- Fazer um terminal com scanner
	//ok - 	listar todos os seguros cadastrados  -- Inserir em um ArrayList e imprimir todos
	//buscar as informações de um seguro pelo número de apólice  -- Primeiro adicionar dentro de um ArrayList e depois buscar
	// Usar um switch até que o usuario tecle a tecla 0
	
	public static void inputSeguro() throws IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entre com os dados abaixo\n(INT) Numero de apolice: ");
//		Scanner sc = new Scanner(System.in);
		
		numApolice = Integer.parseInt(sc.readLine());
		System.out.println("(STRING) Nome Completo: ");
		nome = sc.readLine();
		System.out.println("(STRING) Endereco completo: ");
		enderecoCompleto = sc.readLine();
		System.out.println("(STRING) Cidade: ");
		cidade = sc.readLine();
		System.out.println("(STRING) Estado: ");
		estado = sc.readLine();
		System.out.println("(STRING) CEP: ");
		cep = sc.readLine();
		System.out.println("(INT) Valor: ");
		valor = Integer.parseInt(sc.readLine());
		System.out.println("(INT) Premio: ");
		premio = Integer.parseInt(sc.readLine());
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		try {
		List<Seguro> seguros = new ArrayList<Seguro>();
		int opcao = 0;
		do {
			System.out.println("- Entre com um tipo de Seguro -\n1 - Seguro de Vida\n2 - Seguro de Casa\n3 - Seguro de Automovel\n4 - Listar seguros cadastrados\n5 - Buscar seguro por apolice\n0 - Sair do programa");
//			Scanner sca = new Scanner(System.in);
			BufferedReader sca = new BufferedReader(new InputStreamReader(System.in));
			
			
			opcao = Integer.parseInt(sca.readLine());
			
			switch (opcao) {
			case 1:
				
				inputSeguro();
				System.out.println("- Seguro de Vida - ");
				System.out.println("(STRING) Qual beneficio: ");
				String beneficiario = sca.readLine();
				System.out.println("(INT) Dia de nascimento: ");
				int dataDia = Integer.parseInt(sca.readLine());
				System.out.println("(INT) Mes de nascimento: ");
				int dataMes = Integer.parseInt(sca.readLine());
				System.out.println("(INT) Ano de nascimento: ");
				int dataAno = Integer.parseInt(sca.readLine());
				seguros.add(new SeguroVida(numApolice, nome, new Endereco(enderecoCompleto, cidade, estado, cep), valor, premio, beneficiario, new Data(dataDia, dataMes, dataAno)));
//				seguros.add(new SeguroVida(30,"Teste3", new Endereco("Endereco3", "SJC", "SP", "12247403"),3000,50,"Bolsa Familia", new Data(05,05,1997)));
				
				break;
			case 2:
				inputSeguro();
				System.out.println("- Seguro de Casa - ");
				System.out.println("(INT) Valor de Deducao de casa: ");
				int deducaoCasa = Integer.parseInt(sca.readLine());
				System.out.println("(INT) Ano de construcao da casa: ");
				int anoConstrucao = Integer.parseInt(sca.readLine());
				seguros.add(new SeguroCasa (numApolice, nome, new Endereco(enderecoCompleto, cidade, estado, cep), valor, premio, deducaoCasa, anoConstrucao));
//				seguros.add(new SeguroCasa(10,"Teste", new Endereco("Endereco1", "SJC", "SP", "12247400"),1000, (float) 12.00,20,2017));
				break;
			case 3:
				inputSeguro();
				System.out.println("- Seguro de Automovel - ");
				System.out.println("(INT) Deducao do automovel: ");
				deducaoAutomovel = Integer.parseInt(sca.readLine());
				System.out.println("(INT) Numero de licenca: ");
				int numLicenca = Integer.parseInt(sca.readLine());
				System.out.println("(STRING) Modelo: ");
				String modelo = sca.readLine();
				System.out.println("(INT) Ano: ");
				int ano = Integer.parseInt(sca.readLine());
				seguros.add(new SeguroAuto(numApolice, nome, new Endereco(enderecoCompleto, cidade, estado, cep), valor, premio, deducaoAutomovel, numLicenca, estado, modelo, ano));
//				seguros.add(new SeguroAuto(20,"Teste2", new Endereco("Endereco2", "SJC", "SP", "12247402"),2000,30,35,105,"SP", "Kelwasaki", 2020));
				break;
				
			case 4:
				System.out.println("- Listando os seguros cadastrados- \n"+seguros);
				break;
				
			case 5:
				if (seguros.size()==0) {
					System.out.println("- A lista esta vazia, adicione um seguro antes! -\n");
					break;
				}
				else {
					System.out.println("- Buscar seguro por apolice -\nEntre com um numero de apolice: ");
					int c = Integer.parseInt(sca.readLine());
					for (Seguro object : seguros) {
						if (object.getNumApolice() == c) {
							System.out.println(object);
						}
					}
				}
				break;

			default:
				System.out.println("Saindo do programa");
				break;
			}
			/*SeguroCasa s1c = new SeguroCasa(10,"Teste", new Endereco("Endereco1", "SJC", "SP", "12247400"),1000, (float) 12.00,20,2017);
			SeguroAuto s2a = new SeguroAuto(20,"Teste2", new Endereco("Endereco2", "SJC", "SP", "12247402"),2000,30,35,105,"SP", "Kelwasaki", 2020);
			SeguroVida s3v = new SeguroVida(30,"Teste3", new Endereco("Endereco3", "SJC", "SP", "12247403"),3000,50,"Bolsa Familia", new Data(05,05,1997));
			System.out.println(s1c+"\n");
			System.out.println(s2a+"\n");
			System.out.println(s3v+"\n");*/
		} while (opcao != 0);
//		System.out.println(seguros);
		}
		catch(IOException e) {
			System.out.println("Erro ao ler entrada de dados.");
		}
		catch(Exception e) {
			System.out.println("Erro inesperado.");
	}
	}
}
