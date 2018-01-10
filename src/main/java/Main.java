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
                player.put(board,location,turn);
                board.printBoard();
                turn = 'X';
            }if(turn == 'X'){
                String message;
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter location to put:");
                message = scan.nextLine();
                Location location = new Location(message);
                player.put(board,location,turn);
                board.printBoard();
                turn = 'O';
            }
        }
    }
}