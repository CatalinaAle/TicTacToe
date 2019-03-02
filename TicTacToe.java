package tictactoe;

import java.util.Scanner;

public class TicTacToe extends Arbiter {

    Scanner sc;

    public TicTacToe(Player a, Player b){
        super(a,b);

        sc = new Scanner(System.in);
    }

    public int [] getCoord(){
        int row = sc.nextInt();
        int col =sc.nextInt();

        return new int[] {row,col};
    }
}



