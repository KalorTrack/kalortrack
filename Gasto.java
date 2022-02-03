package ProjetoG2;

import java.util.Scanner;

public class Gasto{
    
    Scanner leia = new Scanner(System.in);

    //atributo
    private double kcalGastoDia;
     
    //metodo construtor
    public Gasto () {
    
     }


    //variável
    int opcExerc, tempo;
    double kcalExerc;
    
    //método simples
    public void listaExercícios() {
        System.out.println("\n\t\tESCOLHA SEU EXERCÍCIO");
        System.out.println("\n1-Caminhada");
        System.out.println("2-Corrida");
        System.out.println("3-Bicicleta");
        System.out.println("4-Musculação");
        System.out.println("5-Alongamento");
        System.out.println("6-Volta");
        
        do {
            opcExerc = leia.nextInt();
            switch (opcExerc) {
            case 1:
                kcalExerc = 10;
                System.out.println("\nPor quantos minutos você praticou esse exercício?");
                tempo = leia.nextInt();
                kcalGastoDia += kcalExerc * tempo;
                System.out.println("Você gastou" + kcalGastoDia + " Kcal! Continue assim!");
                break;

            case 2:
                kcalExerc = 5;
                System.out.println("\nPor quantos minutos você praticou esse exercício?");
                tempo = leia.nextInt();
                kcalGastoDia += kcalExerc * tempo;
                System.out.println("Você gastou" + kcalGastoDia + " Kcal! Continue assim!");
                break;

            case 3:
                kcalExerc = 15;
                System.out.println("\nPor quantos minutos você praticou esse exercício?");
                tempo = leia.nextInt();
                kcalGastoDia += kcalExerc * tempo;
                System.out.println("Você gastou" + kcalGastoDia + " Kcal! Continue assim!");
                break;

            case 4:
                kcalExerc = 20;
                System.out.println("\nPor quantos minutos você praticou esse exercício?");
                tempo = leia.nextInt();
                kcalGastoDia += kcalExerc * tempo;
                System.out.println("Você gastou" + kcalGastoDia + " Kcal! Continue assim!");
                break;

            case 5:
                kcalExerc = 7;
                System.out.println("\nPor quantos minutos você praticou esse exercício?");
                tempo = leia.nextInt();
                kcalGastoDia += kcalExerc * tempo;
                System.out.println("Você gastou" + kcalGastoDia + " Kcal! Continue assim!");
                break;

            case 6:
                break;

            default:
                System.out.println("\nOpção inválida! Por favor selecione outra opção:");
                break;
            }
        } while (opcExerc > 6 || opcExerc < 0);
    }

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
    
    //Getter & Setter
    
     
}