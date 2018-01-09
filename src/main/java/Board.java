/**
 * Created by AJJ on 2017/1/9.
 */

public class Board {
    int i=0;
    int j=0;

    public char[][] SetBoard() {
        char[][] factor;
        factor = new char[16][16];

        for (i = 1; i < factor.length; i++) {
            if (i<10){
                int x = (int)'0';
                x += i;
                factor[i][0] = (char)x;
            }else {
                int x = (int)'0';
                x += i-10;
                factor[i][0] = (char)x;
            }
        }
        for (i = 1; i < factor.length; i++) {
            factor[0][i] = (char)(i+64);
        }
        return factor;
    }

    public void printBoard(){
        char[][] factor;
        factor = SetBoard();
        for (i = 0; i < factor.length; i++) {
            for ( j = 0; j < factor[i].length; j++) {
                System.out.print(factor[i][j]);
            }
            System.out.println();
        }
    }
}
