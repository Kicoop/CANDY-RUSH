import java.awt.*;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {
    MainMenu(){


        JLabel gname = new JLabel();
        gname.setText("Candy");
        gname.setFont(new Font("SERIF", Font.BOLD, 50));
        gname.setForeground(Color.CYAN);
        
        gname.setBounds(53, 30, 200, 50);
        this.add(gname);

        //JButton
        JButton button = new JButton("START");
       // button.setText("START");
        button.setFont(new Font("Arial", Font.BOLD, 15));
        button.setForeground(Color.CYAN);
        button.setBounds(100, 100, 100, 50);
        this.add(button);

        JLabel label = new JLabel();
        label.setText("Made by: BOANG INC ");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        this.add(label);

        this.setLayout(null);
        this.setTitle("Candy Crush");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200,700);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        //set background color of frame
        //lock frame
        this.setResizable(false);

        //background image
    //     JLabel background;
    // setSize(300,500);
    // setLayout(null);
    // setDefaultCloseOperation(EXIT_ON_CLOSE);
    // ImageIcon img =new ImageIcon("lib/bg.png");

    // background = new JLabel(img,JLabel.CENTER); 
    // background.setBounds(0,0,300,500);
    // add(background);
    // setVisible(true);

    EventHandler handler = new EventHandler();
        button.addActionListener(handler);
        this.add(button);
        
    }
    //Event Handler
    private class EventHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
             //open game frame
            //new GameFrame().setVisible(true);
            new ColorMenu();

            //Close main menu frame       
            dispose();
    
}
}
}