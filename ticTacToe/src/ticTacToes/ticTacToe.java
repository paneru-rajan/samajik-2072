/*
TicTacToe game by Diwas KC
Roll no. 8
Samajik College of IT

 */


package ticTacToes;

import javax.swing.*;
import java.util.Random;

public class ticTacToe {

    public static char board[][] = new char[3][3]; // defining board values
    public static int counter = 1;
    public static String firstMove;
    public static boolean end = false;
    public static char winner;


    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        String first = JOptionPane.showInputDialog("Who goes First ? Press H for Human, C for Computer ");

//Option for Human Going First

        // <editor-fold desc="For Human Goes First">
        if (first.equals("H")) {
            System.out.println("Human goes first");

            System.out.println();

            String move = JOptionPane.showInputDialog("Enter Your Next move");

            //<editor-fold desc="moves for humans">
            if(move.equals("00") && board[0][0] == '-'){
                board[0][0] = '0';
            }
            else if(move.equals("01") && board[0][1] == '-'){
                board[0][1] = '0';
            }
            else if(move.equals("02") && board[0][2] == '-'){
                board[0][2] = '0';
            }
            else if(move.equals("10") && board[1][0] == '-'){
                board[1][0] = '0';
            }
            else if(move.equals("11") && board[1][1] == '-'){
                board[1][1] = '0';
            }
            else if(move.equals("12") && board[1][2] == '-'){
                board[1][2] = '0';
            }
            else if(move.equals("20") && board[2][0] == '-'){
                board[2][0] = '0';
            }
            else if(move.equals("21") && board[2][1] == '-'){
                board[2][1] = '0';
            }
            else if(move.equals("22") && board[2][2] == '-'){
                board[2][2] = '0';
            }
            else{
                System.out.println("Invalid Move.");
            }

            //</editor-fold>

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();

            }
            System.out.println();



            while(!end){

                hmove();

                end = whoWOn();
                if(end){
                    break;
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();

                }
                move = JOptionPane.showInputDialog("Enter your Next move");

                //<editor-fold desc="moves for humans">
                if(move.equals("00") && board[0][0] == '-'){
                    board[0][0] = '0';
                }
                else if(move.equals("01") && board[0][1] == '-'){
                    board[0][1] = '0';
                }
                else if(move.equals("02") && board[0][2] == '-'){
                    board[0][2] = '0';
                }
                else if(move.equals("10") && board[1][0] == '-'){
                    board[1][0] = '0';
                }
                else if(move.equals("11") && board[1][1] == '-'){
                    board[1][1] = '0';
                }
                else if(move.equals("12") && board[1][2] == '-'){
                    board[1][2] = '0';
                }
                else if(move.equals("20") && board[2][0] == '-'){
                    board[2][0] = '0';
                }
                else if(move.equals("21") && board[2][1] == '-'){
                    board[2][1] = '0';
                }
                else if(move.equals("22") && board[2][2] == '-'){
                    board[2][2] = '0';
                }
                else{
                    System.out.println("Invalid Move.");
                }

                //</editor-fold>
                System.out.println();
                end = whoWOn();





            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();

            }


            if(winner == '0'){
                System.out.println("Human Wins");
            }
            else if (winner == 'X'){
                System.out.println("Computer Wins");
            }
            else if(winner =='d'){
                System.out.println("Match is Draw");
            }



        }

