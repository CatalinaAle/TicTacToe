package tictactoe;

abstract class Arbiter implements Readable {

    Board c;
    Player p1;
    Player p2;
    boolean xTurn;

    Arbiter(Player a, Player b) {
        c = new Board();
        this.p1 = a;
        this.p2 = b;
        this.xTurn = true;

    }

    @Override
    public String toString() {
        return p1 + "  " + p2;


    }

    public Player start() {
        int coord[];

        while (true) {
            coord =  getCoord();
            c.move(coord[0], coord[1], xTurn ? Board.Mark.MARK_X : Board.Mark.MARK_0);
            if (xTurn == true) {
                xTurn = false;
            } else if (xTurn == false) {
                xTurn = true;

            }

            if(c.isGameOver(coord[0], coord[1])) {
                break;

            }

            System.out.println(c);
        }
        System.out.println(c);

        Board.Mark aux = c.getWinner(coord[0], coord[1]);

        if (aux == p1.getSymbol()){
            System.out.println("Felicitari ai castigat " + p1);
        }else {
            System.out.println("Felicitari ai castigat " + p2);
        }

        return null;

    }
}