package game;
import exception.MovimentoInvalidoException;

public class RoboInteligente extends Robo{
    private boolean verificadorUp = false;
    private boolean verificadorDown = false;
    private boolean verificadorRight = false;
    private boolean verificadorLeft = false;

    public RoboInteligente(String cor){
        super(cor);
    }

    public void mover(String movimento) throws MovimentoInvalidoException{
        if(movimento.equals("up")){
            if(y-1 < 0 && !verificadorUp) {
                verificadorUp = true;
                throw new MovimentoInvalidoException();
            } else if(y-1 < 0 && verificadorUp){
                y++;
            }
            y--;
        }else if(movimento.equals("down")){
            if(y+1 >= 5 && !verificadorDown){
                verificadorDown = true;
                throw new MovimentoInvalidoException();
            } else if(y+1 >= 5 && verificadorDown){
                y--;
            }
            y++;
        }else if(movimento.equals("right")){
            if(x+1 >= 5 && !verificadorRight) {
                verificadorRight = true;
                throw new MovimentoInvalidoException();
            } else if(x+1 >= 5 && verificadorRight){
                x--;
            }
            x++;
        }else if(movimento.equals("left")){
            if(x-1 < 0 && !verificadorLeft){
                verificadorLeft = true;
                throw new MovimentoInvalidoException();
            } else if(x-1 < 0 && verificadorLeft){
                x++;
            }
            x--;
        }
    }

    public void mover(int movimento) throws MovimentoInvalidoException{
        if(movimento == 1){
            if(y-1 < 0 && !verificadorUp) {
                verificadorUp = true;
                throw new MovimentoInvalidoException();
            } else if(y-1 < 0 && verificadorUp){
                y++;
                return;
            }
            y--;
        }
        else if(movimento == 2){
            if(y+1 >= 5 && !verificadorDown){
                verificadorDown = true;
                throw new MovimentoInvalidoException();
            } else if(y+1 >= 5 && verificadorDown){
                y--;
                return;
            }
            y++;
        }
        else if(movimento == 3){
            if(x+1 >= 5 && !verificadorRight) {
                verificadorRight = true;
                throw new MovimentoInvalidoException();
            } else if(x+1 >= 5 && verificadorRight){
                x--;
                return;
            }
            x++;
        }
        else if(movimento == 4){
            if(x-1 < 0 && !verificadorLeft){
                verificadorLeft = true;
                throw new MovimentoInvalidoException();
            } else if(x-1 < 0 && verificadorLeft){
                x++;
                return;
            }
            x--;
        }
    }
}