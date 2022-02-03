package ProjetoG2;

import java.util.Scanner; //

public class cadastro {

	Scanner leia = new Scanner(System.in);

	Consumo consumo = new Consumo();

	Gasto gasto = new Gasto(); // teste

	private String nome, sexo;
	private int idade, op = 0, altura;
	private double peso, imc = 0, tmb = 0;
	private double [] historicoConsumo = new double [7];
	private double [] historicoGasto = new double [7];

	public cadastro(String nome, String sexo, int idade, int op, int altura, double peso) {

		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.op = op;
		this.altura = altura;
		this.peso = peso;
		this.imc = imc;
		this.tmb = tmb;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public double getTmb() {
		return tmb;
	}

	public void setTmb(double tmb) {
		this.tmb = tmb;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	public void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}

	public Gasto getGasto() {
		return gasto;
	}

	public void setGasto(Gasto gasto) {
		this.gasto = gasto;
	}

	public double[] getHistoricoConsumo() {
		return historicoConsumo;
	}

	public void setHistoricoConsumo(double[] historicoConsumo) {
		this.historicoConsumo = historicoConsumo;
	}
	
	public double[] getHistoricoGasto() {
		return historicoGasto;
	}

	public void setHistoricoGasto(double[] historicoGasto) {
		this.historicoGasto = historicoGasto;
	}

	public void inicioCadastro() {

		System.out.println("\t\tSelecione uma opção");
		System.out.println("1 - Inserir novos dados");
		System.out.println("2 - Já tenho cadastro");
		op = leia.nextInt();

		// INÍCIO DO SWITCH

		switch (op) {

		case 1: // CADASTRO/NOVOS DADOS

			System.out.println("Olá! Insira seus dados abaixo.");

			System.out.println("\nNome:");
			nome = leia.next();
			System.out.println("\nIdade:");
			idade = leia.nextInt();
			System.out.println("\nSexo (F ou M):");
			sexo = leia.next();
			System.out.println("\nAltura em cm:");
			altura = leia.nextInt();
			System.out.println("\nPeso:");
			peso = leia.nextDouble();

			imc = peso / (altura * altura) * 10000;

			if (sexo.equals("M")) {
				tmb = 66.5 + (13.75 * peso) + (5.003 * altura) - (6.755 * idade);
			} else if (sexo.equals("F")) {
				tmb = 655.1 + (9.563 * peso) + (1.850 * altura) - (4.676 * idade);
			}

			// FIM DO CADASTRO

		}

	}

	public void appSelect() {

		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("\n\n\t\tSelecione uma opção");
			System.out.println("1 - Iniciar um novo dia");
			System.out.println("2 - Adicionar consumo");
			System.out.println("3 - Adicionar gastos");
			System.out.println("4 - Resumo diário");
			System.out.println("5 - Histórico");
			System.out.println("6 - Opções");
			int opApp = leia.nextInt();

			switch (opApp) {

			case 1: // MÉTODO NOVO DIA
				if(consumo.getKcalConsumoDia() != 0 || gasto.getKcalGastoDia() != 0) {
					
					for(int i=0; i<7; i++) {
						
						if(historicoConsumo[6] > 0 || historicoGasto[6] > 0) {
							for(int h = 0; h < 6; h++) {
								historicoConsumo[h] = historicoConsumo[(h+1)];
								historicoGasto[h] = historicoGasto[(h+1)];
								if(h == 5) {
									historicoConsumo[6] = 0;
									historicoGasto[6] = 0;
								}
							}
						}
						if(historicoConsumo[i] == 0 && historicoGasto[i] == 0) {
							historicoConsumo[i] = consumo.getKcalConsumoDia();
							historicoGasto[i] = gasto.getKcalGastoDia()+tmb;
							i = 7;
						}
					}	
					consumo.setKcalConsumoDia(0);
					gasto.setKcalGastoDia(0);
					System.out.println("Você iniciou um novo dia! Os dados de ontem "
										+"foram salvos no seu histórico!");
				} else {
						System.out.println("\t\tAinda não foram inseridos dados no dia de hoje!");
				}
				
				break;

			case 2:

				consumo.listaAlimentos();

				break;

			case 3:

				gasto.listaExercícios();

				break;

			case 4: // MÉTODO DIÁRIO

				System.out.println("Até o momento você já consumiu: " + consumo.getKcalConsumoDia() + "Kcals!");
				System.out.println("Até o momento você já gastou: " + (gasto.getKcalGastoDia() + tmb) + "Kcals!");// Atvd
																													// vida
																													// diaria

				if (consumo.getKcalConsumoDia() + 75 > gasto.getKcalGastoDia() + tmb) {
					System.out.println("Você consumiu mais calorias do que gastou, está seguindo para um"
							+ " caminho de ganho de peso!");
				} else if (gasto.getKcalGastoDia() + tmb + 75 > consumo.getKcalConsumoDia()) {
					System.out.println("Você gastou mais calorias do que consumiu, está seguindo para um"
							+ " caminho de perda de peso!");
				} else {
					System.out.println("Você consumiu e gastou de maneira semelhante, está seguindo para um"
							+ "caminho de manutenção de peso!");
				}
				break;

			case 5: // MÉTODO HISTÓRICO
				int op5;
				do {
					System.out.println("\n\n\t\tSelecione uma opção");
					System.out.println("1 - Média dos seus resumos");
					System.out.println("2 - Média dos seus consumos");
					System.out.println("3 - Média dos seus gastos");
					System.out.println("4 - Voltar");
					op5 = leia.nextInt();
					
					switch(op5) {
					case 1:
						
						break;
					case 2:
							double somaConsumo = 0;
							int divisorConsumo = 0;
							for(int i=0; i<7; i++) {
								if(historicoConsumo[i] > 0 || historicoGasto[i] > 0) {
									divisorConsumo++;
								}
							}
							for(int i=0; i<divisorConsumo; i++) {
								
								somaConsumo += historicoConsumo[i];
								}
							
							System.out.println("Nos últimos "+divisorConsumo+" dias, você consumiu em média "
												+ (somaConsumo/divisorConsumo) + "Kcals!");
							
						break;
					case 3:
						
						double somaGasto = 0;
						int divisorGasto = 0;
						for(int i=0; i<7; i++) {
							if(historicoConsumo[i] > 0 || historicoGasto[i] > 0) {
								divisorGasto++;
							}
						}
						for(int i=0; i<divisorGasto; i++) {
							
							somaGasto += historicoGasto[i];
							}
						
						System.out.println("Nos últimos "+divisorGasto+" dias, você gastou em média "
											+ (somaGasto/divisorGasto) + "Kcals!");
						break;
					
					
					case 4:
						break;
					default:
						System.out.println("Opção Inválida!");
						break;
					}
					
				} while (op5 > 4 || op5 < 1);
				break;

			case 6: // MÉTODO OPÇÕES
				int op6;
				do {
					System.out.println("\n\n\t\tSelecione uma opção");
					System.out.println("1 - Iniciar um novo cadastro");
					System.out.println("2 - Alterar meu peso");
					System.out.println("3 - Alterar minha idade");
					System.out.println("4 - Voltar");
					op6 = leia.nextInt();

					switch (op6) {
					case 1:
						inicioCadastro();
						break;
					case 2:
						System.out.println("Insira o novo peso:");
						peso = leia.nextDouble();
						imc = peso / (altura * altura) * 10000;

						if (sexo.equals("M")) {
							tmb = 66.5 + (13.75 * peso) + (5.003 * altura) - (6.755 * idade);
						} else if (sexo.equals("F")) {
							tmb = 655.1 + (9.563 * peso) + (1.850 * altura) - (4.676 * idade);
						}
						break;
					case 3:
						System.out.println("Insira a nova idade:");
						idade = leia.nextInt();
						imc = peso / (altura * altura) * 10000;

						if (sexo.equals("M")) {
							tmb = 66.5 + (13.75 * peso) + (5.003 * altura) - (6.755 * idade);
						} else if (sexo.equals("F")) {
							tmb = 655.1 + (9.563 * peso) + (1.850 * altura) - (4.676 * idade);
						}
						break;
					case 4:
						break;
					default:
						System.out.println("Opção Inválida!");

					}
				} while (op6 > 4 || op6 < 1);

				break;

			default:
				System.out.println("Opção Inválida!");

			}

		} while (true);

	}
}