// </editor-fold>



     // <editor-fold desc="For Computer Goes First">
        else if (first.equals("C")) {
            System.out.println("Computer goes First");
            move();
            while (!end) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();

                }
                System.out.println();
                Thread.sleep(1000);

                // Getting the human input
                //<editor-fold desc ="Human Input">

                String move = JOptionPane.showInputDialog("Enter Your move:");

                if (move.equals("00") && board[0][0] == '-') {
                    board[0][0] = '0';
                } else if (move.equals("01") && board[0][1] == '-') {
                    board[0][1] = '0';
                } else if (move.equals("02") && board[0][2] == '-') {
                    board[0][2] = '0';
                } else if (move.equals("10") && board[1][0] == '-') {
                    board[1][0] = '0';
                } else if (move.equals("11") && board[1][1] == '-') {
                    board[1][1] = '0';
                } else if (move.equals("12") && board[1][2] == '-') {
                    board[1][2] = '0';
                } else if (move.equals("20") && board[2][0] == '-') {
                    board[2][0] = '0';
                } else if (move.equals("21") && board[2][1] == '-') {
                    board[2][1] = '0';
                } else if (move.equals("22") && board[2][2] == '-') {
                    board[2][2] = '0';
                } else {
                    System.out.println("Invalid Move.");
                }
                // </editor-fold>

                //Getting the Computer Input
                // <editor-fold desc="Computer Input">

                move();
                //</editor-fold>

            }

            System.out.println();
            end = whoWOn();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();

            }
            if (winner == '0') {
                System.out.println("Human Wins");
            } else if (winner == 'X') {
                System.out.println("Computer Wins");
            } else if (winner == 'd') {
                System.out.println("Match is Draw");
            }
        }
        // </editor-fold>

//For Wrong Input
        //<editor-fold desc="Invalid Input">
         else {
            System.out.println("Invalid Input, Program will close now...");
        }
        // </editor-fold>


    }               //end of psvm



    public static void move() {


        Random rand = new Random();
        int f = rand.nextInt(4) + 1;

// First Move for Computer
        // <editor-fold desc="First Move">

        if (counter == 1) {


            if (f == 1) {
                board[0][0] = 'X';
                firstMove = "00";
            } else if (f == 2) {
                board[0][2] = 'X';
                firstMove = "02";

            } else if (f == 3) {
                board[2][0] = 'X';
                firstMove = "20";
            } else if (f == 4) {
                board[2][2] = 'X';
                firstMove = "22";
            } else {
                board[2][2] = 'X';
                firstMove = "22";
            }
        }
        //  </editor-fold>

//Secound Move for Computer

        // <editor-fold desc="Second Move">
        if (counter == 2) {
            if (board[1][1] == '-') {
                board[1][1] = 'X';
            } else {
                if (firstMove.equals("00")) {
                    board[0][2] = 'X';
                } else if (firstMove.equals("02")) {
                    board[2][2] = 'X';
                } else if (firstMove.equals("22")) {
                    board[2][0] = 'X';

                } else if (firstMove.equals("20")) {
                    board[0][0] = 'X';
                }
            }
            end = whoWOn();
        }
//</editor-fold>

//Third move for computer

        //<editor-fold desc="Remaining Moves">
        if (counter == 3) {

            int second[] = thirdMove();
            if (second[0] != 5) {

                board[second[0]][second[1]] = 'X';

            } else {
                int secondOff[] = offMove();
                if (secondOff[0] != 5) {
                    board[secondOff[0]][secondOff[1]] = 'X';
                } else {
                    secondOff = noOption();
                    board[secondOff[0]][secondOff[1]] = 'X';
                }


            }
            end = whoWOn();
        }
        // </editor-fold>

//Fouth Move for Computer

        //<editor-fold desc="Remaining Moves with counter 4">
        if (counter == 4) {

            int second[] = thirdMove();
            if (second[0] != 5) {

                board[second[0]][second[1]] = 'X';

            } else {
                int secondOff[] = offMove();
                if (secondOff[0] != 5) {
                    board[secondOff[0]][secondOff[1]] = 'X';
                } else {
                    secondOff = noOption();
                    board[secondOff[0]][secondOff[1]] = 'X';
                }


            }
        }
        // </editor-fold>

//Fifth Move for Computer
        //<editor-fold desc="Remaining Moves with counter 5">
        if (counter == 5) {

            int second[] = thirdMove();
            if (second[0] != 5) {

                board[second[0]][second[1]] = 'X';

            } else {
                int secondOff[] = offMove();
                if (secondOff[0] != 5) {
                    board[secondOff[0]][secondOff[1]] = 'X';
                } else {
                    secondOff = noOption();
                    board[secondOff[0]][secondOff[1]] = 'X';
                }


            }
            end = whoWOn();
        }
        // </editor-fold>



        counter++;

        }   // end of function move


