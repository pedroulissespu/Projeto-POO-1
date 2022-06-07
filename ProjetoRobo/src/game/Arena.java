package game;

public class Arena {
    private char[][] arena = new char[5][5];

    public Arena(){
        zerarArena();
    }

    public void zerarArena(){
        for(int i = 0 ; i < 5 ; i++)
            for(int j = 0 ; j < 5 ; j++)
                arena[i][j] = '*';
    }

    public void exibeArena(int posRoboX , int posRoboY,int posComidaX, int posComidaY){
        System.out.println();
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                if(i == posRoboY && j == posRoboX) System.out.print("a ");
                else if(i == posComidaY && j == posComidaX) System.out.print("Q ");
                else System.out.print(arena[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}