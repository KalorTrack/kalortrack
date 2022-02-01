package ProjetoG2;

import java.util.Scanner;  //

public class cadastro {
	
	Scanner leia = new Scanner(System.in);
	
	Consumo consumo = new Consumo();
	
	Gasto gasto = new Gasto();
	
	private String nome, sexo;
	private int idade, op = 0, altura;
	private double peso, imc = 0, tmb = 0;
	
	
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
		
		imc = peso / (altura*altura)*10000;
		
	
		if (sexo.equals("M")) {
			tmb = 66.5 + (13.75 * peso) + (5.003 * altura) - (6.755 * idade);
		}
		else if (sexo.equals("F")) {
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
		
		switch(opApp) {
		
		case 1: // MÉTODO NOVO DIA
			break;
			
		case 2: 
			
			consumo.listaAlimentos();
			
			break;
			
		case 3:
			
			gasto.listaExercícios();
			
			break;
			
		case 4: // MÉTODO DIÁRIO
			break;
			
		case 5: // MÉTODO HISTÓRICO
			break;
			
		case 6: // MÉTODO OPÇÕES
			break;
			
			default: 
				System.out.println("Opção Inválida!");

		}
		
		
		
	} 	while(true);

}
}
