/**
 * Created by AJJ on 2017/1/9.
 */

public class Player {
    char[][] factor;

    public Player() {
        this.factor = new char[16][16];
    }

    public char[][] put(Board b,Location l,char c){

        b.factor[l.y][l.x] = c;

        return b.factor;
    }
}