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
        int point1=1;
        int point2=1;
        int point3=1;
        int point4=1;
        int i=l.x;
        int j=l.y;
        /*horizontal*/
        while (b.factor[j][i+1]==c && i<15){
            i +=1;
            point1 +=1;
        }
        i = l.x;
        while (b.factor[j][i-1]==c && i>1){
            point1 +=1;
            i -=1;
        }
        /*Vertical*/
        while (b.factor[j+1][i]==c && j<15){
            j +=1;
            point2 +=1;
        }
        j = l.y;
        while (b.factor[j-1][i]==c && j>1){
            point2 +=1;
            j -=1;
        }
        /*diagonal1*/
        while (b.factor[j+1][i+1]==c && j<15 && i<15){
            i +=1;
            j +=1;
            point3 +=1;
        }
        i = l.x;
        j = l.y;
        while (b.factor[j-1][i-1]==c && j>1 && i>1){
            point3 +=1;
            i -=1;
            j -=1;
        }
        /*diagonal2*/
        while (b.factor[j+1][i-1]==c && j<15 && i>1){
            i -=1;
            j +=1;
            point4 +=1;
        }
        i = l.x;
        j = l.y;
        while (b.factor[j-1][i+1]==c && j>1 && i<15){
            point4 +=1;
            i +=1;
            j -=1;
        }

        if (point1 == 5 || point2 == 5 || point3 == 5 || point4 == 5){
            System.out.println("winner is"+c+". Congratulations");
            return false;
        }else {
            return true;
        }
    }
}