/**
 * Created by AJJ on 2017/1/9.
 */

public class Player {
    char[][] factor;

    public Player() {
        this.factor = new char[16][16];
    }

    public void put(Board b,Location l,char c){
        b.factor[l.y][l.x] = c;
    }

    public boolean judge(Board b,Location l){
        return b.factor[l.y][l.x] != 'O' && b.factor[l.y][l.x] != 'X';
    }
}