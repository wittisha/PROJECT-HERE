import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
public class TitleFrame extends JFrame implements ActionListener{
    
JButton startButton;

//seperate title frame for intro screen for more consice code.
    TitleFrame(){

        //label
        JLabel titleText = new JLabel();
        titleText.setText("Scream Park");
        this.add(titleText);
        titleText.setHorizontalAlignment(JLabel.CENTER);
        titleText.setVerticalAlignment(JLabel.TOP);
        titleText.setFont(new Font("MV Boli",Font.PLAIN,20));

        //frame
        this.setTitle("Scream Park");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(600,600);
        this.getContentPane().setBackground(new Color(0xFF4433));
        this.setVisible(true);

        //icon
        ImageIcon icon = new ImageIcon("src/logo.png");
        this.setIconImage(icon.getImage());

        //button
        startButton = new JButton();
        startButton.addActionListener(this);
        startButton.setBounds(200, 100, 150, 50);
        startButton.setText("Click To Begin!");
        this.add(startButton);

        //makes sure button prints properly
        this.repaint();
    }

    //closes this frame and opens the main game frame when button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //if(e.getSource()==startButton){
        //}
            this.setVisible(false);
            GameFrame game = new GameFrame();
            
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
