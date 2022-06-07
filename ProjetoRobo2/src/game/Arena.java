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

    public void exibeArena(int posRobo1X , int posRobo1Y,int posRobo2X , int posRobo2Y,
    int posComidaX, int posComidaY){
        System.out.println();
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                if((i == posRobo1Y && i == posRobo2Y) && (j == posRobo1X && j == posRobo2X))
                    System.out.print("ab");
                else if(i == posRobo1Y && j == posRobo1X) System.out.print("a ");
                else if(i == posRobo2Y && j == posRobo2X) System.out.print("b ");
                else if(i == posComidaY && j == posComidaX) System.out.print("Q ");
                else System.out.print(arena[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}