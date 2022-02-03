package ProjetoG2;

import java.util.Scanner;

public class Consumo {

    Scanner leia = new Scanner(System.in);

    // atributo
    private double kcalConsumoDia;

    // metodo construtor
    public Consumo() {

    }

    // variável
    int opcAli, unidade;
    double kcalAli;

    // método simples
    public void listaAlimentos() {

        do {
            System.out.println("\n\t\tESCOLHA SEU ALIMENTO");
            System.out.println("\n1-Arroz");
            System.out.println("2-Feijão");
            System.out.println("3-Frango");
            System.out.println("4-Macarronada");
            System.out.println("5-Pão");
            System.out.println("6-Volta");
            
            opcAli = leia.nextInt();
            switch (opcAli) {
            case 1:
                kcalAli = 100;
                System.out.println("\nQuantas escumadeiras de arroz você comeu?");
                unidade = leia.nextInt();
                kcalConsumoDia += kcalAli * unidade;
                break;

            case 2:
                kcalAli = 50;
                System.out.println("\nQuantas conchas de feijão você comeu?");
                unidade = leia.nextInt();
                kcalConsumoDia += kcalAli * unidade;
                break;

            case 3:
                kcalAli = 150;
                System.out.println("\nQuantos filés de frango você comeu?");
                unidade = leia.nextInt();
                kcalConsumoDia += kcalAli * unidade;
                break;

            case 4:
                kcalAli = 200;
                System.out.println("\nQuantas escumadeiras de macarronada você comeu?");
                unidade = leia.nextInt();
                kcalConsumoDia += kcalAli * unidade;
                break;

            case 5:
                kcalAli = 70;
                System.out.println("\nQuantos pães você comeu?");
                unidade = leia.nextInt();
                kcalConsumoDia += kcalAli * unidade;
                break;

            case 6:
                break;

            default:
                System.out.println("\nOpção inválida! Por favor selecione outra opção:");
                break;
            }
        } while (opcAli != 6);
    }

    // Getter & Setter
    public double getKcalConsumoDia() {
        return kcalConsumoDia;
    }

    public void setKcalConsumoDia(double kcalConsumoDia) {
        this.kcalConsumoDia = kcalConsumoDia;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }

    public int getOpcAli() {
        return opcAli;
    }

    public void setOpcAli(int opcAli) {
        this.opcAli = opcAli;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public double getKcalAli() {
        return kcalAli;
    }

    public void setKcalAli(double kcalAli) {
        this.kcalAli = kcalAli;
    }
    // teste
}