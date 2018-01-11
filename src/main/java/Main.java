/**
 * Created by AJJ on 2017/12/12.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*Declare and prepare the required objects*/
        Board board = new Board();
        Player player = new Player();
        boolean finish=true;
        Location location = new Location();

        /*Board Basic Settings*/
        board.SetBoard();
        /*Output Board*/
        board.printBoard();

        /*Initialization of Turn*/
        char turn = 'O';

        /*Play alternately between two players before finish*/
        while(finish) {
            if (turn == 'O'){
                /*Receive message input
                The form (alphabet, number)*/
                String message;
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter location to put:");
                message = scan.nextLine();
                location.SetLocation(message);
                if(player.judge(board,location)){
                    player.put(board,location,turn);
                    finish = player.finish(board,location,turn);
                    turn = 'X';
                }else{
                    System.out.println("Duplicate.\n" + "Please enter another location:");
                    turn = 'O';
                }
                board.printBoard();
            }else if(turn == 'X'){
                String message;
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter location to put:");
                message = scan.nextLine();
                location.SetLocation(message);
                if(player.judge(board,location)){
                    player.put(board,location,turn);
                    finish = player.finish(board,location,turn);
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