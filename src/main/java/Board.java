/**
 * Created by AJJ on 2017/1/9.
 */

public class Board {
    int i=0;
    int j=0;
    char[][] factor;

    /*Prepare a 15 * 15 checkerboard by the International gomoku rules.*/
    public Board () {
        this.factor = new char[16][16];
    }

    /*Coordinate information is displayed on the border
    so that the coordinate information can be easily understood.
    The X axis is alphabet and the Y axis is number*/
    public void SetBoard() {
        for (i = 1; i < factor.length; i++) {
            if (i<10){
                int x = (int)'0';
                x += i;
                this.factor[i][0] = (char)x;
            }else {
                int x = (int)'0';
                x += i-10;
                this.factor[i][0] = (char)x;
            }
        }
        for (i = 1; i < factor.length; i++) {
            this.factor[0][i] = (char)(i+64);
        }
    }

    /*Methods to print the current board*/
    public void printBoard(){
        for (i = 0; i < factor.length; i++) {
            for ( j = 0; j < factor[i].length; j++) {
                System.out.print(this.factor[i][j]);
            }
            System.out.println();
        }
    }
}