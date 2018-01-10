/**
 * Created by AJJ on 2017/1/9.
 */

public class Player {
    public char[][] put(String s,char c){
        Board board = new Board();
        char[][] factor;
        factor = board.SetBoard();

        if (s.length()==3){
            int x;
            int y;
            char c_x = s . charAt ( 0 );
            char c_y = s . charAt ( 2 );
            x = (int)c_x;
            x -= 64;
            y = (int)c_y;
            int z = (int)'0';
            y -= z;
            factor[y][x] = c;
        }else{
            if(s.length()==4){
                int x;
                int y;
                int y1;
                int y2;
                char c_x = s . charAt ( 0 );
                char c_y1 = s . charAt ( 2 );
                char c_y2 = s . charAt ( 3 );
                x = (int)c_x;
                x -= 64;
                y1 = (int)c_y1;
                y2 = (int)c_y2;
                int z = (int)'0';
                y1 -= z;
                y2 -= z;
                y = 10*y1 + y2;
                factor[y][x] = c;
            }else{
                System.out.println("Please enter location again:");
            }
        }

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