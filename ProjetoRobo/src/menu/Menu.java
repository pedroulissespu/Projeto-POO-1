package menu;
import game.Robo;
import game.Arena;
import game.Comida;
import java.util.Scanner;
import exception.MovimentoInvalidoException;

public class Menu {
    public Menu(){
        Scanner input = new Scanner(System.in);
        String preMovimento;
        System.out.println("Modo robo controlado para pegar comida");
        System.out.println("Digite a cor do robo");
        String cor = input.nextLine();
        Robo robo = new Robo(cor);
        Arena arena = new Arena();
        System.out.println("Digite as coordenadas x e y da comida");
        int posComidaX = input.nextInt();
        int posComidaY = input.nextInt();
        Comida comida = new Comida(posComidaX, posComidaY);

        while(true){
            arena.exibeArena(robo.getX(), robo.getY(), comida.getX(), comida.getY());          
            try {

                System.out.println("Digite o proximo movimento : ");
                preMovimento = input.nextLine();
                
                if(preMovimento.matches("-?\\d+")) {
                    int movimento = Integer.parseInt(preMovimento);
                    robo.mover(movimento);
                }
                else robo.mover(preMovimento);

            } catch (MovimentoInvalidoException e) {
                System.out.println();
                System.out.println(e + " do robo " + robo.getCor());
            }
            if (robo.verificaAlimento(posComidaX, posComidaY))
                break;
            
            System.out.println("-----------------------------------------------------------");
        }
        arena.exibeArena(robo.getX(),robo.getY(),comida.getX(),comida.getY());
        System.out.println("Parabens ! O robo "+ robo.getCor() +" pegou a comida");
        input.close();
    }
}