// Module for Defensive Operation
        // <editor-fold desc="defensive operation">
        public static  int[] thirdMove() {

            int[] ret = new int[2];
            ret[0] = 5;

            if (board[0][0] == '0' && board[0][1] == '0' && board[0][2] == '-') {
                ret[0] = 0;
                ret[1] = 2;

            } else if (board[0][0] == '0' && board[1][0] == '0' && board[2][0] == '-') {
                ret[0] = 2;
                ret[1] = 0;

            } else if (board[0][0] == '0' && board[1][1] == '0' && board[2][2] == '-') {
                ret[0] = 2;
                ret[1] = 2;

            } else if (board[0][1] == '0' && board[0][2] == '0' && board[0][0] == '-') {
                ret[0] = 0;
                ret[1] = 0;

            } else if (board[0][1] == '0' && board[1][1] == '0' && board[2][1] == '-') {
                ret[0] = 1;
                ret[1] = 1;
            } else if (board[0][2] == '0' && board[1][1] == '0' && board[2][0] == '-') {
                ret[0] = 2;
                ret[1] = 0;

            } else if (board[0][2] == '0' && board[1][2] == '0' && board[2][2] == '-') {
                ret[0] = 2;
                ret[1] = 2;

            } else if (board[1][0] == '0' && board[1][1] == '0' && board[1][2] == '-') {
                ret[0] = 1;
                ret[1] = 2;

            } else if (board[1][0] == '0' && board[2][0] == '0' && board[0][0] == '-') {
                ret[0] = 0;
                ret[1] = 0;

            } else if (board[2][0] == '0' && board[1][1] == '0' && board[0][2] == '-') {
                ret[0] = 0;
                ret[1] = 2;

            } else if (board[2][1] == '0' && board[1][1] == '0' && board[0][1] == '-') {
                ret[0] = 0;
                ret[1] = 1;

            } else if (board[2][2] == '0' && board[1][1] == '0' && board[0][0] == '-') {
                ret[0] = 0;
                ret[1] = 0;

            } else if (board[1][1] == '0' && board[1][2] == '0' && board[1][0] == '-') {
                ret[0] = 1;
                ret[1] = 0;

            } else if (board[2][2] == '0' && board[1][2] == '0' && board[0][2] == '-') {
                ret[0] = 0;
                ret[1] = 2;

            } else if (board[2][0] == '0' && board[2][1] == '0' && board[2][2] == '-') {
                ret[0] = 2;
                ret[1] = 2;

            }
           else if (board[2][1] == '0' && board[2][2] == '0' && board[2][0] == '-') {
                ret[0] = 2;
                ret[1] = 0;

            }
           else if (board[0][0] == '0' && board[0][2] == '0' && board[0][1] == '-') {
                ret[0] = 0;
                ret[1] = 1;

            }
           else if (board[0][2] == '0' && board[2][2] == '0' && board[1][2] == '-') {
                ret[0] = 1;
                ret[1] = 2;

            }
           else if (board[2][0] == '0' && board[2][2] == '0' && board[2][1] == '-') {
                ret[0] = 2;
                ret[1] = 1;

            }
           else if (board[0][0] == '0' && board[2][2] == '0' && board[2][1] == '-') {
                ret[0] = 2;
                ret[1] = 1;

            }
           else if (board[0][0] == '0' && board[2][2] == '0' && board[1][1] == '-') {
                ret[0] = 0;
                ret[1] = 2;

            }
           else if (board[0][2] == '0' && board[2][0] == '0' && board[1][1] == '-') {
                ret[0] = 1;
                ret[1] = 1;

            }
           else if (board[0][0] == '0' && board[2][0] == '0' && board[1][0] == '-') {
                ret[0] = 1;
                ret[1] = 0;

            }
           else if (board[0][2] == '0' && board[2][2] == '0' && board[1][2] == '-') {
                ret[0] = 1;
                ret[1] = 2;

            }
           else if (board[0][1] == '0' && board[2][1] == '0' && board[1][1] == '-') {
                ret[0] = 1;
                ret[1] = 1;

            }
         else   if (board[1][0] == '0' && board[1][2] == '0' && board[1][1] == '-') {
                ret[0] = 0;
                ret[1] = 1;

            }

            return ret;
        }
        //</editor-fold>

