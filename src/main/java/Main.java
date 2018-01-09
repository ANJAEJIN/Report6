/**
 * Created by AJJ on 2017/12/12.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Board board = new Board();
        Player player = new Player();
        board.printBoard();

        String message;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter location to put:");
        message = scan.nextLine();
        player.put(message);
    }
}