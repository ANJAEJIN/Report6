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

    public boolean finish(Board b, Location l, char c){
        int point=1;
        int i=l.x;
        int j=l.y;
        while (b.factor[j][i+1]==c && i<15){
            i +=1;
            point +=1;
        }
        i = l.x;
        while (b.factor[j][i-1]==c && i>1){
            point +=1;
            i -=1;
        }
        if (point == 5){
            return false;
        }else {
            return true;
        }
    }
}