//Module for Offensive Operation
        //<editor-fold desc="Offensive Operation">
        public static  int[] offMove() {

            int[] ret = new int[2];
            ret[0] = 5;

            if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == '-') {
                ret[0] = 0;
                ret[1] = 2;

            } else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == '-') {
                ret[0] = 2;
                ret[1] = 0;

            } else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == '-') {
                ret[0] = 2;
                ret[1] = 2;

            } else if (board[0][1] == 'X' && board[0][2] == 'X' && board[0][0] == '-') {
                ret[0] = 0;
                ret[1] = 0;

            } else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == '-') {
                ret[0] = 1;
                ret[1] = 1;
            } else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == '-') {
                ret[0] = 2;
                ret[1] = 0;

            } else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == '-') {
                ret[0] = 2;
                ret[1] = 2;

            } else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == '-') {
                ret[0] = 1;
                ret[1] = 2;

            } else if (board[1][0] == 'X' && board[2][0] == 'X' && board[0][0] == '-') {
                ret[0] = 0;
                ret[1] = 0;

            } else if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == '-') {
                ret[0] = 0;
                ret[1] = 2;

            } else if (board[2][1] == 'X' && board[1][1] == 'X' && board[0][1] == '-') {
                ret[0] = 0;
                ret[1] = 1;

            } else if (board[2][2] == 'X' && board[1][1] == 'X' && board[0][0] == '-') {
                ret[0] = 0;
                ret[1] = 0;

            } else if (board[1][1] == 'X' && board[1][2] == 'X' && board[1][0] == '-') {
                ret[0] = 1;
                ret[1] = 0;

            } else if (board[2][2] == 'X' && board[1][2] == 'X' && board[0][2] == '-') {
                ret[0] = 0;
                ret[1] = 2;

            } else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == '-') {
                ret[0] = 2;
                ret[1] = 2;

            }
            else if (board[2][1] == 'X' && board[2][2] == 'X' && board[2][0] == '-') {
                ret[0] = 2;
                ret[1] = 0;

            }
            else if (board[0][0] == 'X' && board[0][2] == 'X' && board[0][1] == '-') {
                ret[0] = 0;
                ret[1] = 1;

            }
           else if (board[0][2] == 'X' && board[2][2] == 'X' && board[1][2] == '-') {
                ret[0] = 1;
                ret[1] = 2;

            }
           else if (board[2][0] == 'X' && board[2][2] == 'X' && board[2][1] == '-') {
                ret[0] = 2;
                ret[1] = 1;

            }
           else if (board[0][0] == 'X' && board[2][2] == 'X' && board[2][1] == '-') {
                ret[0] = 2;
                ret[1] = 1;

            }
           else if (board[0][0] == 'X' && board[2][2] == 'X' && board[1][1] == '-') {
                ret[0] = 0;
                ret[1] = 2;

            }
           else if (board[0][2] == 'X' && board[2][0] == 'X' && board[1][1] == '-') {
                ret[0] = 1;
                ret[1] = 1;

            }
           else if (board[0][0] == 'X' && board[2][0] == 'X' && board[1][0] == '-') {
                ret[0] = 1;
                ret[1] = 0;

            }
           else if (board[0][2] == 'X' && board[2][2] == 'X' && board[1][2] == '-') {
                ret[0] = 1;
                ret[1] = 2;

            }
          else  if (board[0][1] == 'X' && board[2][1] == 'X' && board[1][1] == '-') {
                ret[0] = 1;
                ret[1] = 1;

            }
           else if (board[1][0] == 'X' && board[1][2] == 'X' && board[1][1] == '-') {
                ret[0] = 0;
                ret[1] = 1;

            }

            return ret;
        }
        //</editor-fold>

