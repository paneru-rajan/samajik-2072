package TicTacToe;

import sun.font.TrueTypeFont;

import javax.swing.*;

public class TicTacToe {
    public static void main(String[] args) {
        JFrame ticTacToe = new TicTacToeFrame();
        ticTacToe.setTitle("Sandesh TicTacToe Game");
        ticTacToe.setSize(500, 500);
        ticTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ticTacToe.setLocationRelativeTo(null);
        ticTacToe.setVisible(true);
    }
}
