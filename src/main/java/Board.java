/**
 * Created by AJJ on 2017/1/9.
 */

public class Board {
    int i=0;
    int j=0;
    char[][] factor;

    public Board () {
        this.factor = new char[16][16];
    }

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

    public void printBoard(){
        for (i = 0; i < factor.length; i++) {
            for ( j = 0; j < factor[i].length; j++) {
                System.out.print(this.factor[i][j]);
            }
            System.out.println();
        }
    }
}