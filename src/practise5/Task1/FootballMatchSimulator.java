package practise5.Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatchSimulator extends JFrame implements ActionListener {
    private int milanScore;
    private int realMadridScore;
    private final JLabel resultLabel;
    private final JLabel lastScorerLabel;
    private final JLabel winnerLabel;

    public FootballMatchSimulator(){
        setTitle("Футбольный матч");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton milanButton = new JButton("AC Milan");
        JButton realMadridButton = new JButton("Real Madrid");

        resultLabel = new JLabel("0 : 0");
        lastScorerLabel = new JLabel("Команды еще не забивали!");
        winnerLabel = new JLabel("Ничья");

        milanButton.addActionListener(this);
        realMadridButton.addActionListener(this);

        resultLabel.setHorizontalAlignment(JLabel.CENTER);
        lastScorerLabel.setHorizontalAlignment(JLabel.CENTER);
        winnerLabel.setHorizontalAlignment(JLabel.CENTER);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1, 2));
        topPanel.add(milanButton);
        topPanel.add(realMadridButton);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(3, 1));
        bottomPanel.add(winnerLabel);
        bottomPanel.add(resultLabel);
        bottomPanel.add(lastScorerLabel);

        setLayout(new GridLayout(3, 2));

        add(topPanel);
        add(bottomPanel);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getActionCommand().equals("AC Milan")){
             milanScore++;
             lastScorerLabel.setText("Последними забили AC Milan!");
         } else if(e.getActionCommand().equals("Real Madrid")){
             realMadridScore++;
             lastScorerLabel.setText("Последними забили Real Madrid!");
         }

         resultLabel.setText(milanScore + " : " + realMadridScore);

         if(milanScore > realMadridScore)
             winnerLabel.setText("Побеждает AC Milan");
         else if(realMadridScore > milanScore)
             winnerLabel.setText("Побеждает Real Madrid");
         else
             winnerLabel.setText("Ничья");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FootballMatchSimulator::new);
    }
}
