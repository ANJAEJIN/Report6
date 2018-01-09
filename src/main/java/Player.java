/**
 * Created by AJJ on 2017/1/9.
 */

public class Player {
    public char[][] put(String s){
        Board board = new Board();
        char[][] factor;
        factor = board.SetBoard();

        char c_x = s . charAt ( 0 );
        char c_y = s . charAt ( 2 );
        int x;
        int y;

        x = (int)c_x;
        x -= 64;
        y = (int)c_y;
        int z = (int)'0';
        y -= z;
        factor[y][x] = 'O';

        int i;
        int j;
        for (i = 0; i < factor.length; i++) {
            for ( j = 0; j < factor[i].length; j++) {
                System.out.print(factor[i][j]);
            }
            System.out.println();
        }

        return factor;
    }
}