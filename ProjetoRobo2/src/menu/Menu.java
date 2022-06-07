package menu;

import game.Robo;
import game.Arena;
import game.Comida;
import java.util.Scanner;
import java.util.Random;
import exception.MovimentoInvalidoException;

public class Menu {
    public Menu() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int movimento;
        int contRobo1 = 0;
        int contRobo2 = 0;
        System.out.println("Modos dois robos se movendo aleatoriamente");
        System.out.println("Digite a cor do robo 1");
        String cor = input.nextLine();
        Robo robo1 = new Robo(cor);
        System.out.println("Digite a cor do robo 2");
        String cor2 = input.nextLine();
        Robo robo2 = new Robo(cor2);
        Arena arena = new Arena();
        System.out.println("Digite as coordenadas X e em seguida Y da comida");
        int posComidaX = input.nextInt();
        int posComidaY = input.nextInt();
        Comida comida = new Comida(posComidaX, posComidaY);

        while (true) {
            arena.exibeArena(robo1.getX(), robo1.getY(),
                    robo2.getX(), robo2.getY(), comida.getX(), comida.getY());

            if (robo1.verificaAlimento(posComidaX, posComidaY)) {
                System.out.println("Robo " + robo1.getCor() + " encontrou a comida , fim de jogo");
                break;
            } else {
                try {

                    // preMovimento = input.nextLine();

                    movimento = random.nextInt(1, 4);
                    robo1.mover(movimento);

                } catch (MovimentoInvalidoException e) {
                    System.out.println();
                    System.out.println(e + " do Robo " + robo1.getCor());
                }
                contRobo1++;
            }

            if (robo2.verificaAlimento(posComidaX, posComidaY)) {
                System.out.println("Robo " + robo2.getCor() + " encontrou a comida , fim de jogo");
                break;
            } else {
                try {
                    movimento = random.nextInt(1,4);
                    robo2.mover(movimento);

                } catch (MovimentoInvalidoException e) {
                    System.out.println();
                    System.out.println(e + " do Robo " + robo2.getCor());
                }
                contRobo2++;
            }
            System.out.println("-----------------------------------------------------------");
            try{
                Thread.sleep(1500);
            } catch(InterruptedException e){}
        }
        arena.exibeArena(robo1.getX(), robo1.getY(),
                robo2.getX(), robo2.getY(), comida.getX(), comida.getY());
        System.out.println("Parabens ! A comida foi pegue.");
        System.out.println("Movimentos do robo " + robo1.getCor() + " : " + contRobo1);
        System.out.println("Movimentos do robo " + robo2.getCor() + " : " + contRobo2);
        input.close();
    }
}