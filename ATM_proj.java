import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM_proj extends JFrame{
    private JPanel panel;
    private JLabel messageLabel;
    private JLabel otherLabel;
    private JTextField otherTextField;
    private JButton enterButton;
    private JButton exitButton;
    private JButton withdrawButton;
    private JButton fivehundoButton;
    private final int WINDOW_WIDTH = 310;
    private final int WINDOW_HEIGHT = 100;

    public ATM_proj(){
        setTitle ("ATM Withdraw");
        setSize (WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);
        setVisible(true);

    }

    private void buildPanel(){
        messageLabel=new JLabel("How much would you like to withdraw?");
        
        enterButton = new JButton("20");
        withdrawButton = new JButton("50");
        exitButton=new JButton("100");
        fivehundoButton = new JButton("500");
        otherLabel = new JLabel("Other: ");
        otherTextField = new JTextField(10);
        fivehundoButton.addActionListener(new ButtonListener());



        panel=new JPanel();

        panel.add(messageLabel);
        panel.add(enterButton);
        panel.add(withdrawButton);
        panel.add(exitButton);
        panel.add(fivehundoButton);
        panel.add(otherLabel);
        panel.add(otherTextField);
        
    }
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String actionCommand = e.getActionCommand();

            if (actionCommand.equals("500")){
                JOptionPane.showMessageDialog(null, "You chose $500\nYour money is dispensing \nThank you for choosing ShalodiATM" );
                
            }
        }
    }

    public static void main(String[] args) {
        new ATM_proj();
    }

}

