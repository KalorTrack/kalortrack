package ProjetoG2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gasto {

	public Gasto() {
	}

	Scanner leia = new Scanner(System.in);

	// atributo
	private double kcalGastoDia;

	// variável
	int opcExerc, tempo;
	double kcalExerc;
	boolean continueLoop = true;

	// método simples
	public void listaExercícios() {
		do {
			continueLoop = true;
			try {

				System.out.println("\n\t\tESCOLHA SEU EXERCÍCIO");
				System.out.println("\n1-Caminhada");
				System.out.println("2-Corrida");
				System.out.println("3-Bicicleta");
				System.out.println("4-Musculação");
				System.out.println("5-Alongamento");
				System.out.println("6-Volta");

				opcExerc = leia.nextInt();
				continueLoop = false;

			} catch (InputMismatchException ex) {
				System.err.println("Opção inválida, entre com um valor válido");
				leia.nextLine();
			}
		} while (continueLoop);

		do {
			switch (opcExerc) {
			case 1:
				System.out.println("\nPor quantos minutos você praticou esse exercício?");
				tempo = leia.nextInt();
				kcalExerc = 3.3 * /* getPeso() */tempo;
				kcalGastoDia += kcalExerc;
				System.out.println("Você gastou" + kcalGastoDia + " Kcal! Continue assim!");
				break;

			case 2:
				System.out.println("\nPor quantos minutos você praticou esse exercício?");
				tempo = leia.nextInt();
				kcalExerc = 8 * /* getPeso() */tempo;
				kcalGastoDia += kcalExerc;
				System.out.println("Você gastou" + kcalGastoDia + " Kcal! Continue assim!");
				break;

			case 3:
				System.out.println("\nPor quantos minutos você praticou esse exercício?");
				tempo = leia.nextInt();
				kcalExerc = 8 * /* getPeso() */tempo;
				kcalGastoDia += kcalExerc;
				System.out.println("Você gastou" + kcalGastoDia + " Kcal! Continue assim!");
				break;

			case 4:
				System.out.println("\nPor quantos minutos você praticou esse exercício?");
				tempo = leia.nextInt();
				kcalExerc = 5.5 * /* getPeso() */tempo;
				kcalGastoDia += kcalExerc;
				System.out.println("Você gastou" + kcalGastoDia + " Kcal! Continue assim!");
				break;

			case 5:
				System.out.println("\nPor quantos minutos você praticou esse exercício?");
				tempo = leia.nextInt();
				kcalExerc = 2.5 * /* getPeso() */tempo;
				kcalGastoDia += kcalExerc;
				;
				System.out.println("Você gastou" + kcalGastoDia + " Kcal! Continue assim!");
				break;

			case 6:
				break;

			default:
				System.err.println("Opção inválida, entre com um valor válido");
				break;
			}
		} while (opcExerc > 6 || opcExerc < 0);
	}

	// Getter & Setter
	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public double getKcalGastoDia() {
		return kcalGastoDia;
	}

	public void setKcalGastoDia(double kcalGastoDia) {
		this.kcalGastoDia = kcalGastoDia;
	}

	public int getOpcExerc() {
		return opcExerc;
	}

	public void setOpcExerc(int opcExerc) {
		this.opcExerc = opcExerc;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public double getKcalExerc() {
		return kcalExerc;
	}

	public void setKcalExerc(double kcalExerc) {
		this.kcalExerc = kcalExerc;
	}

}