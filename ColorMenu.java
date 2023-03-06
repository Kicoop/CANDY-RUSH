import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;

public class ColorMenu extends JFrame {

    JList colorList;
    private String[] colorNameArray = { "GRAY", "LIGHT GRAY", "WHITE", "BLACK" };
    private Color[] colorClassArray = { Color.GRAY, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK };

    ColorMenu() {
        // JLabel 
        JLabel label = new JLabel();
        label.setText("Choose background color");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        this.add(label);

        // Jlist 
        colorList = new JList(colorNameArray);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        colorList.setFont(new Font("Arial", Font.BOLD, 20));

        // Add event
        bgColorEventHandler handler = new bgColorEventHandler();
        colorList.addListSelectionListener(handler);

        this.add(colorList);

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

    // Event handler
    private class bgColorEventHandler implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent event) {

            CandyRush gp = new CandyRush(null);
            gp.gameBGColor = colorClassArray[colorList.getSelectedIndex()];

            // goes to player menu
            new DifficultyMenu();

            // closes color menu
            dispose();
            
        }
    }
}