//Modules for No option
        // <editor-fold desc="NoOption Move">
    public static int[] noOption(){
        int[] ret = new int[2];
        ret[0] = 5 ;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            {
                if(board[i][j] == '-'){
                    ret[0] = i;
                    ret[1]=j;
                    break;
                }
            }
            if(ret[0]!=5){
                break;
            }

        }
return ret;
    }                   // end of move modules
// </editor-fold >

// To find the winner
        // <editor-fold desc="Finding the Winner">

    public static boolean whoWOn(){

        boolean win = false;

        // <editor-fold desc="Check if O win">
        if (board[0][0] == '0' && board[0][1] == '0' && board[0][2] == '0') {
            win = true;
            winner = '0';

        } else if (board[0][0] == '0' && board[1][0] == '0' && board[2][0] == '0') {
            win = true;
            winner = '0';

        } else if (board[0][0] == '0' && board[1][1] == '0' && board[2][2] == '0') {
            win = true;
            winner = '0';

        } else if (board[0][1] == '0' && board[0][2] == '0' && board[0][0] == '0') {
            win = true;
            winner = '0';

        } else if (board[0][1] == '0' && board[1][1] == '0' && board[2][1] == '0') {
            win = true;
            winner = '0';
        } else if (board[0][2] == '0' && board[1][1] == '0' && board[2][0] == '0') {
            win = true;
            winner = '0';

        } else if (board[0][2] == '0' && board[1][2] == '0' && board[2][2] == '0') {
            win = true;
            winner = '0';

        } else if (board[1][0] == '0' && board[1][1] == '0' && board[1][2] == '0') {
            win = true;
            winner = '0';

        } else if (board[1][0] == '0' && board[2][0] == '0' && board[0][0] == '0') {
            win = true;
            winner = '0';

        } else if (board[2][0] == '0' && board[1][1] == '0' && board[0][2] == '0') {
            win = true;
            winner = '0';

        } else if (board[2][1] == '0' && board[1][1] == '0' && board[0][1] == '0') {
            win = true;
            winner = '0';

        } else if (board[2][2] == '0' && board[1][1] == '0' && board[0][0] == '0') {
            win = true;
            winner = '0';

        } else if (board[1][1] == '0' && board[1][2] == '0' && board[1][0] == '0') {
            win = true;
            winner = '0';

        } else if (board[2][2] == '0' && board[1][2] == '0' && board[0][2] == '0') {
            win = true;
            winner = '0';

        } else if (board[2][0] == '0' && board[2][1] == '0' && board[2][2] == '0') {
            win = true;
            winner = '0';

        }
        else if (board[2][1] == '0' && board[2][2] == '0' && board[2][0] == '0') {
            win = true;
            winner = '0';

        }
        else if (board[0][0] == '0' && board[0][2] == '0' && board[0][1] == '0') {
            win = true;
            winner = '0';

        }
        else if (board[0][2] == '0' && board[2][2] == '0' && board[1][2] == '0') {
            win = true;
            winner = '0';

        }
        else if (board[2][0] == '0' && board[2][2] == '0' && board[2][1] == '0') {
            win = true;
            winner = '0';

        }
        else if (board[0][0] == '0' && board[2][2] == '0' && board[2][1] == '0') {
            win = true;
            winner = '0';

        }
        else if (board[0][0] == '0' && board[2][2] == '0' && board[1][1] == '0') {
            win = true;
            winner = '0';

        }
        else if (board[0][2] == '0' && board[2][0] == '0' && board[1][1] == '0') {
            win = true;
            winner = '0';

        }
        else if (board[0][0] == '0' && board[2][0] == '0' && board[1][0] == '0') {
            win = true;
            winner = '0';

        }
        else if (board[0][2] == '0' && board[2][2] == '0' && board[1][2] == '0') {
            win = true;
            winner = '0';

        }
        else if (board[0][1] == '0' && board[2][1] == '0' && board[1][1] == '0') {
            win = true;
            winner = '0';

        }
        else   if (board[1][0] == '0' && board[1][2] == '0' && board[1][1] == '0') {
            win = true;
            winner = '0';

        }
       // </editor-fold>

        //<editor-fold desc="Check if X win">
        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
            win = true;
            winner = 'X';

        } else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
            win = true;
            winner = 'X';

        } else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            win = true;
            winner = 'X';

        } else if (board[0][1] == 'X' && board[0][2] == 'X' && board[0][0] == 'X') {
            win = true;
            winner = 'X';

        } else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
            win = true;
            winner = 'X';
        } else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            win = true;
            winner = 'X';

        } else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
            win = true;
            winner = 'X';

        } else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
            win = true;
            winner = 'X';

        } else if (board[1][0] == 'X' && board[2][0] == 'X' && board[0][0] == 'X') {
            win = true;
            winner = 'X';

        } else if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X') {
            win = true;
            winner = 'X';

        } else if (board[2][1] == 'X' && board[1][1] == 'X' && board[0][1] == 'X') {
            win = true;
            winner = 'X';

        } else if (board[2][2] == 'X' && board[1][1] == 'X' && board[0][0] == 'X') {
            win = true;
            winner = 'X';

        } else if (board[1][1] == 'X' && board[1][2] == 'X' && board[1][0] == 'X') {
            win = true;
            winner = 'X';

        } else if (board[2][2] == 'X' && board[1][2] == 'X' && board[0][2] == 'X') {
            win = true;
            winner = 'X';

        } else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
            win = true;
            winner = 'X';

        }
        else if (board[2][1] == 'X' && board[2][2] == 'X' && board[2][0] == 'X') {
            win = true;
            winner = 'X';

        }
        else if (board[0][0] == 'X' && board[0][2] == 'X' && board[0][1] == 'X') {
            win = true;
            winner = 'X';

        }
        else if (board[0][2] == 'X' && board[2][2] == 'X' && board[1][2] == 'X') {
            win = true;
            winner = 'X';

        }
        else if (board[2][0] == 'X' && board[2][2] == 'X' && board[2][1] == 'X') {
            win = true;
            winner = 'X';

        }
        else if (board[0][0] == 'X' && board[2][2] == 'X' && board[2][1] == 'X') {
            win = true;
            winner = 'X';

        }
        else if (board[0][0] == 'X' && board[2][2] == 'X' && board[1][1] == 'X') {
            win = true;
            winner = 'X';

        }
        else if (board[0][2] == 'X' && board[2][0] == 'X' && board[1][1] == 'X') {
            win = true;
            winner = 'X';
        }
        else if (board[0][0] == 'X' && board[2][0] == 'X' && board[1][0] == 'X') {
            win = true;
            winner = 'X';

        }
        else if (board[0][2] == 'X' && board[2][2] == 'X' && board[1][2] == 'X') {
            win = true;
            winner = 'X';

        }
        else  if (board[0][1] == 'X' && board[2][1] == 'X' && board[1][1] == 'X') {
            win = true;
            winner = 'X';

        }
        else if (board[1][0] == 'X' && board[1][2] == 'X' && board[1][1] == 'X') {
            win = true;
            winner = 'X';

        }
        // </editor-fold>

        //<editor-fold desc="Check if Draw">
        boolean dash = true;
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    dash = false;
                }
            }
        }
            if(dash){
                win = true;
                winner = 'd';

            }



        //</editor-fold>

        return win;

    }


    //</editor-fold>


