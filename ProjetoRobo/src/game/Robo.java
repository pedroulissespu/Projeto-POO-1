package game;

import exception.MovimentoInvalidoException;

public class Robo {
    protected int x = 0;
    protected int y = 0;
    protected String cor = null;

    public Robo(String cor) {
        this.cor = cor;
    }

    public Robo() {
    }

    public void mover(String movimento) throws MovimentoInvalidoException{
        if(movimento.equals("up")){
            if(y-1 < 0) throw new MovimentoInvalidoException();
            y--;
        }if(movimento.equals("down")){
            if(y+1 >= 5) throw new MovimentoInvalidoException();
            y++;
        }if(movimento.equals("right")){
            if(x+1 >= 5) throw new MovimentoInvalidoException();
            x++;
        }if(movimento.equals("left")){
            if(x-1 < 0) throw new MovimentoInvalidoException();
            x--;
        }
    }

    public void mover(int movimento) throws MovimentoInvalidoException{
        if(movimento == 1){
            if(y-1 < 0) throw new MovimentoInvalidoException();
            y--;
        }
        if(movimento == 2){
            if(y+1 >= 5) throw new MovimentoInvalidoException();
            y++;
        }
        if(movimento == 3){
            if(x+1 >= 5) throw new MovimentoInvalidoException();
            x++;
        }
        if(movimento == 4){
            if(x-1 < 0) throw new MovimentoInvalidoException();
            x--;
        }
    }

    public boolean verificaAlimento(int posComidaX , int posComidaY){
        if(x == posComidaX && y == posComidaY){
            return true;
        }

        return false;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getCor() {
        return cor;
    }
}