package com.example.daniyar.krestikinoliki;

/**
 * Created by daniyar on 2/12/18.
 */

class XoModel {
    public static final int PLAYER_X = 1;
    public static final int PLAYER_O = 2;
    private static final int NO_WINNER = 0;
    
    
    private int player;
    private int winner;
    private boolean isWinner = false;
    private boolean isDraw = false;
    private int[][] field;
    
    public XoModel(){
        field = new int[3][3];
        player = PLAYER_X;
        winner = NO_WINNER;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player){
        this.player = player;
    }

    public void changePlayer(){
        if(player == PLAYER_O)
            player = PLAYER_X;
        else
            player = PLAYER_O;
    }

    public int getWinner() {
        return winner;
    }

    public int[][] getField() {
        return field;
    }

    public void fillField(int x, int y, int player){
        field[x][y] = player;
        checkWinner();
    }

    public boolean hasWinner(){
        if(isWinner)
            System.out.println("Player " + player + " is a winner");
        return isWinner;
    }

    public void playerMove(int x, int y){
        field[x][y] = player;
        checkWinner();

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(field[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("-----");
    }

    private void checkWinner(){
        //check horizontal
        if(field[0][0] == 1 && field[1][0] == 1 && field[2][0] == 1)
            isWinner = true;
        else if(field[0][1] == 1 && field[1][1] == 1 && field[2][1] == 1)
            isWinner = true;
        else if(field[0][2] == 1 && field[1][2] == 1 && field[2][2] == 1)
            isWinner = true;
        else if(field[0][0] == 2 && field[1][0] == 2 && field[2][0] == 2)
            isWinner = true;
        else if(field[0][1] == 2 && field[1][1] == 2 && field[2][1] == 2)
            isWinner = true;
        else if(field[0][2] == 2 && field[1][2] == 2 && field[2][2] == 2)
            isWinner = true;
        //check vertical
        else if(field[0][0] == 1 && field[0][1] == 1 && field[0][2] == 1)
            isWinner = true;
        else if(field[1][0] == 1 && field[1][1] == 1 && field[1][2] == 1)
            isWinner = true;
        else if(field[2][0] == 1 && field[2][1] == 1 && field[2][2] == 1)
            isWinner = true;
        else if(field[0][0] == 2 && field[0][1] == 2 && field[0][2] == 2)
            isWinner = true;
        else if(field[1][0] == 2 && field[1][1] == 2 && field[1][2] == 2)
            isWinner = true;
        else if(field[2][0] == 2 && field[2][1] == 2 && field[2][2] == 2)
            isWinner = true;
        //check diagonal
        else if(field[0][0] == 1 && field[1][1] == 1 && field[2][2] == 1)
            isWinner = true;
        else if(field[0][0] == 2 && field[1][1] == 2 && field[2][2] == 2)
            isWinner = true;
        else if(field[2][0] == 1 && field[1][1] == 1 && field[0][2] == 1)
            isWinner = true;
        else if(field[2][0] == 2 && field[1][1] == 2 && field[0][2] == 2)
            isWinner = true;

    }

    public boolean isDraw(){
        boolean filled = true;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(field[j][i] == 0)
                    filled = false;
            }
        }
        return filled && !isWinner;
    }

}

