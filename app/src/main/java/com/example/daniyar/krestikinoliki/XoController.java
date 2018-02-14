package com.example.daniyar.krestikinoliki;

/**
 * Created by daniyar on 2/12/18.
 */

class XoController {

    XoModel xoModel;
    private int[][] field;

    public XoController(XoModel xoModel){
        this.xoModel = xoModel;
        this.field = xoModel.getField();
    }


    public void playerMove(int x, int y) {

        //if(field[x][y] == 0) {
            xoModel.fillField(x, y, xoModel.getPlayer());
            xoModel.changePlayer();
        //}

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(field[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("-----");
    }

}
