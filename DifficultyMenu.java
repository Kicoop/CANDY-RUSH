import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JButton;


import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    
public class DifficultyMenu extends JFrame {
    
    public boolean easyHandler;
    public boolean mediumHandler;
    public boolean hardHandler;
    public boolean easyButton;
    public boolean mediumButton;
    public boolean hardButton;
    DifficultyMenu() {
        // JLabel 
        JLabel label = new JLabel();
        label.setText("Game Difficulty");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        this.add(label);

        JButton easyButton = new JButton("EASY");
       // button.setText("START");
       easyButton.setFont(new Font("Arial", Font.BOLD, 15));
       easyButton.setForeground(Color.green);
       easyButton.setBounds(100, 100, 100, 50);
       EventHandler easyHandler = new EventHandler(50);
        easyButton.addActionListener(easyHandler);
        this.add(easyButton);

        JButton mediumButton = new JButton("MEDIUM");
        // button.setText("START");
        mediumButton.setFont(new Font("Arial", Font.BOLD, 15));
        mediumButton.setForeground(Color.yellow);
        mediumButton.setBounds(100, 100, 100, 50);
        EventHandler mediumHandler = new EventHandler(30);
        mediumButton.addActionListener(mediumHandler);
         this.add(mediumButton);

         JButton hardButton = new JButton("HARD");
         // button.setText("START");
         hardButton.setFont(new Font("Arial", Font.BOLD, 15));
         hardButton.setForeground(Color.red);
         hardButton.setBounds(100, 100, 100, 50);
         EventHandler hardHandler = new EventHandler(10);
         hardButton.addActionListener(hardHandler);
          this.add(hardButton);



    this.setLayout(new FlowLayout());
    this.setTitle("Candy Rush");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(1200,700);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    //set background color of frame
    this.getContentPane().setBackground(Color.MAGENTA);
    //lock frame
    this.setResizable(false);
}
    private class EventHandler implements ActionListener {
        int dropSpeed;

        //Constructor
        EventHandler(int speed){
            this.dropSpeed = speed;
        }

        public void actionPerformed(ActionEvent event){
            CandyRush cr = new CandyRush(null);
            Ball ball = new Ball(cr);
            ball.ballSpeed = dropSpeed;

            new GameFrame().setVisible(true);

            dispose();
        }
    }


}