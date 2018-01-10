/**
 * Created by AJJ on 2017/12/12.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Board board = new Board();
        Player player = new Player();

        board.SetBoard();
        board.printBoard();

        char turn = 'O';
        while(true) {
            if (turn == 'O'){
                String message;
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter location to put:");
                message = scan.nextLine();
                Location location = new Location(message);
                if(player.judge(board,location)){
                    player.put(board,location,turn);
                    turn = 'X';
                }else{
                    System.out.println("Duplicate.\n" + "Please enter another location:");
                    turn = 'O';
                }
                board.printBoard();
            }if(turn == 'X'){
                String message;
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter location to put:");
                message = scan.nextLine();
                Location location = new Location(message);
                if(player.judge(board,location)){
                    player.put(board,location,turn);
                    turn = 'O';
                }else{
                    System.out.println("Duplicate.\n" + "Please enter another location:");
                    turn = 'X';
                }
                board.printBoard();
            }
        }
    }
}