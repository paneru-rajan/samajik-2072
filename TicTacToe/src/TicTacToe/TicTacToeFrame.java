package TicTacToe;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TicTacToeFrame extends JFrame {
    //indicate whose turn it is
    private char whoseTurn = 'x';
    public boolean gameOver = false;
    //create cell grid
    private Cell[][] cells = new Cell[3][3];
    // Create a status label
    JLabel jlblStatus = new JLabel("x's turn to play");

    public TicTacToeFrame() {
        //Panel to hold cells
        JPanel panel = new JPanel(new GridLayout(3, 3, 0, 0));
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                panel.add(cells[i][j] = new Cell());
        panel.setBorder(new LineBorder(Color.red, 1));
        jlblStatus.setBorder(new LineBorder(Color.yellow, 1));
        add(panel, BorderLayout.CENTER);
        add(jlblStatus, BorderLayout.SOUTH);
    }

    /* Determine if game board is full
     * if game is board is full return true, Otherwise False
     * */
    public boolean isFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (cells[i][j].getToken() == ' ')
                    return false;
        return true;
    }

    /* Determine if given token is won
    *  token to test for winning
    *  return true if the token has won, otherwise false
    */
    public boolean isWon(char token) {
        //Check Rows
        for (int i = 0; i < 3; i++)
            if ((cells[i][0].getToken() == token
                    && cells[i][1].getToken() == token
                    && cells[i][2].getToken() == token)) {
                return true;
            }
        //Check Columns
        for (int j = 0; j < 3; j++)
            if ((cells[0][j].getToken() == token
                    && cells[1][j].getToken() == token
                    && cells[2][j].getToken() == token)) {
                return true;
            }
//Check false
        return false;
    }

    public class Cell extends JPanel {
        //token of this cell
        private char token = ' ';

        public Cell() {
            setBorder(new LineBorder(Color.black, 1));
            addMouseListener(new Mouselistener());
        }

        public char getToken() {
            return token;
        }

        public void setToken(char c) {
            token = c;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (token == 'x') {
                g.drawLine(10, 10, getWidth() - 10, getHeight() - 10);
                g.drawLine(getWidth() - 10, 10, 10, getHeight() - 10);
            } else if (token == 'o') {
                g.drawOval(10, 10, getWidth() - 20, getHeight() - 20);
            }
        }

        private class Mouselistener extends MouseAdapter {
            @Override
            public void mouseClicked(MouseEvent e) {
                //if the cell is empty and the game is not over
                if (gameOver)
                    return;
                if (token == ' ' && whoseTurn != ' ')
                    setToken(whoseTurn);
                //Check game status

                if (isWon(whoseTurn)) {
                    jlblStatus.setText(whoseTurn + " Won! Game over");
                    whoseTurn = ' ';
                    gameOver = true;
                } else if (isFull()) {
                    jlblStatus.setText("Tie game! Game Over");
                    whoseTurn = ' ';
                    gameOver = true;
                } else {
                    whoseTurn = (whoseTurn == 'x') ? 'o' : 'x';
                    jlblStatus.setText(whoseTurn + "'s turn");
                }
            }
        }
    }
}



