package tictactoe;


public class Main {


        public static void main(String[] args) {


            Player player1 = new Player("Andreea ", Board.Mark.MARK_X);
            Player player2 = new Player("Andrei ", Board.Mark.MARK_0);


            TicTacToe console = new TicTacToe(player1, player2);
            console.start();

            System.out.println(console);
        }

}

