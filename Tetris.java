//main window containing all codes

import java.awt.*;

import javax.swing.*;

public class Tetris {
    public static void main(String[] args) throws Exception {
        int borderWidth = 540;
        int borderHeight = 440;
        // int gameBoardPanelWidth = 200;
        // int gameBoardPanelHeight = 400;
        // int perfect5x5Panel = 100; //width and height //apply for nextBlockPanel and buttons
        // int difficultyPanelWidth = 100;
        // int scoreBoardWidth = 140;
        // int scoreBoardHeight = 200;
        // int titlePanelWidth = 140;
        // int titlePanelHeight = 180;



        JFrame frame = new JFrame("Tetris");
        frame.setVisible(true);//allowing the window to show
        frame.setSize(borderWidth, borderHeight); //prefered size of the window
        frame.setLocationRelativeTo(null); //set the window to center
        frame.setResizable(true); //allow the user to resie the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminate the window when triggered
        

        JPanel tetrisPanel1 = new JPanel();
        tetrisPanel1.setPreferredSize(new Dimension(180, 440));
        tetrisPanel1.setBackground(Color.red);
        
        JPanel leaderboardPanel = new JPanel();
        leaderboardPanel.setBackground(Color.cyan);
        leaderboardPanel.setPreferredSize(new Dimension(180, 240));
        tetrisPanel1.add(leaderboardPanel);

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.magenta);
        titlePanel.setPreferredSize(new Dimension(180, 120));
        tetrisPanel1.add(titlePanel);

        JPanel namePanel = new JPanel();
        namePanel.setBackground(Color.black);
        namePanel.setPreferredSize(new Dimension(180, 80));
        tetrisPanel1.add(namePanel);

        JPanel tetrisPanel2 = new JPanel();
        tetrisPanel2.setLayout(new GridBagLayout());
        tetrisPanel2.setPreferredSize(new Dimension(220, 440));
        tetrisPanel2.setBackground(Color.green);

        
        JPanel gameBoardPanel = new JPanel(new GridLayout(20, 10));
        gameBoardPanel.setBackground(Color.orange);
        gameBoardPanel.setPreferredSize(new Dimension(200, 400)); // Adjusted size
        gameBoardPanel.setBorder(BorderFactory.createEmptyBorder()); // Adjusted border

        GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 1.0; // Horizontal weight
            gbc.weighty = 1.0; // Vertical weight
            gbc.fill = GridBagConstraints.BOTH; // Fill both directions
            tetrisPanel2.add(gameBoardPanel, gbc);
            
        for (int i = 0; i < 200; i++) {
            JPanel cellPanel = new JPanel();
            cellPanel.setPreferredSize(new Dimension(20, 20)); // Set cell size
            cellPanel.setBackground(Color.WHITE); // Set cell color
            cellPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Add border to make grid visible
            gameBoardPanel.add(cellPanel);
        }


        JPanel tetrisPanel3 = new JPanel();
        tetrisPanel3.setPreferredSize(new Dimension(120, 440));
        tetrisPanel3.setBackground(Color.blue);

        JPanel nextBlockPanel = new JPanel();
        nextBlockPanel.setBackground(Color.gray);
        nextBlockPanel.setPreferredSize(new Dimension(120, 140));
        tetrisPanel3.add(nextBlockPanel);

        for (int i = 0; i < 200; i++) {
            JPanel cellPanel = new JPanel();
            cellPanel.setPreferredSize(new Dimension(20, 20)); // Set cell size
            cellPanel.setBackground(Color.WHITE); // Set cell color
            cellPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Add border to make grid visible
            gameBoardPanel.add(cellPanel);
        }

        JPanel difficultyPanel = new JPanel();
        difficultyPanel.setBackground(Color.pink);
        difficultyPanel.setPreferredSize(new Dimension(120, 180));
        tetrisPanel3.add(difficultyPanel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.darkGray);
        buttonPanel.setPreferredSize(new Dimension(120, 120));
        tetrisPanel3.add(buttonPanel);

        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(tetrisPanel1);
        frame.getContentPane().add(tetrisPanel2);
        frame.getContentPane().add(tetrisPanel3);

        // TetrisGame tetrisGame = new TetrisGame(borderWidth, borderHeight);
        // frame.add(tetrisGame);
        frame.pack();
    }
}

//Panels
// Leaderboard
// Gameboard
// Nextblock
// Difficulty: panel1,2,3
// Buttons: panel1,2,3,4
// Title: panel1,2


// 1 block = 20
// Window size: 26 width x 22 height; 520x440
// GameBoardPanel size: 10 width x 20 height without border; 200x400
// NextBlockPanel size: 5x5 without border; 100x100
// DifficultyPanel: 5 width x 8 height without border; 100x160
// Buttons: 5X5 without border; 100x100
// ScoreBoard: 7 height x 10 width without border; 140x200
// TitlePanel: 7 width x 9 height without border;  140x180
