package tictactoe;

public class Player {

    private String name;
    private Board.Mark symbol;

    public Player(String name,Board.Mark symbol ){
        this.name = name;
        this.symbol = symbol;
    }

    public Board.Mark getSymbol(){
        return symbol;
    }

    @Override
    public String toString(){
        return name + symbol;
    }
}
