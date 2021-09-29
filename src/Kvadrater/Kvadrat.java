package Kvadrater;

public class Kvadrat {

    public void printSquare (int num, String symbol){
        for (int i = 0; i < num; i++){
            for (int k = 0; k < num; k++){
                System.out.print(symbol + "  ");
            }
            System.out.println();
        }
    }
}