//Modules to find computer's move if human goes first

    public static void hmove() {

        //<editor-fold desc="Computer's First Move if Human goes first">
        if (counter == 1) {

            if (board[1][1] == '0') {
                Random rand = new Random();
                int f = rand.nextInt(4) + 1;
                if (f == 1) {
                    board[0][0] = 'X';
                    firstMove = "00";
                } else if (f == 2) {
                    board[0][2] = 'X';
                    firstMove = "02";

                } else if (f == 3) {
                    board[2][0] = 'X';
                    firstMove = "20";
                } else if (f == 4) {
                    board[2][2] = 'X';
                    firstMove = "22";
                } else {
                    board[2][2] = 'X';
                    firstMove = "22";
                }
            } else {
                board[1][1] = 'X';
                firstMove = "11";
            }
        }
        //</editor-fold>

        // <editor-fold desc="Second Move ">
        if (counter == 2) {

            int second[] = thirdMove();
            if (second[0] == 5) {

                if (board[1][1] != 'X') {
                    if (firstMove == "00" && board[0][2] == '-') {
                        board[0][3] = 'X';
                    } else if (firstMove == "00" && board[2][0] == '-') {
                        board[2][0] = 'X';
                    } else if (firstMove == "02" && board[0][0] == '-') {
                        board[0][0] = 'X';
                    } else if (firstMove == "02" && board[2][2] == '-') {
                        board[2][2] = 'X';
                    } else if (firstMove == "20" && board[0][0] == '-') {
                        board[0][0] = 'X';
                    } else if (firstMove == "20" && board[2][2] == '-') {
                        board[2][2] = 'X';
                    } else if (firstMove == "22" && board[2][0] == '-') {
                        board[2][0] = 'X';
                    } else if (firstMove == "22" && board[0][2] == '-') {
                        board[0][2] = 'X';
                    }
                } else {
                    if (board[0][0] == '-') {
                        board[0][0] = 'X';
                    } else if (board[0][2] == '-') {
                        board[0][2] = 'X';
                    }
                    if (board[2][0] == '-') {
                        board[2][0] = 'X';
                    }
                    if (board[2][2] == '-') {
                        board[2][2] = 'X';
                    }
                }

            }
            else{
                board[second[0]][second[1]] = 'X';
            }

        }
        // </editor-fold>


        // <editor-fold desc="Third Move if human chose First" >
        if(counter == 3){
            if(!end){
                int second[] = thirdMove();
                if(second[0] != 5){
                    board[second[0]][second[1]] ='X';
                }
                else{
                    int offMove[] = offMove();
                    if(offMove[0]!=5){
                        board[offMove[0]][offMove[1]] ='X';
                    }
                    else{
                        offMove = noOption();
                        board[offMove[0]][offMove[1]]= 'X';
                    }
                }
            }
            if(!end){
                end = true;
                winner = 'd';
            }
            whoWOn();
        }
// </editor-fold >

        // <editor-fold desc="Fourth Move if human chose First" >
        if(counter == 4){
            if(!end){
                int second[] = thirdMove();
                if(second[0] != 5){
                    board[second[0]][second[1]] ='X';
                }
                else{
                    int offMove[] = offMove();
                    if(offMove[0]!=5){
                        board[offMove[0]][offMove[1]] ='X';
                    }
                    else{
                        offMove = noOption();
                        board[offMove[0]][offMove[1]]= 'X';
                    }
                }
            }
            if(!end){
                end = true;
                winner = 'd';
            }
            whoWOn();
        }
// </editor-fold >

        // <editor-fold desc="Fifth Move if human chose First" >
        if(counter == 5){
            if(!end){
                int second[] = thirdMove();
                if(second[0] != 5){
                    board[second[0]][second[1]] ='X';
                }
                else{
                    int offMove[] = offMove();
                    if(offMove[0]!=5){
                        board[offMove[0]][offMove[1]] ='X';
                    }
                    else{
                        offMove = noOption();
                        board[offMove[0]][offMove[1]]= 'X';
                    }
                }
            }
            if(!end){
                end = true;
                winner = 'd';
            }
            whoWOn();
        }
// </editor-fold >

        counter ++;

    }

} // end of program
